package cogent_university;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;





public class TestingStatement {

	public static void main(String[] args) {
		createTable();
		
	}
	
	public static void createTable() {
		try {
			
			Connection conn = new JDBCUtils().getConn();
			Statement statement = conn.createStatement();
			
			
			statement.execute("DROP TABLE test_db.employees;");
			
			
			String tableSql = "CREATE TABLE IF NOT EXISTS employees" 
					  + "(emp_id int PRIMARY KEY AUTO_INCREMENT, name varchar(30),"
					  + "position varchar(30), salary double)";
			
			
			statement.execute(tableSql);
			
			
			
			//statement.execute("INSERT INTO employees(name,position,salary) values('James', 'CEO',1000);");
			//statement.execute("INSERT INTO employees(name,position,salary) values('John', 'VP',1000);");
			//statement.execute("INSERT INTO employees(name,position,salary) values('Jacob', 'Manager',500);");
			String createEmployee = "INSERT INTO employees(name,position,salary) values(?,?,?);";
			PreparedStatement creator = conn.prepareStatement(createEmployee);
//			creator.setString(1, "Jingleheimer");
//			creator.setString(2, "Associate");
//			creator.setDouble(3,500);
//			creator.executeUpdate();
//			creator.setString(1, "Schmidt");
//			creator.setString(2, "Associate");
//			creator.setDouble(3,500);
//			creator.executeUpdate();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a name.");
			creator.setString(1,sc.next());
			System.out.println("Enter the position.");
			creator.setString(2, sc.next());
			System.out.println("Enter the salary.");
			creator.setDouble(3, sc.nextDouble());
			creator.executeUpdate();
			
			String sql = "select * from employees where emp_id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 1);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("emp_id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("position"));
				System.out.println(rs.getString("salary"));
			}
//	        
//			for(int i = 1; i<rs.getMetaData().; i++) {
//				pstmt.setInt(1, i);
//				ResultSet rs = pstmt.executeQuery();
//
//				while(rs.next()) {
//					System.out.println(rs.getInt("emp_id"));
//					System.out.println(rs.getString("name"));
//					System.out.println(rs.getString("position"));
//					System.out.println(rs.getString("salary"));
//				}
//			}
			
			PreparedStatement updater = conn.prepareStatement("update employees set name = ? where emp_id = ?;");
			updater.setString(1, "Jonah");
			updater.setInt(2, 1);
			updater.executeUpdate();
			pstmt.setInt(1, 1);
			ResultSet rs2 = pstmt.executeQuery();
			while(rs2.next()) {
				System.out.println(rs2.getInt("emp_id"));
				System.out.println(rs2.getString("name"));
				System.out.println(rs2.getString("position"));
				System.out.println(rs2.getString("salary"));
			}
			
			CallableStatement cstmt = conn.prepareCall("{call GetAllProducts()}");
			cstmt.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}


