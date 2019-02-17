import java.util.Scanner;

class Factorial {

	long factorial(long input) {
		if (input < 2)
			return 1;
		
		return input * factorial(input - 1);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome stranger.");
		Scanner scanner = new Scanner(System.in);
		Factorial obj = new Factorial();
		boolean exitCondition = false;
		do {
			System.out.println("Please enter number for factorial. -1 is special number for exit");
			long input = scanner.nextLong();
			
			if (input == -1) {
				System.out.println("Received -1, exiting");
				exitCondition = true;
				
			}
			else if (input < 0) {
				System.out.println("Negative number, not acceptable");
			}
			else {
				System.out.println("Result " + obj.factorial(input));
			}
		} while (exitCondition == false);
	}
}