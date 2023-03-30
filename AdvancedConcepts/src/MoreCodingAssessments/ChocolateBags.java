package MoreCodingAssessments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ChocolateBags {
	public static void main(String[] args) {
		ChocolateBags cb = new ChocolateBags();
		int[] counts = {12,3,6,4,2};
		System.out.println(cb.shareChocolate(5,counts));
	}
	
	public float shareChocolate(int N, int[] counts) {
//		Arrays.sort(counts);
//		float target = (float) (Arrays.stream(counts).sum()/2.0);
//		int tempSum = 0;
//		int[] partition = IntStream.range(0, N/2+1).toArray();
//		tempSum = countPartition(partition, counts);
//		Arrays.stream(partition).forEach(s->System.out.print(s + " "));
//		System.out.println();
//		if(tempSum<target) {
//			ArrayList<Integer> list = new ArrayList<>(Arrays.stream(partition).boxed().toList());
//			int[] partition = IntStream.range(0, N/2+2).toArray();
//			
//		}
//		if (tempSum>target) {
//			partition = Arrays.copyOfRange(partition, 0, partition.length-2);
//			Arrays.stream(partition).forEach(s->System.out.print(s + " "));
//			System.out.println();
//		}
//		return target;
		ArrayList<Integer> countsList = new ArrayList<>(Arrays.stream(counts).boxed().toList());
		ArrayList<Integer> partition = new ArrayList<>(IntStream.iterate(0, i->i+1).limit(N).boxed().toList());
		float target = (float) (Arrays.stream(counts).sum()/2.0);
		TreeSet<Integer> difference = new TreeSet<>();
		
		
		
		
		
	}
	
	public int countPartition(int[] partition, int[] counts) {
		int sum = 0;
		for(int i:partition) {
			sum+=counts[i];
		}
		return sum;
	}
	
	public int[] incrementPartition(int[] partition) {

		for(int x=0;x<partition.length-1; x++) {
			if(partition[x+1]-partition[x]>1) {
				partition[x]++;
				Arrays.stream(partition).forEach(s->System.out.print(s + " "));
				System.out.println();
				return partition;
			}
		}
		partition[partition.length-1]++;
		return partition;
	}
}
