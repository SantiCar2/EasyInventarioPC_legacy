import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.util.StringUtils;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;

public class EditTableWindow {

	public static JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblNewLabel_3 = new JLabel("");
	boolean validated = false;
	JButton btnNewButton_2 = new JButton("Guardar cambios");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditTableWindow window = new EditTableWindow();
					EditTableWindow.frame.setVisible(true);
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
	public EditTableWindow() throws FontFormatException, IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	private void initialize() throws FontFormatException, IOException {
		
		Font font = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\santi\\eclipse-workspace\\Proyecto 2\\font.ttf"));
		font = font.deriveFont(Font.PLAIN, 15);
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\santi\\eclipse-workspace\\Proyecto 2\\font.ttf"));
		font2 = font2.deriveFont(Font.PLAIN, 25);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(font);
		ge.registerFont(font2);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 91, 234, 328);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		JComboBox<Object> comboBox = new JComboBox<Object>(getTableInfo.getColumnNames(login.buf, false));
		comboBox.setBounds(10, 60, 89, 25);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambiado");
				String[] columns = {"ID", comboBox.getSelectedItem().toString()};
				DefaultTableModel tableModel = new DefaultTableModel(getTableInfo.getTableInforID(login.buf, comboBox.getSelectedItem().toString()), columns);
				table.setModel(tableModel);
			}
		});
		comboBox.setFont(font);
		String[] columns = {"ID", comboBox.getSelectedItem().toString()};
		DefaultTableModel tableModel = new DefaultTableModel(getTableInfo.getTableInforID(login.buf, comboBox.getSelectedItem().toString()), columns);
		table.setModel(tableModel);
		
		JLabel lblNewLabel = new JLabel("Edici\u00F3n de tablas");
		lblNewLabel.setBounds(10, 11, 209, 42);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(font2);
		
		JButton btnNewButton = new JButton("?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "La tabla que se encuentra a la izquierda de la ventana\n"
						+ "sirve para poder conocer el ID de la fila que desee editar\n"
						+ "ese ID lo necesitarás para poder realizar la edición de la información.","Info", 1);
			}
		});
		btnNewButton.setBounds(201, 60, 43, 25);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setFont(font);
		
		textField = new JTextField();
		textField.setDisabledTextColor(Color.WHITE);
		textField.setBounds(323, 95, 71, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
	            	textField.setEditable(true);
	            	validated = false;
	            	lblNewLabel_3.setIcon(new ImageIcon(EditTableWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
	            	btnNewButton_2.setEnabled(false);
	            	textField_1.setText("");
	            } else {
	            	textField.setEditable(false);
	            }
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(323, 60, 25, 21);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(font);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>(getTableInfo.getColumnNames(login.buf, false));
		comboBox_1.setBounds(537, 93, 128, 25);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.setFont(font);
		comboBox_1.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cambiado 1");
				if(textField.getText().length() != 0 && validated) {
					String oldInfo = getTableInfo.getOldInfo(login.buf, comboBox_1.getSelectedItem().toString(), Integer.parseInt(textField.getText()));
					textField_1.setText(oldInfo);
				}
				
			}
		});
		
		JLabel lblColumnaAEditar = new JLabel("Columna a editar:");
		lblColumnaAEditar.setFont(new Font("Brutal Type", Font.PLAIN, 15));
		lblColumnaAEditar.setBounds(537, 60, 128, 21);
		frame.getContentPane().add(lblColumnaAEditar);
		lblColumnaAEditar.setFont(font);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(323, 242, 148, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(font);
		
		JLabel lblNewLabel_2 = new JLabel("Informaci\u00F3n anterior:");
		lblNewLabel_2.setBounds(323, 206, 148, 25);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(font);
		
		
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(EditTableWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		lblNewLabel_3.setBounds(344, 56, 43, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Validar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getTableInfo.isID(login.buf, Integer.parseInt(textField.getText()))) {
					lblNewLabel_3.setIcon(getImageIcon(new File("check.png")));
					btnNewButton_2.setEnabled(true);
					validated = true;
					String oldInfo = getTableInfo.getOldInfo(login.buf, comboBox_1.getSelectedItem().toString(), Integer.parseInt(textField.getText()));
					textField_1.setText(oldInfo);
				} else {
					validated = false;
					lblNewLabel_3.setIcon(new ImageIcon(EditTableWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
					JOptionPane.showMessageDialog(null, "El ID no existe." ,"Error", 0);
				}
			}
		});
		btnNewButton_1.setBounds(323, 131, 96, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setFont(font);
		
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setFont(font);
		btnNewButton_2.setBounds(662, 396, 209, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
	@SuppressWarnings("finally")
	public ImageIcon getImageIcon(File f)
    {
		ImageIcon ii = null;
        try
        {
            Image im = ImageIO.read(f);
            ii = new ImageIcon(im);
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        finally
        {
            return ii;
        }
    }
}
