import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Paypal2 {

	public static void main(String[] args) {
		int textLength = 10;
		int[] starting = {1,1,6,6,7};
		int[] ending = {5,3,8,8,10};
		System.out.println(paperCuttings(textLength,starting,ending));
	}
	
	
	public static int paperCuttings(int textLength, int[] oldStarting, int[] oldEnding) {
		Integer[] starting = Arrays.stream(oldStarting).boxed().toArray(Integer[]::new);
		Integer[] ending = Arrays.stream(oldEnding).boxed().toArray(Integer[]::new);
		
		int counter = 0;
		for(int i = 0;i<starting.length; i++) {
			for(int j = i+1; j<starting.length; j++) {
				if(starting[i]==starting[j] && ending[i]==ending[j]) {
					List<Integer> startingList = new ArrayList<>();
					startingList.addAll(Arrays.asList(starting));
					List<Integer> endingList = new ArrayList<>();
					endingList.addAll(Arrays.asList(ending));
					startingList.remove(j);
					endingList.remove(j);
					
					return paperCuttings(textLength, startingList.stream()
							.mapToInt(Integer::intValue).toArray(),
							endingList.stream().mapToInt(Integer::intValue).toArray());
				}
				else {
					if(!overlaps(starting[i],ending[i],starting[j],ending[j])) {
						counter++;
					}
				}
			}
		}
		return counter;
	}
	private static boolean overlaps(int start1, int end1, int start2, int end2) {
		if(end1>=start2 && end1<=end2) {
			return true;
		}
		else if(start2<=end1 && start2>=start1) {
			return true;
		}
		else {
			return false;
		}
	}
}
