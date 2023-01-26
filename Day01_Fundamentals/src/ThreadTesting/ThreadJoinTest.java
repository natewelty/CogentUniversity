package ThreadTesting;

import java.util.Scanner;

public class ThreadJoinTest extends Thread{
	static int n,sum=0;
	public static void main(String[] args) {
		
		System.out.println("Sum of first N numbers");
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		ThreadJoinTest.n = sc.nextInt();
		long start = System.currentTimeMillis();
		ThreadJoinTest tjt = new ThreadJoinTest();
		tjt.start();
		try {
			tjt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum = " + sum);
		long end = System.currentTimeMillis();
		System.out.println("The total time taken is " + (end-start)/1000 + " seconds.");
		
		sc.close();
	}
	@Override
	public void run() {
		for(int i=0; i<n;i++) {
			sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
