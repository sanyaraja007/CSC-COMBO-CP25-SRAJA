	
		
		import java.util.Scanner;

		public class BottlesOfBeer {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		      
		        System.out.print("Enter the starting number of bottles: ");
		        int usernum = input.nextInt();

		        for (int B = usernum; B > 0; B--) {
		            if (B == 1) {
		                System.out.println(B + " bottle of beer on the wall,");
		                System.out.println(B + " bottle of beer,");
		            } else {
		                System.out.println(B + " bottles of beer on the wall,");
		                System.out.println(B + " bottles of beer,");
		            }

		            System.out.println("Take one down, pass it around,");

		            if (B - 1 == 1) {
		                System.out.println("1 bottle of beer on the wall.\n");
		            } else if (B - 1 > 1) {
		                System.out.println((B - 1) + " bottles of beer on the wall.\n");
		            } else {
		                System.out.println("No more bottles of beer on the wall.\n");
		            }
		        }

		        System.out.println("Go to the store and buy some more, " + usernum + 
		            (usernum == 1 ? " bottle" : " bottles") + " of beer on the wall.");

		      
		    }
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
