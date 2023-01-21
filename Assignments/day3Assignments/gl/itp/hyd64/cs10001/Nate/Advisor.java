package gl.itp.hyd64.cs10001.Nate;

import java.util.concurrent.ThreadLocalRandom;

public class Advisor {
	String[] advice = new String[5];
	int randomNum;
	public Advisor() {
		this.advice[0]="You can never plan the future by the past.";
		this.advice[1]="Try to be a rainbow in someone's cloud.";
		this.advice[2]="Never miss a good chance to shut up.";
		this.advice[3]="Never ruin an apology with an excuse.";
		this.advice[4]="Always speak politely to an enraged dragon.";	
	}
	
	public String getAdvice() {
		randomNum = ThreadLocalRandom.current().nextInt(0, 4 + 1);
		return advice[randomNum];
	}
}
