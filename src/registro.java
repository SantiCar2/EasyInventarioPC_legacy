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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JPanel;

public class registro {

	public static JFrame frmRegistro;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField columna1 = new JTextField();;
	private JTextField columna2 = new JTextField();;
	private JTextField columna3 = new JTextField();;
	private JTextField columna4 = new JTextField();;
	private JTextField textField_6;
	private JTextField columna5 = new JTextField();;
	
	public static String tableid = registroBack.getId();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro window = new registro();
					registro.frmRegistro.setVisible(true);
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
		
		columna1.setBounds(217, 83, 129, 20);
		frmRegistro.getContentPane().add(columna1);
		columna1.setColumns(10);
		
		columna2.setEditable(false);
		columna2.setColumns(10);
		columna2.setBounds(217, 139, 129, 20);
		frmRegistro.getContentPane().add(columna2);
		
		JLabel lblNombreDeColumna = new JLabel("Nombre de Columna 2:");
		lblNombreDeColumna.setBounds(217, 114, 168, 14);
		frmRegistro.getContentPane().add(lblNombreDeColumna);
		
		columna3.setEditable(false);
		columna3.setColumns(10);
		columna3.setBounds(217, 194, 129, 20);
		frmRegistro.getContentPane().add(columna3);
		
		JLabel lblNombreDeColumna_1 = new JLabel("Nombre de Columna 3:");
		lblNombreDeColumna_1.setBounds(217, 169, 168, 14);
		frmRegistro.getContentPane().add(lblNombreDeColumna_1);
		
		columna4.setEditable(false);
		columna4.setColumns(10);
		columna4.setBounds(217, 250, 129, 20);
		frmRegistro.getContentPane().add(columna4);
		
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
		
		columna5.setEditable(false);
		columna5.setColumns(10);
		columna5.setBounds(217, 305, 129, 20);
		frmRegistro.getContentPane().add(columna5);
		
		JLabel lblNombreDeColumna_3 = new JLabel("Nombre de Columna 5:");
		lblNombreDeColumna_3.setBounds(217, 280, 168, 14);
		frmRegistro.getContentPane().add(lblNombreDeColumna_3);
		
		JRadioButton stringCol1 = new JRadioButton("String");
		stringCol1.setSelected(true);
		stringCol1.setBounds(352, 82, 77, 23);
		frmRegistro.getContentPane().add(stringCol1);
		
		JRadioButton intCol1 = new JRadioButton("Int");
		intCol1.setBounds(431, 82, 58, 23);
		frmRegistro.getContentPane().add(intCol1);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(stringCol1);
		bg1.add(intCol1);
		
		JRadioButton stringCol2 = new JRadioButton("String");
		stringCol2.setSelected(true);
		stringCol2.setBounds(352, 136, 77, 23);
		frmRegistro.getContentPane().add(stringCol2);
		
		JRadioButton intCol2 = new JRadioButton("Int");
		intCol2.setBounds(431, 136, 58, 23);
		frmRegistro.getContentPane().add(intCol2);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(stringCol2);
		bg2.add(intCol2);
		
		JRadioButton stringCol3 = new JRadioButton("String");
		stringCol3.setSelected(true);
		stringCol3.setBounds(352, 194, 77, 23);
		frmRegistro.getContentPane().add(stringCol3);
		
		JRadioButton intCol3 = new JRadioButton("Int");
		intCol3.setBounds(431, 194, 58, 23);
		frmRegistro.getContentPane().add(intCol3);
		
		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(stringCol3);
		bg3.add(intCol3);
		
		JRadioButton stringCol4 = new JRadioButton("String");
		stringCol4.setSelected(true);
		stringCol4.setBounds(352, 246, 77, 23);
		frmRegistro.getContentPane().add(stringCol4);
		
		JRadioButton intCol4 = new JRadioButton("Int");
		intCol4.setBounds(431, 246, 58, 23);
		frmRegistro.getContentPane().add(intCol4);
		
		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(stringCol4);
		bg4.add(intCol4);
		
		JRadioButton stringCol5 = new JRadioButton("String");
		stringCol5.setSelected(true);
		stringCol5.setBounds(352, 301, 77, 23);
		frmRegistro.getContentPane().add(stringCol5);
		
