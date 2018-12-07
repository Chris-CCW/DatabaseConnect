package pkgDBconnect;

import java.sql.SQLException;

public class Delete {

	public static void deleteRecord() {
		System.out.println("Creating statement...");
		try {
			MainDB.stmt = MainDB.conn.createStatement();
		} catch (SQLException e) {
			System.out.println("Error while creating UPDATE statement");
			e.printStackTrace();
		}
		String sql4 = "DELETE FROM actor " + "WHERE actor_id = 201";
		try {
			MainDB.stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			System.out.println("Error while executing DELETE statement");
			e.printStackTrace();
		}

	}

}
