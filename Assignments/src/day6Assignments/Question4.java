package day6Assignments;


import java.util.Vector;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage data = new Storage();
		//data.storeData(1);
		Counter count = new Counter(data);
		Printer print = new Printer(data);
		
		Thread t1 = new Thread(count);
		Thread t2 = new Thread(print);
		
		t1.start();
		t2.start();
	}

}

class Storage{
	Vector<Integer> storedData;
	
	public Storage(){
		this.storedData = new Vector<Integer>();
		
	}
	public synchronized void storeData(int x) {
		storedData.add(x);
	}
	public synchronized int getData(int index) {
		return storedData.get(index)!=null ? storedData.get(index) : -1;
	}
	
	
}


class Counter implements Runnable{
	Storage data;
	public Counter(Storage data) {
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

class Printer implements Runnable{
	int toPrint;
	int lastRetrieved;
	Storage data;
	public Printer(Storage data) {
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
