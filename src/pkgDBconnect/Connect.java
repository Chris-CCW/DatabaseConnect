package pkgDBconnect;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/sakila";
	static final String USER = "root";
	static final String PASS = "S4kur4uch1R1k0";

	public static void accessDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Connecting to database...");
		try {
			MainDB.conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void disconnectDB() {
		System.out.println("Disconnecting from database...");
		try {
			if (MainDB.stmt != null)
				MainDB.conn.close();
		} catch (SQLException se) {
		}
		try {
			if (MainDB.conn != null)
				MainDB.conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		System.out.println("Connection closed.");
	}
}
