import java.util.Scanner;

public class Exam1 {

	private static final boolean Sum = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this is for "MessagePrinter"
		System.out.println("This is my first programming test");

		// This is for Beverage Selector
		//
		Scanner scanner = new Scanner(System.in);
		// Beverage Selector
		System.out.println("what drink do you want?");

		int drink = scanner.nextInt();
		{
			if (drink == 1) {
				System.out.println("You chose Water!");
			} else if (drink == 2) {
				System.out.println("You chose Coke!");
			} else if (drink == 3) {
				System.out.println("You chose Coffee!");
			}

			// TODO Auto-generate method stub

		}

		int num1 = 7;
		int num2 = 3;

		boolean result = TenMaker(num1, num2);
		if (result) {
			System.out.println("The numbers " + num1 + " and " + num2 + " sums up to 10");
		} else {
			System.out.println("The numbers " + num1 + " and " + num2 + " does not sums up to 10");
		}

		// For class Divider

		System.out.print("Enter the first number: ");
		double input1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double input2 = scanner.nextDouble();

		if (input2 == 0) {
			System.out.println("AHHH Cannot divide by zero.");
		} else {

			double answer = input1 / input2;

			System.out.printf("The answer is %.2f when you divide %.2f by %.2f.\n", answer, input1, input2);
		}
// Accumulator

		int number;
		System.out.print("Enter a number (0 to stop): ");
		number = scanner.nextInt();
		// Keep asking for numbers until the user enters 0
		int sum = number;

		while (number != 0) {
			System.out.print("Enter a number (0 to stop): ");
			number = scanner.nextInt();

			sum += number; // Add the number to the sum
		}

		// Print the sum when user enters 0
		System.out.println("The total sum is: " + sum);

	}// Main

	private static boolean TenMaker(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2 == 10;

	}
}
