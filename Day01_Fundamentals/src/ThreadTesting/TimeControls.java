package ThreadTesting;

public class TimeControls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		synchronized(t) {
			System.out.println("Waiting");
			t.wait();
			System.out.println("Notified.");
			System.out.println(t.total);
		}

	}

}

class MyThread extends Thread{
	int total;
	@Override
	public void run() {
		System.out.println("Child thread is calculating the sum.");
		synchronized(this) {
			for(int i=1;i<=100;i++) {
				total+=i;
			}
			notify();
		}
	}
}
