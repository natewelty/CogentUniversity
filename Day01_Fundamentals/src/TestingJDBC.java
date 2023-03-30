import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class TestingJDBC {
	public static void main(String[] args) {
		Connection con = null;
		
		//step 1 load driver class (inside the JAR file in referenced libraries, from /programfiles(x86)/mysql/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //this is the driver name for mysql 8 
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		
		//step 2 Establish the connection
		String url = "jdbc:mysql://localhost:3306/test_db"; // /test_db will be the name of whatever database.
		String username = "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url,username,password);
			if (con != null) {
				System.out.println("Connection established.");
				PreparedStatement creator = con.prepareStatement("INSERT INTO dates(now, notnow) values(?,?);");
				OffsetDateTime timeNow = OffsetDateTime.now();
				OffsetDateTime timeThen = timeNow.plusHours(3);
				creator.setObject(1, timeNow);
				creator.setObject(2, timeThen);
				System.out.println(timeNow);
				System.out.println(timeThen);
				PreparedStatement readerAll = con.prepareStatement("select * from dates;");
				creator.execute();
				ResultSet rs = readerAll.executeQuery();
				while(rs.next()) {
					System.out.println( OffsetDateTime.ofInstant(Instant.ofEpochMilli(rs.getTimestamp(1).getTime()),ZoneId.of("UTC")));
					System.out.println(OffsetDateTime.ofInstant(Instant.ofEpochMilli(rs.getTimestamp(2).getTime()),ZoneId.of("UTC")));
				}
			}
			
			//Step 3 Do whatever you want with the database
		} catch (SQLException e) {
			
			System.out.println("Connection failed.");
			e.printStackTrace();
		}finally {
			try {
				//Step 4 close the database
				con.close();
				System.out.println("The connection is closed.");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
