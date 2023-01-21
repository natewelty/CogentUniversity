package gl.itp.hyd64.cs10001.Nate;

public class Greeter {
	String name;
	public Greeter(String name) {
		this.name = name;
	}
	public String sayHello() {
		return "Hello " + name +".";
	}
	public String sayGoodBye() {
		return "Good bye " + name +".";
	}
}
