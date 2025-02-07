
//Sanya R

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a temperature in Farenheit");
		int farenheit = input.nextInt();
		double celcius = (farenheit - 32) * 5/9;
	
		
		System.out.println("Temperature in Celcius is "+  celcius );
		System.out.println("Temperature in Kelvin is "+ (celcius+ 273.15));

	}

}
