import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	public static boolean auth = false;
	public static String buf = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 354, 141);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Intoduzca sus credenciales");
		lblNewLabel.setBounds(10, 11, 198, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 198, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 67, 198, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() != null && passwordField.getText() != null) {
					buf = authenticator.connect(textField.getText(), AES.encrypt(passwordField.getText(), AES.keyString));
					if(buf != null && !buf.contains("E")) {
						JOptionPane.showMessageDialog(null, "Se ha conectado exitosamente al servidor!" ,"Info", 1);
						auth = true;
					}else if (buf != null) {
						buf = buf.split(":", 2)[1];
						JOptionPane.showMessageDialog(null, buf ,"Error", 0);
					}else{
						JOptionPane.showMessageDialog(null, "Credenciales incorrectas" ,"Error", 0);
					}
				}
			}
		});
		btnNewButton.setBounds(239, 66, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
