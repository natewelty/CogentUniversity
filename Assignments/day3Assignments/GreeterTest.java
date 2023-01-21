import gl.itp.hyd64.cs10001.Nate.Advisor;
import gl.itp.hyd64.cs10001.Nate.Greeter;

public class GreeterTest {

	public static void main(String[] args) {
		Greeter[] greeter = new Greeter[args.length];
		Advisor advisor = new Advisor();
		for(int i=0; i<args.length;i++) {
			greeter[i] = new Greeter(args[i]);
			System.out.println(greeter[i].sayHello());
		}
		System.out.println(advisor.getAdvice());
		for(int i = greeter.length -1; i>=0; i--) {
			System.out.println(greeter[i].sayGoodBye());
		}

	}

}
