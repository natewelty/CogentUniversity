package pkg.cogent.service;

import pkg.cogent.dao.ProductDAOImpl;

public class ProductService {
	ProductDAOImpl dao;

	public ProductService() {
		// TODO Auto-generated constructor stub
		dao = new ProductDAOImpl();
	}

	public void save() {
		dao.addProduct();
	}

	public void fetchAll() {
		dao.readAllProduct();
	}

	public void fetchCheapestByCat(String cat) {
		dao.findCheapestProductInCat(cat);
	}

	public void fetchByCat(String cat) {
		dao.readProductByCat(cat);
	}

	public void modify(int ID) {
		dao.updateByID(ID);
	}

	public void delete(int ID) {
		dao.deleteProductByID(ID);
	}

	public void deleteCat(String cat) {
		dao.deleteProductByCat(cat);
	}

	public void fetchByID(int ID) {
		dao.findProductByID(ID);
	}

	public void findExpiredInventory() {
		dao.findExpiredProducts();
	}
}
