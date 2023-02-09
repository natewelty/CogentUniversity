package AdvancedStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AwardsProblem {

	public static void main(String[] args) {
		List<PersonHasAwards> people = new ArrayList<PersonHasAwards>(); 
		for(int i=0;i<20;i++) {
			people.add(new PersonHasAwards((char) (91+i)));
			
		}
		

		List<Stream<PersonHasAwards>> newList = people.stream().flatMap(s->s.awards.stream()).distinct().sorted().map(y->people.stream().filter(s->s.awards.contains(y))).collect(Collectors.toList());
		List<Stream<PersonHasAwards>> newNewList = (List<Stream<PersonHasAwards>>) newList.stream().map(s->s.collect(Collectors.toList()));
		newNewList.stream().forEach(s->System.out.println(s));
	}

}

class PersonHasAwards {
	List<Integer> awards = new ArrayList<Integer>();
	char name;
	
	
	public PersonHasAwards(char c) {
		this.name=c;
		for(int i = 0; i< 4; i++) {
			awards.add(ThreadLocalRandom.current().nextInt(1,97));
		}
	}
}

