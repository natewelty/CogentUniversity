import java.util.ArrayList;
import java.util.Iterator;

public class IntroToCollections {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(new Integer(20));
		list.add(10);
		list.add(12);
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(int i = 10; i<=100; i+=10) {
			list.add(i);
		}
		System.out.println(list);
		list.add(2,100);
		System.out.println(list);
		list.set(3, 1000);
		System.out.println(list);
		
		ArrayList<Integer> list2= new ArrayList();
		
		list2.addAll(list);
		System.out.println(list2);
		
		list2.remove(3);
		System.out.println(list2);
		
	}

}
