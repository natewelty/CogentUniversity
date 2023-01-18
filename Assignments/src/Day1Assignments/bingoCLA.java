package Day1Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class bingoCLA {
	public static void main(String[] args) {
		Integer randomNum[]=new Integer[5];
		//for(int j = 0;j<100;j++) {
			for(int i = 0;i<5;i++) {
				randomNum[i] = ThreadLocalRandom.current().nextInt(1, 40 + 1);
				System.out.print(randomNum[i] + " ");
			}
			List<Integer> bingo = new ArrayList<>(Arrays.asList(randomNum));

			if(bingo.contains(Integer.parseInt(args[0])) && bingo.contains(Integer.parseInt(args[1]))) {
				System.out.println("Bingo");
			}
			else {
				System.out.println();
			}

		}
	//}
}
