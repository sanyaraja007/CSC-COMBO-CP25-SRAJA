
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Totalcalculations {
    public static void main(String[] args) {
        double subtotal = 0.0;
        final double TAX_RATE = 0.053;

        try {
            File inputFile = new File("items.txt");
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextDouble()) {
                double price = scanner.nextDouble();
                subtotal += price;
            }

            scanner.close();

            double tax = subtotal * TAX_RATE;
            double total = subtotal + tax;

            FileWriter writer = new FileWriter("total.txt");
            writer.write(String.format("Subtotal: $%.2f%n", subtotal));
            writer.write(String.format("Sales Tax (5.3%%): $%.2f%n", tax));
            writer.write(String.format("Total: $%.2f%n", total));
            writer.close();

            System.out.println("Calculation complete. Results saved to total.txt.");

        } catch (IOException x) {
            System.out.println("An error occurred: " + x.getMessage());
        }
    }
}
