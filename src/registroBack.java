import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import java.util.Vector;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class registroBack {

	final static String CONN = "jdbc:mysql://190.249.57.11:25565/login";
	
	public static String getId() {
		Random rand = new Random();
		String id = String.format("%04d", rand.nextInt(10000));
		boolean different = false;
		boolean x = false;
		
		Vector<String> v = new Vector<String>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection CON = DriverManager.getConnection(CONN, "auth", "4815162342");
			Statement stmt = CON.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT tableid FROM main");
			while(rs.next()) {
				v.addElement(Integer.toString(rs.getInt("tableid")));
				while(id == Integer.toString(rs.getInt("tableid")) && !different) {
					x = true;
					id = String.format("%04d", rand.nextInt(10000));
					for (int i = 0; i < v.size(); i++) {
						if(v.get(i - 1) == id) {
							x = false;
						}
					}
					if(x) different = true;
				}
			}
			CON.close();
			
			
			
		} catch (Exception e) {

		}
		
		return id;
	}
	
	
	public static boolean registrar(String mail, String pass, String tableid) {
		
		if(checkmail(mail)) {
			JOptionPane.showMessageDialog(null, "El correo electronico ingresado\n ya está registrado.", "Error", 0);
			return false;
		}
		
		String from = "easyinventario@gmail.com";
		String password = "Proyecto2";
		Properties props = new Properties();  
		String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });
		
		boolean success = false;
		
		try {
			Connection CON = DriverManager.getConnection(CONN, "auth", "4815162342");
			Statement stmt = CON.createStatement();
			String query = "INSERT INTO `login`.`main` (`email`, `password`, `tableId`) VALUES ('" + mail + "', '" + pass + "', '" + tableid + "');";
			System.out.println(query);
			
			Random rand = new Random();
	 		String verif = String.format("%04d", rand.nextInt(10000));
			try {
		         MimeMessage message = new MimeMessage(session);
		         message.setFrom(new InternetAddress(from));
		         message.addRecipient(Message.RecipientType.TO, new InternetAddress(mail));
		         message.setSubject("Codigo de verificación de tu cuenta de EasyInventario");
		         message.setText("Su código de verificación es " + verif);

		         Transport.send(message);
		         System.out.println("Sent message successfully....");
		      } catch (MessagingException mex) {
		         mex.printStackTrace();
		      }
			 String code = JOptionPane.showInputDialog(null, "Introduzca el código que se envió al correo " + mail, "Verificación", JOptionPane.QUESTION_MESSAGE);
	         if(code.compareTo(verif) == 0) {
	        	 JOptionPane.showMessageDialog(null, "Se registrado exitosamente" ,"Info", 1);
	        	 stmt.executeUpdate(query);
	 			 CON.close();
	 			 success = true;
	         } else {
	        	 JOptionPane.showMessageDialog(null, "El código de verificación es incorrecto\n Intente nuevamente", "Error de verificación", 0);
	        	 CON.close();
	         }
			
			
		}catch (Exception e) {
			System.out.println(e);
			return success;
		}
		return success;
	}
	
	public static boolean checkmail(String mail) {
		boolean duplicate = false;
		try {
			Connection CON = DriverManager.getConnection(CONN, "auth", "4815162342");
			Statement stmt = CON.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT email FROM main");
			while(rs.next()) {
				if(rs.getString("email").compareTo(mail) == 0) {
					duplicate = true;
				}
			}
			CON.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return duplicate;
	}
}
