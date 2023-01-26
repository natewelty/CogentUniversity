package ThreadTesting;

public class SynchThreads extends Thread{
	DisplayMessage dm;
	String name;
	public SynchThreads(DisplayMessage dm, String name) {
		this.dm=dm;
		this.name=name;
	}
	public void run() {
		dm.sayHello(name);
	}
}
