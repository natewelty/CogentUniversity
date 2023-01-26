package day6Assignments;

public class MyThreadQ1 extends Thread{
	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			System.out.println("This is the other way to make a thread.");
			
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
}
