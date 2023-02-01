package pkg.cogent.dao;

public interface ProductDAO {
	public void addProduct();

	public void readAllProduct();

	public void findCheapestProductInCat(String cat);

	public void readProductByCat(String cat);

	public void findProductByID(int ID);

	public void updateByID(int ID);

	public void deleteProductByID(int ID);

	public void deleteProductByCat(String cat);

	public void findExpiredProducts();
}
