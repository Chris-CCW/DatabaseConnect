package pkgDBconnect;

import java.sql.SQLException;

public class Create {

	public static void AddRecord() {
		System.out.println("Inserting records into the table...");
		try {
			MainDB.stmt = MainDB.conn.createStatement();
		} catch (SQLException e) {
			System.out.println("Failed to create statement");
			e.printStackTrace();
		}
		String sql = "INSERT INTO actor " + "VALUES (201, 'Fred', 'Bloggs', '2018-02-15 04:34:33')";
		try {
			MainDB.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Failed to insert record");
			e.printStackTrace();
		}
		System.out.println("End of insert code");
	}
}
