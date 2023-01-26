package StreamTesting;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Part> partStream = Stream.of(
				new Part("Pencil",100,5,15,500),
				new Part("Eraser", 200,10,30,600),
				new Part("Paper",102,7,20,200)
				);
		partStream.forEach((p)->System.out.println(p));

	}

}
