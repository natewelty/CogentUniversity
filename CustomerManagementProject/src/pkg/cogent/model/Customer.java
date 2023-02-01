package pkg.cogent.model;

public class Customer {
	//CId CName CEmail and DoB bean class
	private String CId, CEmail, CName, CDoB;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String cId, String cEmail, String cName, String cDoB) {
		super();
		CId = cId;
		CEmail = cEmail;
		CName = cName;
		CDoB = cDoB;
	}

	public String getCId() {
		return CId;
	}

	public void setCId(String cId) {
		CId = cId;
	}

	public String getCEmail() {
		return CEmail;
	}

	public void setCEmail(String cEmail) {
		CEmail = cEmail;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public String getCDoB() {
		return CDoB;
	}

	public void setCDoB(String cDoB) {
		CDoB = cDoB;
	}
	
	
}
