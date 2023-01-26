package ThreadTesting;

import java.util.Scanner;

public class CircleThread extends Thread{
	static double r,area=0;
	public static void main(String[] args) {
		
		System.out.println("Area of the circle");
		System.out.println("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		long start = System.currentTimeMillis();
		CircleThread tjt = new CircleThread();
		tjt.start();
		try {
			tjt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Area = " + area);
		long end = System.currentTimeMillis();
		System.out.println("The total time taken is " + (end-start)/1000 + " seconds.");
		
		sc.close();
	}
	@Override
	public void run() {
		area = 3.1415*r*r;
		
	}
}
