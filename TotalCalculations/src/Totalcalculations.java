
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;






public class Totalcalculations {
	static File readfile = new File ("items.txt");
	
    static double subtotal = 0.0;
    final static double TAX_RATE = 0.053;
    static List<Double> valuelist = new ArrayList<>();
    final static String filename = "total.txt";
     File  outfile = new File (filename);
    static PrintWriter printer;
    
    
    
    
    
    
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
        
        printer.print(subtotal);
        printer.print("\n");
        printer.print(tax);
        printer.print("\n");
        printer.print(total);
        
        printer.print("\n");
        printer.flush();
        

    
    	
    }
}
