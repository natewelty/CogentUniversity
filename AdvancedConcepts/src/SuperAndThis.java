
public class SuperAndThis extends Object {
	int a;
	int b;

	public SuperAndThis(int a, int b) {
		super();
		//this();

	}

	public SuperAndThis(){
		super();
		this.a=1;
		this.b=2;
		
	}
	
	
}

class Extension extends SuperAndThis{
	public Extension() {
		super(1,2);
	}
	public Extension(int a, int b) {
		super();
		super.a=a;
		super.b=b;
	}
	public void testMethod() {
		try {}
		finally {
			
			try {
				System.out.println(super.a);
				super.wait(5000);
				System.out.println(super.b);
				int c = super.a + super.b;
				System.out.println(c);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
