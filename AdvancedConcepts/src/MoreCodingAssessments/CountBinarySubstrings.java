package MoreCodingAssessments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CountBinarySubstrings {
	public static void main(String[] args) {
		String binaryString = "011001";
		Pattern pattern = getPattern(2);
		Matcher matcher = pattern.matcher(binaryString);
		System.out.println(count(binaryString));
	}
	public static int count(String binaryString) {
		return IntStream.range(1, binaryString.length()/2).mapToObj(i->getPattern(i)).map(p->p.matcher(binaryString)).map(m->{while(m.find(m.start()+1)) {
			
		}})
	}
	public static Pattern getPattern(int x) {
		return Pattern.compile("(1){"+x+"}(0){"+x+"}");
		//return Pattern.compile("0{"+x+"}1{"+x+"}|1{"+x+"}0{"+x+"}");
				
	}
}
