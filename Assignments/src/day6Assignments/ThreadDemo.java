package day6Assignments;


public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadQ1 thread = new MyThreadQ1();
		thread.setPriority(MAX_PRIORITY);
		
		MyThreadQ2 runnableObject = new MyThreadQ2();
		
		Thread th = new Thread(runnableObject);
		th.setPriority(MIN_PRIORITY);
		th.start();
		
		thread.start();
		
		System.out.println("Thread name: " + Thread.currentThread().getName());
		try {
			
		}catch(Exception e) {
			
		}
	}

}

