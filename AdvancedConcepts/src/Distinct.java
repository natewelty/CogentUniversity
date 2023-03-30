import java.util.Arrays;
import java.util.stream.IntStream;

public class Distinct {
	
	public static void main(String[] args) {
		Distinct distinct = new Distinct();
		int[] input = new int[] {12,34,56,12};
		int[] output = distinct.findDistinct(input);
		for(int i:output) {
			System.out.print(i + " ");
		}
		int[] output2 = distinct.cheatingFindDistinct(input);
		for(int i:output2) {
			System.out.print(i + " ");
		}
	}
	
	public int[] cheatingFindDistinct(int[] input) {
		return IntStream.of(input).distinct().toArray();
	}
	
	public int[] findDistinct(int[] input) {
		int[] distinctTemp = new int[input.length]; //we'll store the non-duplicates here
		
		Arrays.setAll(distinctTemp, a -> 0); //initializing to prevent null pointer exceptions
		
		int zeroCount = 0; 
		int duplicateCount =0; 
		boolean duplicateFound = false;
		for (int i = 0; i < input.length; i++) { //Loop through input
			if (input[i] == 0) { //Count zeros
				zeroCount++;
			}
			for (int j = 0; j < distinctTemp.length; j++) { //Looping through distinctTemp because input[i] is non-zero
			
				if (input[i] == distinctTemp[j]) { // if distinctTemp[j] matches input[i], break
					duplicateCount++;
					duplicateFound =true;
					break;
				} 
			}
			if(!duplicateFound) {
				distinctTemp[i]=input[i];
				duplicateFound =false;
			}
		}
		
		int[] distinctFinal = new int[input.length - duplicateCount];
		duplicateFound = false;
		for (int j = 0; j < distinctFinal.length; j++) { //looping through distinctFinal to fill it
			for (int i = 0; i < distinctTemp.length; i++) { //looping through distinctTemp to find non-zero elements
				if (distinctTemp[i] == 0) { //Skipping Zeros
					continue;
				} else {
					for (int k = 0; k < j+1; k++) { //looping through elements already added to j to see if the non-zero element distinctTemp[i]
						if (distinctTemp[i] == distinctFinal[k]) { //if we find a duplicate break
						
							duplicateFound=true;
							break;
						}
						
					}
					if(!duplicateFound) { //
						distinctFinal[j] = distinctTemp[i];
						
						break;
					}
					duplicateFound = false;
				}
			}

		}
		return distinctFinal;

	}
}
