
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[100]; // holds up to 100 numbers
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
        System.out.println("Numbers in reverse order:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
