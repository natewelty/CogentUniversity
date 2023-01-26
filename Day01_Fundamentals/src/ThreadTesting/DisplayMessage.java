package ThreadTesting;

public class DisplayMessage {
	public synchronized void sayHello(String name) {
		for(int i = 0; i<5;i++) {
			System.out.println("Hello " + name);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
