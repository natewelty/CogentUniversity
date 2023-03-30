import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Hello2 {
	public static void main(String[] args) {
		Hello2 hello = new Hello2();
		//tests
		Double test1[] = {5.0,19.0,8.0,1.0};
		Double test2[]= {10.0,10.0};
		Double test3[] = {3.0,0.0,5.0};
		hello.solveFilters(test1);
		hello.solveFilters(test2);
		hello.solveFilters(test3);
	}

	public void solveFilters(Double[] x) {
		PriorityQueue<Double> pQueue = new PriorityQueue<Double>(Collections.reverseOrder());
		
		pQueue.addAll(Arrays.asList(x));
		double sum = DoubleStream.of(Arrays.stream(x).mapToDouble(Double::doubleValue).toArray()).sum();
		double totalReduction = 0;
		int filterCounter = 0;
		while(2*totalReduction<sum) {
			double reduction = pQueue.poll()/2;
			pQueue.add(reduction);
			totalReduction+=reduction;
			filterCounter++;
		}
		
		System.out.println("The minimum number of filters is " + filterCounter);
		//System.out.println("The total polution was " + sum + " and has been reduced to " + (sum-totalReduction));
	}
	
	
	
}
