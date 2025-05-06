

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[100]; // holds up to 100 numbers
        int[] Rarray = new int [100];
        int count = 0;
    

        System.out.println("Enter positive integers (enter -1 to end):");

        // numbers into the array
        while (count < 100) {
            int input = in.nextInt();

            if (input == -1) {
                break;
            } else if (input >= 0) {
                numbers[count] = input;
                count++;
            } else {
                System.out.println("Only positive numbers are allowed (or -1 to stop).");
            }
        }
        
        // Print the numbers in reverse order
        System.out.println(Arrays.toString(numbers));
        System.out.println("Numbers in reverse order:");
        for(int i=0 ; i < numbers.length/2; i++) {
        	int temp = numbers[i];
        	numbers[i]= numbers[numbers.length -i -1];
        	numbers[numbers.length -i -1] = temp;
        	
        }
       // for (int i = count - 1; i >= 0; i--) {
        	//int reverserIndex = 0;
        	//Rarray[reverserIndex] = numbers[i];
        	//reverserIndex++;
        	
        	
       // }
        
        System.out.println(Arrays.toString(numbers));
    }
}
