import java.util.Arrays;
import java.util.List;

public class hello {
	public static void main(String[] args) {
		System.out.println(hi.i);
		List<Integer> list =Arrays.asList(1,1,2,2,3,3,4,4,4,5,5,6,6,7,7);
		int result=0;
		for(int i =0; i<list.size();i++) {
			result = result ^ list.get(i);
		}
		System.out.println(result);
	}
}

class hi{
	public static final int i;
	static {
		System.out.println("hi");
		i=10;
	}
}