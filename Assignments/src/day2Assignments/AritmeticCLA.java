package day2Assignments;

public class AritmeticCLA {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);
		if (args[1].equals("+")) {
			System.out.println(x+y);
		}
		else if (args[1].equals("-")) {
			System.out.println(x-y);
		}
		else if (args[1].equals("*")) {
			System.out.println(x*y);
		}
		else if (args[1].equals("/")) {
			System.out.println(x/y);
		}
		else {
			System.out.println("Symbolic operator not recognized.");
			
		}

	}

}
