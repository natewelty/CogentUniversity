package day6Assignments;


import java.util.Vector;

public class Question6 {

	public static void main(String[] args) {
		Storage data = new Storage();
		Counter count = new Counter(data);
		Printer print = new Printer(data);
		
		Thread t1 = new Thread(count);
		Thread t2 = new Thread(print);
		
		t1.start();
		t2.start();
	}

}

class Storage2{
	Vector<Integer> storedData;
	
	public Storage2(){
		this.storedData = new Vector<Integer>();
		
	}
	public synchronized void storeData(int x) {
		storedData.add(x);
	}
	public synchronized int getData(int index) {
		return storedData.get(index)!=null ? storedData.get(index) : -1;
	}
	
	
}


class Counter2 implements Runnable{
	Storage2 data;
	public Counter2(Storage2 data) {
		this.data = data;
	}
	
	public void count() {

		for(int i = 0; i<20;i++) {
			data.storeData(i);
		}

	}
	public void run() {
		count();
		System.out.println("Notifying.");
		Thread.currentThread().notifyAll();
		
	}
}

class Printer2 implements Runnable{
	int toPrint;
	int lastRetrieved;
	Storage2 data;
	public Printer2(Storage2 data) {
		this.data=data;
	}
	public void print() {
		
		while(lastRetrieved<20) {
			toPrint = data.getData(lastRetrieved++);
			if(toPrint>0) {
				System.out.println(toPrint);		
			}
		}

	}
	public void run() {
		try {
			System.out.println("Waiting.");
			Thread.currentThread().wait();
			System.out.println("Notification received.");
			this.print();
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
	}
	
}
