import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Maint {

	public JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maint window = new Maint();
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
	public Maint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("EasyInventario");
		frame.setBounds(100, 100, 752, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] columnname = getTableInfo.getColumnNames(login.buf);
		String[][] data = getTableInfo.getValues(login.buf);
		
		for (int i = 0; i < columnname.length; i++) {
			System.out.println(columnname[i]);
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.println(data[i][j]);
			}
		}
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setLocation(12, 65);
	    scrollPane.setSize(712, 300);
	    frame.getContentPane().add(scrollPane);
	    
	    table = new JTable(data, columnname);
	    scrollPane.setViewportView(table);
	    table.setFillsViewportHeight(true);
		JLabel lblNewLabel = new JLabel("Tabla registrada en el servidor");
		lblNewLabel.setBounds(10, 11, 190, 14);

	}
}
