package ExceptionHandling;

public class CalcAverage {
	public double avgFirstN(int N) {
		if(N<=0) {
			throw new IllegalArgumentException("Input must be a natural number.");
		}
		double sum = 0;
		for(int i = 0;i<N;i++) {
			 sum = sum +i;
		
		}
		return sum/N;
	}
}
