import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Vector;

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
			
			
			
		} catch (Exception e) {

		}
		return id;
	}
}
