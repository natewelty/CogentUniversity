import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Integer[] array1 = {1,2,3,4,6,7,8,9,10,11};
		Integer[] array2 = {1,2,3,5,6,7,8,10,11,12};
		
		new myClass().arrayCompare2(array1,array2);
	}
	
}

class myClass{
	public void arrayCompare(int[] array1, int[] array2){
		int errorSize=0;
		for(int i =0;i<10;i++) {
			if(((array1[i]-array2[i])*(array1[i]-array2[i]))>errorSize) { //square error is always positive increasing
				System.out.println("There is an an error at index= " + i);
				errorSize =(array1[i]-array2[i])*(array1[i]-array2[i]);
				if(array1[i]<array2[i]) {
					System.out.println("The second array has skipped a number.");
				}
				else if(array1[i]>array2[i]) {
					System.out.println("The first array has skipped a number.");
				}
			}
			
		}
	}
	
	public void arrayCompare2(Integer[] array1, Integer[] array2) {
		List<Integer> first = Arrays.asList(array1);
		List<Integer> second = Arrays.asList(array2);
		
		List<Integer> union = new ArrayList<>();
		List<Integer> backupSecond = List.copyOf(second);

		union.addAll(first);
		union.addAll(second);
		union = union.stream().distinct().collect(Collectors.toList());
		
		final List<Integer> intersection = backupSecond.stream().filter(i->first.contains(i)).collect(Collectors.toList()); //second-first
		List<Integer> difference = union.stream().filter(i->!intersection.contains(i)).collect(Collectors.toList());
		System.out.println(difference);
		
	}
}
