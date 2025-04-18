import java.util.Scanner;
public class CircleCalculation {

	
		    public static double calculateDiameter(double radius) {
		        return 2 * radius;
		    }

		
		    public static double calculateCircumference(double radius) {
		        return 2 * Math.PI * radius;
		    }

		   
		    public static double calculateArea(double radius) {
		        return Math.PI * radius * radius;
		    }

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		     
		        System.out.print("Enter radius of circle: ");
		        double radius = input.nextDouble();

		        // Call methods to calculate values
		        double diameter = calculateDiameter(radius);
		        double circumference = calculateCircumference(radius);
		        double area = calculateArea(radius);

		        System.out.println("Here are your results!!!!:");
		        System.out.println("Circle Diameter is: " + diameter);
		        System.out.println("Circle Circumference is: " + circumference);
		        System.out.println("Circle Area is: " + area);

		        
		    }
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
