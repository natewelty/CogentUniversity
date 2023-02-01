package pkg.cogent.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	//step 2 Establish the connection
	Connection con = null;
	public static String url = "jdbc:mysql://localhost:3306/jdbc_db"; // /test_db will be the name of whatever database.
	public static String username = "root";
	public static String password = "root";

	public Connection getConn() {
		try {
			con = DriverManager.getConnection(url,username,password);
			if (con != null) {
				System.out.println("Connection established.");
			}

			//Step 3 Do whatever you want with the database
		} catch (SQLException e) {

			System.out.println("Connection failed.");
			e.printStackTrace();

		}
		return con;
	}
}
