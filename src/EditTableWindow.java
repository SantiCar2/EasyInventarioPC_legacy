import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	 */
	public EditTableWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//DefaultTableModel tableModel = new DefaultTableModel(data, columnname);
		//table.setModel(tableModel);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(115, 134, 234, 380);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JComboBox comboBox = new JComboBox(getTableInfo.getColumnNames(login.buf, false));
		comboBox.setBounds(10, 29, 89, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				System.out.print("Cambiado");
			}
		});
	}
}
