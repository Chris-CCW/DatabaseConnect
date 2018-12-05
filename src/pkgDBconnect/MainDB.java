package pkgDBconnect;

import java.sql.Connection;
import java.sql.Statement;

public class MainDB {
	
	static Connection conn = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		Connect.accessDB();

	}

}
