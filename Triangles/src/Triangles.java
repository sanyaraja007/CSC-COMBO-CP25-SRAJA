

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean runAgain = true;

        while (runAgain) {
            int size = 0;

            // Input and validate size
            while (true) {
                System.out.print("Enter the size of the triangle (1 to 50): ");
                if (in.hasNextInt()) {
                    size = in.nextInt();
                    if (size >= 1 && size <= 50) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and 50.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    in.next(); // consume invalid input
                }
            }

            // fill character
            System.out.print("Enter the fill character: ");
            char fill = in.next().charAt(0);

            // Draw triangle
            for (int i = 1; i <= size; i++) {
                // Print spaces to center the triangle
                for (int x = 0; x < size - i; x++) {
                    System.out.print(" ");
                }
                // Print fill characters with spaces
                for (int s = 0; s < i; s++) {
                    System.out.print(fill + " ");
                }
                System.out.println(); // next line
            }

            // want to run again?
            System.out.print("Do you want to run the program again? (y/n): ");
            String response = in.next();
            if (!response.equalsIgnoreCase("y")) {
                runAgain = false;
            }
        }

        System.out.println("Program exited.");
       
    }
}
