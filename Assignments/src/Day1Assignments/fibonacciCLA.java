package Day1Assignments;

public class fibonacciCLA {

	public static void main(String[] args) {
		int sequence[] = new int[15];
		sequence[0]=Integer.parseInt(args[0]);
		System.out.print(sequence[0] + " ");
		sequence[1]=Integer.parseInt(args[1]);
		System.out.print(sequence[1] + " ");
		for(int i=2; i<15;i++) {
			sequence[i]=sequence[i-1]+sequence[i-2];
			System.out.print(sequence[i] + " ");
		}
		System.out.println();
	}

}
