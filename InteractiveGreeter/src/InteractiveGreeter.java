import java.util.Scanner;

public class InteractiveGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println("Where are you from");
		String location = input.nextLine();
		
;

		System.out.println("How old are you?");
		String age = input.nextLine();

		System.out.println("What is one Hobby?");
		String hobby = input.nextLine();

		System.out.println("How much are you willing to donate today?");
		String amount = input.nextLine();
		
		String product = " Thank you for responding " +  name   ;
		
		System.out.println(product);
		

	}

}
