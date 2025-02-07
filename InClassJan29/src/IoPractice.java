import java.util.Scanner;

public class IoPractice {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("How many people are here in the classroom?");
		
		int numInClass = input.nextInt();
		System.out.println("There are " + numInClass + " here today...");
		
		System.out.println("How many would 3 times more be?");
		
		int product = numInClass * 3;
		
		System.out.println(product);
		
		System.out.println(numInClass * 3);
		
		System.out.println("What is your first name?");
		String fName = input.next();
		System.out.println("What is your last name?");
		String lName = input.next();
		
		System.out.println(fName + " " + lName);
	

	}

}


//can help with interactive greeter!! Has all the tools that we need!