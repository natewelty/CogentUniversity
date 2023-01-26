package ThreadTesting;

public  class TryingToExtendThread extends Thread {
	@Override
	
	
	public synchronized void run() {
		try{
			for(int i = 0; i<10; i++) {
				System.out.println("This is the other way to make a thread.");
				Thread.sleep(500);
			}

		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Got Interrupted.");
		}
	}
}
