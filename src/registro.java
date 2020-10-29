import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JFrame;
import java.awt.Window.Type;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.UIManager;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;

public class registro {

	public static JFrame frmRegistro;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	public static String tableid = registroBack.getId();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro window = new registro();
					window.frmRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	public registro() throws FontFormatException, IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	private void initialize() throws FontFormatException, IOException {
		
		Font font = Font.createFont(Font.TRUETYPE_FONT, new File("font.ttf"));
		font = font.deriveFont(Font.PLAIN, 15);
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, new File("font.ttf"));
		font2 = font2.deriveFont(Font.PLAIN, 25);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(font);
		ge.registerFont(font2);
		
		
		
		frmRegistro = new JFrame();
		frmRegistro.setAutoRequestFocus(false);
		frmRegistro.setAlwaysOnTop(true);
		frmRegistro.setType(Type.POPUP);
		frmRegistro.setResizable(false);
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 742, 340);
		frmRegistro.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		frmRegistro.setUndecorated(true);
		frmRegistro.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		JLabel lblNewLabel = new JLabel("Nombres*:");
		lblNewLabel.setBounds(12, 58, 111, 14);
		frmRegistro.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 83, 170, 20);
		frmRegistro.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo Electronico*:");
		lblNewLabel_1.setBounds(12, 169, 147, 14);
		frmRegistro.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 194, 170, 20);
		frmRegistro.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a*:");
		lblNewLabel_2.setBounds(12, 225, 94, 14);
		frmRegistro.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(12, 249, 170, 20);
		frmRegistro.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(12, 304, 170, 20);
		frmRegistro.getContentPane().add(passwordField_1);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a*:");
		lblConfirmarContrasea.setBounds(12, 280, 170, 14);
		frmRegistro.getContentPane().add(lblConfirmarContrasea);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre de Columna 1*:");
		lblNewLabel_3.setBounds(217, 58, 168, 14);
		frmRegistro.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(217, 83, 129, 20);
		frmRegistro.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 139, 129, 20);
		frmRegistro.getContentPane().add(textField_3);
		
		JLabel lblNombreDeColumna = new JLabel("Nombre de Columna 2:");
		lblNombreDeColumna.setBounds(217, 114, 168, 14);
		frmRegistro.getContentPane().add(lblNombreDeColumna);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(217, 194, 129, 20);
		frmRegistro.getContentPane().add(textField_4);
		
		JLabel lblNombreDeColumna_1 = new JLabel("Nombre de Columna 3:");
		lblNombreDeColumna_1.setBounds(217, 169, 168, 14);
		frmRegistro.getContentPane().add(lblNombreDeColumna_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(217, 250, 129, 20);
		frmRegistro.getContentPane().add(textField_5);
		
		JLabel lblNombreDeColumna_2 = new JLabel("Nombre de Columna 4:");
		lblNombreDeColumna_2.setBounds(217, 225, 168, 14);
		frmRegistro.getContentPane().add(lblNombreDeColumna_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(12, 139, 170, 20);
		frmRegistro.getContentPane().add(textField_6);
		
		JLabel lblApellidos = new JLabel("Apellidos*:");
		lblApellidos.setBounds(12, 114, 111, 14);
		frmRegistro.getContentPane().add(lblApellidos);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(217, 305, 129, 20);
		frmRegistro.getContentPane().add(textField_7);
		
		JLabel lblNombreDeColumna_3 = new JLabel("Nombre de Columna 5:");
		lblNombreDeColumna_3.setBounds(217, 280, 168, 14);
		frmRegistro.getContentPane().add(lblNombreDeColumna_3);
		
		JRadioButton String1 = new JRadioButton("String");
		String1.setSelected(true);
		String1.setBounds(352, 82, 77, 23);
		frmRegistro.getContentPane().add(String1);
		
		JRadioButton Int1 = new JRadioButton("Int");
		Int1.setBounds(431, 82, 58, 23);
		frmRegistro.getContentPane().add(Int1);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(String1);
		bg1.add(Int1);
		
		JRadioButton String2 = new JRadioButton("String");
		String2.setBounds(352, 136, 77, 23);
		frmRegistro.getContentPane().add(String2);
		
		JRadioButton Int2 = new JRadioButton("Int");
		Int2.setBounds(431, 136, 58, 23);
		frmRegistro.getContentPane().add(Int2);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(String2);
		bg2.add(Int2);
		
		JRadioButton String3 = new JRadioButton("String");
		String3.setBounds(352, 194, 77, 23);
		frmRegistro.getContentPane().add(String3);
		
		JRadioButton Int3 = new JRadioButton("Int");
		Int3.setBounds(431, 194, 58, 23);
		frmRegistro.getContentPane().add(Int3);
		
		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(String3);
		bg3.add(Int3);
		
		JRadioButton String4 = new JRadioButton("String");
		String4.setBounds(352, 246, 77, 23);
		frmRegistro.getContentPane().add(String4);
		
		JRadioButton Int4 = new JRadioButton("Int");
		Int4.setBounds(431, 246, 58, 23);
		frmRegistro.getContentPane().add(Int4);
		
		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(String4);
		bg4.add(Int4);
		
		JRadioButton String5 = new JRadioButton("String");
		String5.setBounds(352, 301, 77, 23);
		frmRegistro.getContentPane().add(String5);
		
		JRadioButton Int5 = new JRadioButton("Int");
		Int5.setBounds(431, 301, 58, 23);
		frmRegistro.getContentPane().add(Int5);
		
		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(String5);
		bg5.add(Int5);
		
		JTextArea Txt = new JTextArea();
		Txt.setBackground(UIManager.getColor("Button.background"));
		Txt.setWrapStyleWord(true);
		Txt.setText("La columna \"id\" ser\u00E1 generada automaticamente. ");
		Txt.setLineWrap(true);
		Txt.setEditable(false);
		Txt.setBounds(512, 83, 216, 48);
		frmRegistro.getContentPane().add(Txt);
		
		JTextArea Txt2 = new JTextArea();
		Txt2.setWrapStyleWord(true);
		Txt2.setText("En el caso de necesitar menos de 5 columnas, dejar en blanco.");
		Txt2.setLineWrap(true);
		Txt2.setFont(new Font("Brutal Type", Font.PLAIN, 15));
		Txt2.setEditable(false);
		Txt2.setBackground(SystemColor.menu);
		Txt2.setBounds(512, 142, 216, 74);
		frmRegistro.getContentPane().add(Txt2);
		
		JLabel lblNewLabel_4 = new JLabel("Su id de cliente unico:");
		lblNewLabel_4.setBounds(512, 228, 160, 14);
		frmRegistro.getContentPane().add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_5 = new JLabel(tableid);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(571, 255, 80, 31);
		frmRegistro.getContentPane().add(lblNewLabel_5);
		

		lblApellidos.setFont(font);
		lblConfirmarContrasea.setFont(font);
		lblNewLabel.setFont(font);
		lblNewLabel_1.setFont(font);
		lblNewLabel_2.setFont(font);
		lblNewLabel_3.setFont(font);
		lblNombreDeColumna.setFont(font);
		lblNombreDeColumna_1.setFont(font);
		lblNombreDeColumna_2.setFont(font);
		lblNombreDeColumna_3.setFont(font);
		Txt.setFont(font);
		Txt2.setFont(font);
		lblNewLabel_4.setFont(font);
		lblNewLabel_5.setFont(font2);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == "" || textField_2.getText() == "" || textField_6.getText() == "" ||
						!textField_1.getText().contains("@") || passwordField.getText().length() < 5 || passwordField_1.getText().length() < 5) {
					JOptionPane.showMessageDialog(null, "Algún campo obligatorio puede estar vacío.\n El correo electronico puede estar invalido\n "
							+ "Recuerda que la contraseña debe tener más de 5 caracteres." ,"Error", 0);
				} else if(!AES.encrypt(passwordField.getText(), AES.keyString).contains(AES.encrypt(passwordField_1.getText(), AES.keyString))) {
					JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden" ,"Error", 0);
				} else {
					System.out.println("Info good " + AES.encrypt(passwordField.getText(), AES.keyString));
					
					if(registroBack.registrar(textField_1.getText(), AES.encrypt(passwordField.getText(), AES.keyString), tableid)) {
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						passwordField.setText("");
						passwordField_1.setText("");
						tableid = registroBack.getId();
						lblNewLabel_5.setText(tableid);
						frmRegistro.dispose();
					} else {
						passwordField.setText("");
						passwordField_1.setText("");
						tableid = registroBack.getId();
						lblNewLabel_5.setText(tableid);
					}
					
					
			        }
			}
		});
		btnNewButton.setBounds(623, 301, 107, 23);
		frmRegistro.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.registrando = false;
				frmRegistro.dispose();
			}
		});
		btnNewButton_1.setBounds(512, 301, 99, 23);
		frmRegistro.getContentPane().add(btnNewButton_1);
		
		btnNewButton.setFont(font);
		btnNewButton_1.setFont(font);
		
		JLabel lblNewLabel_6 = new JLabel("Registro");
		lblNewLabel_6.setBounds(12, 12, 111, 34);
		frmRegistro.getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setFont(font2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(497, 8, 2, 316);
		frmRegistro.getContentPane().add(separator);
		
	}
}
