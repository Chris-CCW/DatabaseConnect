package pkgDBconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {

	public static void ReadRecord() {

		System.out.println("Creating statement...");
		try {
			MainDB.stmt = MainDB.conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql2 = "SELECT actor_id, first_name, last_name FROM actor";
		ResultSet rs = null;
		try {
			rs = MainDB.stmt.executeQuery(sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				int actor_id = rs.getInt("actor_id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				System.out.println("ID: " + actor_id + ", first name: " + first_name + ", last_name: " + last_name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
