import java.util.Scanner;

public class Ch3 {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner (System.in);
		double cm;
		int feet, inches, remainder;
		
		final double CM_PER_INCH = 2.54;
		final int IN_PER_FOOT = 12;
		
		System.out.println("How many cm");
		cm= input.nextDouble();
		
		inches = (int) (cm / CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		
		
		
		System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
		
	}}
		
		

