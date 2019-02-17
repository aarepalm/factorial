import java.util.Scanner;

class Factorial {

	long factorial(long input) {
		if (input < 2)
			return 1;
		
		return input * factorial(input - 1);
	}

	long factorialNonRecursive(long input) {
		if (input < 2)
			return 1;

		long result = input;
		while (input > 2) {
			result = result * --input;
		}
		return result;
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
				System.out.println("Result (recursive)      " + obj.factorial(input));
				System.out.println("Result (non-recursive)  " + obj.factorialNonRecursive(input));
				// Aare comment: The body of the factorialNonRecursive could also be directly here.
				// Like that(you can test it by commenting out last line and commenting in the following section) :
				/*
				long result = input;
				while (input > 2) {
					result = result * --input;
				}
				System.out.println("Result (non-recursive)  " + result);
				*/
			}
		} while (exitCondition == false);
	}
}
