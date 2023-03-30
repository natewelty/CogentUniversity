package AdvancedStuff;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class ShoppingCart {
	public static void main(String[] args) {
		int[] purchased = { 1, 3, 8 };
		System.out.println(findMaxDistinctItems(10, purchased, 10));
	}

	public static int findMaxDistinctItems(int n, int[] purchased, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		IntStream.range(1, n + 1).filter(i -> !IntStream.of(purchased).anyMatch(s -> s == i)).boxed()
				.forEach(s -> queue.add(s));
		int subtotal = 0;
		int itemCount = purchased.length;
		while (subtotal < k) {
			int next = queue.poll();
			if (subtotal + next < k) {
				itemCount++;
				subtotal += next;
			} else {
				return itemCount;
			}
		}
		return itemCount;
	}

}
