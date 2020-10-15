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

	public JFrame frmInicioDeSesin;
	private JTextField txtCorreo;
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
					window.frmInicioDeSesin.setVisible(true);
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
		frmInicioDeSesin = new JFrame();
		frmInicioDeSesin.setTitle("Inicio de sesi\u00F3n");
		frmInicioDeSesin.setBounds(100, 100, 435, 163);
		frmInicioDeSesin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicioDeSesin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Intoduzca sus credenciales");
		lblNewLabel.setBounds(10, 11, 136, 14);
		frmInicioDeSesin.getContentPane().add(lblNewLabel);
		
		txtCorreo = new JTextField();
		txtCorreo.setToolTipText("Usuario");
		txtCorreo.setBounds(10, 48, 198, 20);
		frmInicioDeSesin.getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 92, 198, 20);
		frmInicioDeSesin.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCorreo.getText() != null && passwordField.getText() != null) {
					buf = authenticator.connect(txtCorreo.getText(), AES.encrypt(passwordField.getText(), AES.keyString));
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
		btnNewButton.setBounds(317, 91, 89, 23);
		frmInicioDeSesin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(10, 34, 46, 14);
		frmInicioDeSesin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setBounds(10, 78, 89, 14);
		frmInicioDeSesin.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Registro");
		btnNewButton_1.setBounds(216, 91, 89, 23);
		frmInicioDeSesin.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Olvid\u00E9 mi contrase\u00F1a");
		btnNewButton_2.setBounds(216, 47, 190, 23);
		frmInicioDeSesin.getContentPane().add(btnNewButton_2);
	}
}
