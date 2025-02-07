import java.util.Scanner;

public class NewCheckInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = "";
		
		
		int intNum;
		
		float realNum = 987654321.987654321f;
		
		double biggerRealnum = 10;
		
		char letter;
		
		System.out.print("Enter Word");	
		word = input.next();
		System.out.println("word goes here " + word);

		

		System.out.print("Enter a Int");
		intNum = input.nextInt();
		System.out.println("the int goes here " + intNum);
		
		System.out.print("Enter Float");
		realNum = input.nextFloat();
		realNum= realNum + realNum;
		System.out.println("the float goes here " + realNum);
		System.out.printf("$%.9f" ,realNum);
		
		
		System.out.print("Enter Double");
		biggerRealnum = input.nextDouble();
		System.out.println("the double goes here " + biggerRealnum);
		
		System.out.printf("$%.2f" ,biggerRealnum);
	
		
		
		//System.out.print("Enter Char");
		//letter = input.nextLine().charAt(0);
		
		
	

	}

}
