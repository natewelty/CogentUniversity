package pkg.cogent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import pfg.cogent.exception.MandatoryFieldException;
import pkg.cogent.model.Customer;



public class CustomerDAOJDBCImpl implements CustomerDAO {

	Connection conn;
	Statement stmnt; 
	PreparedStatement creator,readerAll, readerID, readerName, updater, deleter;
	Scanner sc;
	
	public CustomerDAOJDBCImpl() {
		
		try {
			conn = new JDBCUtils().getConn();
			stmnt = conn.createStatement();
			stmnt.execute("CREATE TABLE IF NOT EXISTS customers" 
					  + "(CId int PRIMARY KEY AUTO_INCREMENT, cEmail varchar(30),"
					  + "cName varchar(30), cDoB DATE)");
			creator = conn.prepareStatement("INSERT INTO customers(cEmail,cName,cDoB) values(?,?,?);");
			readerAll = conn.prepareStatement("select * from customers;");
			readerID = conn.prepareStatement("select * from customers where cId = ?;");
			readerName = conn.prepareStatement("select * from customers where cName = ?;");
			updater = conn.prepareStatement("update customers set cEmail = ?, cName = ?, cDoB = ?, where cId = ?;");
			deleter = conn.prepareStatement("delete from customers where cId = ?;");
			sc = new Scanner(System.in);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void create() {
		System.out.println("Please enter customer ID.");
		int cId = sc.nextInt();
		if(cId==0) {
			throw new MandatoryFieldException("Customer ID is a mandatory field.");
		}
		System.out.println("Please enter customer name.");
		String cName = sc.next();
		if(cName==null) {
			throw new MandatoryFieldException("Customer name is a mandatory field.");
		}
		System.out.println("Please enter customer email.");
		String cEmail = sc.next();
		if(cEmail==null) {
			throw new MandatoryFieldException("Customer email is a mandatory field.");
		}
		System.out.println("Please enter customer date of birth(YYYY-MM-DD).");
		String cDoB = sc.next();
		if(cDoB==null) {
			throw new MandatoryFieldException("Customer date of birth is a mandatory field.");
		}
		try {
			creator.setInt(1, cId);
			creator.setString(2, cEmail);
			creator.setString(3, cName);
			creator.setString(4, cDoB);
			int completed = creator.executeUpdate();
			if(completed==1) {
				System.out.println("Record saved.");
			}
			else {
				System.out.println("An error occurred.");
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}

	}

	@Override
	public void read() {
		try {
			ResultSet rs = readerAll.executeQuery();
			while(rs.next()) {
				Customer temp = new Customer(rs.getInt("emp_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(String cId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String cId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findById(String cId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findYoungest() {
		// TODO Auto-generated method stub

	}

}
