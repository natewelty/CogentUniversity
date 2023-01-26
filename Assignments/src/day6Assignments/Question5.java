package day6Assignments;


import java.util.Vector;

public class Question5 {

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

class Storage1{
	Vector<Integer> storedData;
	
	public Storage1(){
		this.storedData = new Vector<Integer>();
		
	}
	public synchronized void storeData(int x) {
		storedData.add(x);
	}
	public synchronized int getData(int index) {
		return storedData.get(index)!=null ? storedData.get(index) : -1;
	}
	
	
}


class Counter1 implements Runnable{
	Storage1 data;
	public Counter1(Storage1 data) {
		this.data = data;
	}
	
	public void count() {

		for(int i = 0; i<20;i++) {
			data.storeData(i);
		}

	}
	public void run() {
		count();
	}
}

class Printer1 implements Runnable{
	int toPrint;
	int lastRetrieved;
	Storage1 data;
	public Printer1(Storage1 data) {
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
		print();
	}
	
}
