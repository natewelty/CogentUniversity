import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Paypal1 {
	
	public static void main(String[] args) {
		List<String> test1 = new ArrayList<>();
		test1.add("item1");
		test1.add("item2");
		test1.add("item3");
		test1.add("item1");
		test1.add("item3");
		test1.add("item4");
		test1.add("item2");
		test1.add("item1");
		test1.add("item5");
		test1.add("item3");
		test1.add("item4");
		test1.add("item3");
		
		System.out.println(getLatestKRequests(test1,3));
		
	}
	
	
	// Linked Hashmap will remove duplicates and keep order, then we just return the last k elements of the hashmap
	
	public static List<String> getLatestKRequests(List<String> requests, int K){
		
		Collections.reverse(requests); //Reversal first
		LinkedHashSet<String> distinctRequests = new LinkedHashSet<>();
		distinctRequests.addAll(requests); //this makes them distinct while maintaining order
		List<String> distinctRequestsList2 = new ArrayList<>(); 
		distinctRequestsList2.addAll(requests.stream().distinct().toList());
		System.out.println(distinctRequests);
		System.out.println(distinctRequestsList2);
		
		List<String> distinctRequestsList = new ArrayList<>(); 
		distinctRequestsList.addAll(distinctRequests); //Because lists play nicer than linkedhashset does.
		List<String> latestKRequests = new ArrayList<>(); //This is what we'll actually return.
		
		for(int i = 0; i<K;i++) {
			latestKRequests.add(distinctRequestsList.get(i));
		}
		
		return latestKRequests; 
	}
	
	
}
