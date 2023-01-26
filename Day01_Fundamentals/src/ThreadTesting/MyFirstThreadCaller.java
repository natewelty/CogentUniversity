package ThreadTesting;

public class MyFirstThreadCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThreadableClass mtc = new MyThreadableClass();
		//Thread th = new Thread(mtc);
		//th.start();
		TryingToExtendThread ttet = new TryingToExtendThread();
		//TryingToExtendThread ttet = new TryingToExtendThread();
		//ttet.start();
		
		//ttet.interrupt();
		//System.out.println("End of main");
		
		DisplayMessage dm = new DisplayMessage();
		SynchThreads st1 = new SynchThreads(dm,"John");
		SynchThreads st2 = new SynchThreads(dm,"Jacob");
		st1.start();
		st2.start();
		
	}

}
