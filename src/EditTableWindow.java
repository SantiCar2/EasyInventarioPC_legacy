import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class EditTableWindow {

	public static JFrame frame;
	private JTable table;

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
		
		Font font = Font.createFont(Font.TRUETYPE_FONT, new File("font.ttf"));
		font = font.deriveFont(Font.PLAIN, 15);
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, new File("font.ttf"));
		font2 = font2.deriveFont(Font.PLAIN, 25);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(font);
		ge.registerFont(font2);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 72, 234, 156);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		JComboBox<Object> comboBox = new JComboBox<Object>(getTableInfo.getColumnNames(login.buf, false));
		comboBox.setBounds(10, 41, 89, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				System.out.print("Cambiado");
				String[] columns = {"ID", comboBox.getSelectedItem().toString()};
				DefaultTableModel tableModel = new DefaultTableModel(getTableInfo.getTableInforID(login.buf, comboBox.getSelectedItem().toString()), columns);
				table.setModel(tableModel);
			}
		});
		String[] columns = {"ID", comboBox.getSelectedItem().toString()};
		DefaultTableModel tableModel = new DefaultTableModel(getTableInfo.getTableInforID(login.buf, comboBox.getSelectedItem().toString()), columns);
		table.setModel(tableModel);
		
	}
}
