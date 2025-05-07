
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Totalcalculations {
	private static File readfile = new File ("items.txt");

	private  static double subtotal = 0.0;
	private  final static double TAX_RATE = 0.053;
	private static List<Double> valuelist = new ArrayList<>();
	private  final static String filename = "total.txt";
	private static File  outfile = new File (filename);
	private static PrintWriter printer;






	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(readfile);

		} catch (FileNotFoundException e) {

			System.out.println("An error occurred: " + e.getMessage());
		}

		while(scanner.hasNextLine()){
			double current= 0;
			String line= scanner.nextLine();

			if (line.equals("")){
				continue;
			}

			current = Double.parseDouble(line);
			valuelist.add(current);

		}

		for(double currentdouble: valuelist) {
			subtotal = subtotal + currentdouble;

		}

		double tax = subtotal * TAX_RATE;
		double total = subtotal + tax;


		write2screen (subtotal, tax, total);


		System.out.println("Calculation complete. Results saved to total.txt.");

	}
	public static void write2screen(double subtotal, double tax, double total){
		if (printer == null) {
			try {
				printer = new PrintWriter (filename);
			}
			catch (FileNotFoundException e) {
				System.out.println("couldnt find: error");
				System.out.println(e.getMessage());
				System.exit(-1);
			}

		}

		printer.print("the subtotal is" + subtotal);
		printer.print("\n");
		printer.print("the tax is" +tax);
		printer.print("\n");
		printer.print("the total is" +total);

		printer.print("\n");
		printer.flush();




	}
}
