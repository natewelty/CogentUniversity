package pkg.cogent.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import pkg.cogent.model.Product;

public class ProductDAOImpl implements ProductDAO {
	Connection conn;
	Statement stmnt;
	PreparedStatement creator, readerAll, readerID, readerCat, updater, deleter, deleteCat, priceSort, expiredProduct;
	Scanner scDAO = new Scanner(System.in);

	public ProductDAOImpl() {
		super();
		try {
			conn = new JDBCUtils().getConn();
			stmnt = conn.createStatement();
			stmnt.execute(
					"CREATE TABLE IF NOT EXISTS products" + "(ID int PRIMARY KEY AUTO_INCREMENT, name varchar(30),"
							+ "cat varchar(30), manufacture_date DATE, exp_date DATE, price double)");
			creator = conn.prepareStatement(
					"INSERT INTO products(name, cat, manufacture_date, exp_date, price) values(?,?,?,?,?);");
			readerAll = conn.prepareStatement("select * from products;");
			readerID = conn.prepareStatement("select * from products where ID = ?;");
			readerCat = conn.prepareStatement("select * from products where cat = ?;");
			updater = conn.prepareStatement(
					"update products set name = ?, cat = ?, manufacture_date = ?, exp_date = ?, price = ? where ID = ?;");
			deleter = conn.prepareStatement("delete from products where ID = ?;");
			deleteCat = conn.prepareStatement("delete from products where cat = ?;");
			priceSort = conn.prepareStatement("select * from products where cat = ? order by price;");
			expiredProduct = conn.prepareStatement("select * from products where exp_date < curdate();");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addProduct() {
		System.out.println("Enter the product name: ");
		String name = scDAO.nextLine();
		System.out.println("Enter the product category: ");
		String cat = scDAO.nextLine();
		System.out.println("Enter the date of manufacture: ");
		Date manufacture_date = Date.valueOf(scDAO.nextLine());
		System.out.println("Enter the expiration date: ");
		Date exp_date = Date.valueOf(scDAO.nextLine());
		System.out.println("Enter the product price: ");
		double price = scDAO.nextDouble();

		try {
			creator.setString(1, name);
			creator.setString(2, cat);
			creator.setDate(3, manufacture_date);
			creator.setDate(4, exp_date);
			creator.setDouble(5, price);
			int updated = creator.executeUpdate();
			if (updated == 1) {
				System.out.println("Record saved.");
			} else {
				System.out.println("An error occurred.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void readAllProduct() {
		try {
			ResultSet rs = readerAll.executeQuery();
			while (rs.next()) {
				Product product = new Product(rs.getInt("ID"), rs.getString("name"), rs.getString("cat"),
						rs.getDate("manufacture_date").toInstant(), rs.getDate("exp_date").toInstant(), rs.getDouble("price"));
				System.out.println(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void findCheapestProductInCat(String cat) {
		try {
			priceSort.setString(1, cat);
			ResultSet rs = priceSort.executeQuery();
			rs.next();
			Product product = new Product(rs.getInt("ID"), rs.getString("name"), rs.getString("cat"),
					rs.getDate("manufacture_date").toInstant(), rs.getDate("exp_date").toInstant(), rs.getDouble("price"));
			System.out.println("The cheapest product is " + product);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void readProductByCat(String cat) {
		try {
			readerCat.setString(1, cat);
			ResultSet rs = readerCat.executeQuery();
			while (rs.next()) {
				Product product = new Product(rs.getInt("ID"), rs.getString("name"), rs.getString("cat"),
						rs.getDate("manufacture_date").toInstant(), rs.getDate("exp_date").toInstant(), rs.getDouble("price"));
				System.out.println(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	@Override
	public void findProductByID(int ID) {
		try {
			readerID.setInt(1, ID);
			ResultSet rs = readerID.executeQuery();
			while (rs.next()) {
				Product product = new Product(rs.getString("name"), rs.getString("cat"), rs.getDate("manufacture_date").toInstant(),
						rs.getDate("exp_date").toInstant(), rs.getDouble("price"));
				System.out.println(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	@Override
	public void updateByID(int ID) {
		try {
			readerID.setInt(1, ID);
			ResultSet rs = readerID.executeQuery();
			if (rs.next()) {
				Product product = new Product(rs.getInt("ID"), rs.getString("name"), rs.getString("cat"), rs.getDate("manufacture_date").toInstant(),
						rs.getDate("exp_date").toInstant(), rs.getDouble("price"));
				System.out.println(product);
				System.out.println("Enter the product name: ");
				String name = scDAO.nextLine();
				System.out.println("Enter the product category: ");
				String cat = scDAO.nextLine();
				System.out.println("Enter the date of manufacture: ");
				Date manufacture_date = Date.valueOf(scDAO.next());
				System.out.println("Enter the expiration date: ");
				Date exp_date = Date.valueOf(scDAO.next());
				System.out.println("Enter the product price: ");
				double price = scDAO.nextDouble();

				if (name != null) {
					updater.setString(1, name);
				} else {
					updater.setString(1, product.getName());
				}
				if (cat != null) {
					updater.setString(2, cat);
				} else {
					updater.setString(2, product.getCat());
				}
				if (manufacture_date != null) {
					updater.setDate(3, manufacture_date);
				} else {
					updater.setDate(3, product.getManufacture_date().to);
				}
				if (exp_date != null) {
					updater.setDate(4, exp_date);
				} else {
					updater.setDate(4, product.getExp_date());
				}
				if (price != 0) {
					updater.setDouble(5, price);
				} else {
					updater.setDouble(5, product.getPrice());
				}
				
				updater.setInt(6, ID);

				int updated = updater.executeUpdate();
				if (updated == 1) {
					System.out.println("Record saved.");
				} else {
					System.out.println("An error occurred.");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProductByID(int ID) {
		try {
			deleter.setInt(1, ID);
			int rowsDeleted = deleter.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println(rowsDeleted + " product(s) deleted.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteProductByCat(String cat) {
		try {
			deleteCat.setString(1, cat);
			int rowsDeleted = deleteCat.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println(rowsDeleted + " product(s) deleted.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void findExpiredProducts() {
		try {
			ResultSet rs = expiredProduct.executeQuery();
			while (rs.next()) {
				Product product = new Product(rs.getInt("ID"), rs.getString("name"), rs.getString("cat"),
						rs.getDate("manufacture_date"), rs.getDate("exp_date"), rs.getDouble("price"));
				System.out.println(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
