import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class IntroToCollections {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
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
		
		ArrayList<Integer> list2= new ArrayList<Integer>();
		
		list2.addAll(list);
		System.out.println(list2);
		
		list2.remove(3);
		System.out.println(list2);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		Random obj = new Random();
		for(int i=0;i<10;i++) {
			
			list3.add(ThreadLocalRandom.current().nextInt(1, 5 + 1));
		}
		System.out.println(list3);
		Set<Integer> set1 = new HashSet<>(list3);
		System.out.println(set1);
		Set<Integer> tree = new TreeSet<>();
		for(int i=0;i<10;i++) {
			
			tree.add(ThreadLocalRandom.current().nextInt(1, 100 + 1));
		}
		System.out.println(tree);
	}

}