		JRadioButton intCol5 = new JRadioButton("Int");
		intCol5.setBounds(431, 301, 58, 23);
		frmRegistro.getContentPane().add(intCol5);
		
		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(stringCol5);
		bg5.add(intCol5);
		
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
		
		JLabel lblNewLabel_4 = new JLabel("Su id de cliente \u00FAnico:");
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
				if(textField.getText() == "" || columna1.getText() == "" || textField_6.getText() == "" ||
						!textField_1.getText().contains("@") || passwordField.getText().length() < 5 || passwordField_1.getText().length() < 5 ) {
					JOptionPane.showMessageDialog(null, "Algún campo obligatorio puede estar vacío.\n El correo electronico puede estar invalido\n "
							+ "Recuerda que la contraseña debe tener más de 5 caracteres." ,"Error", 0);
				} else if(!AES.encrypt(passwordField.getText(), AES.keyString).contains(AES.encrypt(passwordField_1.getText(), AES.keyString))) {
					JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden" ,"Error", 0);
				} else {
					System.out.println("Info good " + AES.encrypt(passwordField.getText(), AES.keyString));
					
					if(/*registroBack.registrar(textField_1.getText(), AES.encrypt(passwordField.getText(), AES.keyString), tableid)*/ true) {
						textField.setText("");
						textField_1.setText("");
						columna1.setText("");
						columna2.setText("");
						columna3.setText("");
						columna4.setText("");
						textField_6.setText("");
						columna5.setText("");
						passwordField.setText("");
						passwordField_1.setText("");
						
						int numberOfCol = 0;
						String[] columnName;
						if(columna5.getText().length() == 0) {
							if(columna4.getText().length() == 0) {
								if(columna3.getText().length() == 0) {
									if(columna2.getText().length() == 0) {
										numberOfCol = 1;
										columnName = new String[1];
										System.out.println("1");
									} else {
										numberOfCol = 2;
										columnName = new String[2];
										System.out.println("2");
									}
								} else {
									numberOfCol = 3;
									columnName = new String[3];
									System.out.println("3");
								}
							} else {
								numberOfCol = 4;
								columnName = new String[4];
								System.out.println("4");
							}
						} else {
							numberOfCol = 5;
							columnName = new String[5];
							System.out.println("5");
						}
						
						System.out.println(columna1.getText());//NO SIREVEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
						
						for (int i = 0; i < columnName.length; i++) {
							if(i == 0) {
								columnName[i] = columna1.getText();
							}
							if(i == 1) {
								columnName[i] = columna2.getText();
							}
							if(i == 2) {
								columnName[i] = columna3.getText();
							}
							if(i == 3) {
								columnName[i] = columna4.getText();
							}
							if(i == 4) {
								columnName[i] = columna5.getText();
							}
						}
						
						System.out.println(columnName[0]);
						
						tableid = registroBack.getId();
						lblNewLabel_5.setText(tableid);
						frmRegistro.setVisible(false);
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
		
		columna1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
	            if (columna1.getText().length() <= 1 && ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
	            	columna2.setEditable(false);
	            	columna2.setText("");
	            	
	            	columna3.setEditable(false);
	            	columna3.setText("");
	            	
	            	columna4.setEditable(false);
	            	columna4.setText("");
	            	
	            	columna5.setEditable(false);
	            	columna5.setText("");
	            } else {
	            	columna2.setEditable(true);
	            }
			}
		});
		columna2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
	            if (columna2.getText().length() <= 1 && ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
	            	columna3.setEditable(false);
	            	columna3.setText("");
	            	
	            	columna4.setEditable(false);
	            	columna4.setText("");
	            	
	            	columna5.setEditable(false);
	            	columna5.setText("");
	            } else {
	            	columna3.setEditable(true);
	            }
			}
		});
		columna3.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
	            if (columna3.getText().length() <= 1 && ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
	            	columna4.setEditable(false);
	            	columna4.setText("");
	            	
	            	columna5.setEditable(false);
	            	columna5.setText("");
	            } else {
	            	columna4.setEditable(true);
	            }
			}
		});
		columna4.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
	            if (columna4.getText().length() <= 1 && ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
	            	columna5.setEditable(false);
	            	columna5.setText("");
	            } else {
	            	columna5.setEditable(true);
	            }
			}
		});
	}
}
