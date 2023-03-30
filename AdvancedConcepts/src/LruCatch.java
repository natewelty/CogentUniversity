import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import BuildingACar.main;

public class LruCatch {
	private Deque<String> doublyQueue;
	private final int CACHE_SIZE;
	private HashSet<String> hashSet;
	
	LruCatch(int capacity){
		doublyQueue = new LinkedList<>();
		CACHE_SIZE = capacity;
		hashSet = new HashSet<>();
	}
	
	public void refer(String page) {
		if(!hashSet.contains(page)) {
			if(doublyQueue.size()==CACHE_SIZE) {
				String last = doublyQueue.removeLast();
				hashSet.remove(last);
			}
		}
		else {
			doublyQueue.remove(page);
			
		}
		doublyQueue.push(page);
		hashSet.add(page);
	}
	
	public static void main(String[] args) {
		List<String> test1 = new ArrayList<>();
		test1.add("item1");
		test1.add("item2");
		test1.add("item3");
		test1.add("item1");
		test1.add("item3");
		LruCatch lruCatch = new LruCatch(3);
		test1.forEach(s->lruCatch.refer(s));
		List<String> latestKResults = new ArrayList<>(lruCatch.doublyQueue);
		System.out.println(latestKResults);
		
	}
}
