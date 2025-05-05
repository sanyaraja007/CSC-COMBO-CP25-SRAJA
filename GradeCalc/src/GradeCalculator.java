

import java.util.Scanner;

public class GradeCalculator{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter your percentage grade: ");
        double PercentageGrade = scanner.nextDouble();
        
      
        String letterGrade;
        

        if (PercentageGrade >= 92) {
            letterGrade = "A";
        } else if (PercentageGrade >= 89) {
            letterGrade = "A-";
        } else if (PercentageGrade >= 87) {
            letterGrade = "B+";
        } else if (PercentageGrade >= 82) {
            letterGrade = "B";
        } else if (PercentageGrade >= 79) {
            letterGrade = "B-";
        } else if (PercentageGrade >= 77) {
            letterGrade = "C+";
        } else if (PercentageGrade >= 72) {
            letterGrade = "C";
        } else if (PercentageGrade >= 69) {
            letterGrade = "C-";
        } else if (PercentageGrade >= 67) {
            letterGrade = "D+";
        } else if (PercentageGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
      
        System.out.println("Your letter grade is: " + letterGrade);
        
     

	}

}
