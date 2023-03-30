import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello6 {
	public static void main(String[] args) {
		Hello6 hello = new Hello6();
		Integer[] array = {1,0,2,0,1,2,1,0,2,1};
		hello.sort(array);
	}
	
	public void sort(Integer[] array){
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(array));
		int twoCount=0;
		for(int i=0;i<array.length;i++) {
			//System.out.println(list);
			if(list.get(i-twoCount)==0) {
				list.remove(i-twoCount);
				list.add(0,0);
			}
			else if(list.get(i-twoCount)==2) {
				list.remove(i-twoCount);
				list.add(2);
				twoCount++;
			}
		}
		System.out.println(list);
	}
	
	
}
