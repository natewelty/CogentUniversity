import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Hello5 {
	public static void main(String[] args) {
		Hello5 hello = new Hello5();
		IntStream stream = IntStream.generate(()->(int)(Math.random()*1000000000));
		System.out.println(hello.storeTenLargest(stream.limit(1000000)));
	}
	public PriorityQueue<Integer> storeTenLargest(IntStream stream) {
		PriorityQueue<Integer> tenLargest = new PriorityQueue<>();
		tenLargest.add(1);
		stream.boxed().filter(s->s>tenLargest.peek()).forEach(s->{tenLargest.add(s);
		if(tenLargest.size()>10) {
			tenLargest.poll();
		}
		});
		//.forEach(i->{if(tenLargest.size()>10){tenLargest.poll();}});
		return tenLargest;
	}
	
}
