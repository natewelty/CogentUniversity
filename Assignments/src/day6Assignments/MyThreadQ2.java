package day6Assignments;

public class MyThreadQ2 implements Runnable{
	@Override
	public void run(){
		for(int i = 0; i<20; i++) {
			System.out.println("This is in a thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
}
