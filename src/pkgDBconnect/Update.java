package pkgDBconnect;

import java.sql.SQLException;

public class Update {

	public static void updateRecord() {

		System.out.println("Creating statement...");
		try {
			MainDB.stmt = MainDB.conn.createStatement();
		} catch (SQLException e) {
			System.out.println("Error while creating UPDATE statement");
			e.printStackTrace();
		}
		String sql3 = "UPDATE actor " + "SET last_name = 'Briggs' WHERE actor_id =201";
		try {
			MainDB.stmt.executeUpdate(sql3);
		} catch (SQLException e) {
			System.out.println("Error while executing UPDATE statement");
			e.printStackTrace();
		}
		System.out.println("End of update code");
	}

}
