import java.util.Arrays;
import java.util.List;

public class Hello4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,1,3,2,1,3,2,1,2);
		Hello4 hello = new Hello4();
		
		System.out.println(hello.findFirstDuplicate(list));
	}
	public interface Hello5{
		class Hello5Inner implements Hello5{
			public void method1(){
				System.out.println("With a body");
			}
		}
	}
	class hello5impl implements Hello5{
		
	}
	
	
	public int findFirstDuplicate(List<Integer> list) {
		for(int i = 0; i<list.size(); i++) {
			int x = list.get(i);
			if (list.indexOf(x) != i) {
				return x;
			}
		}
		
		throw new RuntimeException("No duplicates.");
	}
}
