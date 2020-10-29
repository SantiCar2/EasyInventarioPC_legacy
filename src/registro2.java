import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class registro2 extends JFrame {

	public static JPanel contentPane;
	private double precio = 12.99;
	private JTextField textField;
	private JTextField textField_1;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro2 frame = new registro2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	public registro2() throws FontFormatException, IOException {
		Font font = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\santi\\eclipse-workspace\\Proyecto 2\\font.ttf"));
		font = font.deriveFont(Font.PLAIN, 15);
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\santi\\eclipse-workspace\\Proyecto 2\\font.ttf"));
		font2 = font2.deriveFont(Font.PLAIN, 25);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(font);
		ge.registerFont(font2);
		
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Solo un paso m\u00E1s...");
		lblNewLabel.setBounds(10, 11, 240, 36);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(font2);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de tarjeta de credito o d\u00E9bito:");
		lblNewLabel_1.setBounds(10, 58, 270, 20);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(font);
		
		JLabel label = new JLabel();
		label.setBounds(10, 112, 353, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(10, 82, 310, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setFont(font);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox.setBounds(10, 162, 62, 30);
		contentPane.add(comboBox);
		comboBox.setFont(font);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de vencimiento:");
		lblNewLabel_2.setBounds(10, 137, 162, 19);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(font);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024", "2025", "2026"}));
		comboBox_1.setBounds(82, 162, 84, 30);
		contentPane.add(comboBox_1);
		comboBox_1.setFont(font);
		
		JLabel lblCdigoDeSeguridad = new JLabel("CVV:");
		lblCdigoDeSeguridad.setFont(new Font("Brutal Type", Font.PLAIN, 15));
		lblCdigoDeSeguridad.setBounds(234, 137, 48, 19);
		contentPane.add(lblCdigoDeSeguridad);
		lblCdigoDeSeguridad.setFont(font);
		
		textField_1 = new JTextField();
		textField_1.setBounds(234, 162, 86, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("Svisa.png"));
		lblNewLabel_3.setBounds(10, 203, 91, 55);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("master1.png"));
		label_1.setBounds(107, 203, 62, 55);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_4 = new JLabel("$ " + Double.toString(precio) + " USD");
		lblNewLabel_4.setBounds(344, 159, 162, 30);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setFont(font2);
		
		textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				String value = textField.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' && l <= 15 || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
	               textField.setEditable(true);
	               label.setText("");
	            } else {
	            	textField.setEditable(false);
	               label.setText("*Solo se admiten números y un maximo de 16 carácteres");
	            }
			}
		});
	}
}
