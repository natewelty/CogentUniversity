package day7Assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("Heinz Ketchup");
		tree.add("Cool Whip");
		tree.add("Jiff Peanut Butter");
		tree.add("Jiff Peanut Butter");
		tree.add("Signature Select Spicy Brown Mustard");
		
		Iterator<String> itr = tree.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.size());
		tree.remove("Cool Whip");
		System.out.println(tree.size());
					
	}

}
