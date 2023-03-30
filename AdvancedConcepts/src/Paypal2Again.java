import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Paypal2Again {
	public static void main(String[] args) {
		int textLength = 10;
		int[] starting = {1,1,6,6,7};
		int[] ending = {5,3,8,8,10};
		System.out.println(paperCuttings(textLength,Arrays.asList(starting),Arrays.asList(ending)));
	}
	
	
	
	public static long paperCuttings(int textLength, List<Integer> starting, List<Integer> ending) {
		long counter=0;
		List<Substring> cuttings = IntStream.range(0, starting.size()).mapToObj(i->new Substring(starting.get(i),ending.get(i))).distinct().toList();
		
		for(int i = 0; i<cuttings.size(); i++) {
			int j=i;
			counter+=cuttings.stream().skip(i).filter(s->cuttings.get(j).notIntersect(s)).count();
		}
		
		return textLength;
		
	}
	
}
class Substring { 
	Integer start;
	Integer end;
	@Override
	public int hashCode() {
		return Objects.hash(end, start);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Substring other = (Substring) obj;
		return Objects.equals(end, other.end) && Objects.equals(start, other.start);
	}
	public Substring(Integer start, Integer end) {
		super();
		this.start = start;
		this.end = end;
	}
	public boolean notIntersect(Substring other) {
		if(this.end<=other.start && this.start<=other.start) {
			return true;
		}
		else if(this.start>=other.end && this.end>=other.end) {
			return true;
		}
		else return false;
	}
	
	
}
