import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.x.ResultMessageListener;

public class getTableInfo {
	final static String CONN = "jdbc:mysql://190.249.57.11:25565/databases";
	public static String[][] getValues(String tabliId){
		String list[][] = null;
		int row = 0;
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection CON = DriverManager.getConnection(CONN, "mainApp", "4815162342");
		Statement stmt = CON.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM `" + tabliId + "`");
		while(rs.next()) {
			row++;
			}
		list = new String[row][rs.getMetaData().getColumnCount()];
		CON.close();
		
		int row0 = 0;
		Connection CON0 = DriverManager.getConnection(CONN, "mainApp", "4815162342");
		Statement stmt0 = CON0.createStatement();
		ResultSet rs0 = stmt0.executeQuery("SELECT * FROM `" + tabliId + "`");
		while(rs0.next()) {
			row0++;
			for (int i = 1; i <= list[0].length; i++) {
				list[row0 - 1][i - 1] = rs0.getString(i);
			}
		}
		CON.close();
		
		
		}catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			list = new String[1][1]; 
			list[0][0] = "E " + e.toString(); 
		}
		return list;
	}
	
	public static String[] getColumnNames(String tableId) {
		String list[] = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection CON = DriverManager.getConnection(CONN, "mainApp", "4815162342");
			Statement stmt = CON.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM `" + tableId + "`");
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			list = new String[rsmd.getColumnCount()];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				list[i] = rsmd.getColumnLabel(i + 1).toString();
			}
			
			CON.close();
		}catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			list = new String[1]; 
			list[0] = "E " + e.toString(); 
		}
		return list;
	}
	
}
