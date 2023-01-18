package pkg.cogent.dao;

public interface CustomerDAO {
	public void create();
	public void read();
	public void update(String cId);
	public void delete(String cId);
	public void findById(String cId);
	public void findYoungest();
}
