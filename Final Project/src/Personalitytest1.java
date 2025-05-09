

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Personalitytest1 {

	// created this project in order to help clients find suitable employers or employees. A lot of companies have different ways of finding suitable employers during the interview stage.. and maybe in the future its based off quizzes..
	//people/users will take this quiz and be assorted into 4 different types
	//Type A = the director : goal-oriented, risk-taking, good under stress
	//Type B = The socializer : relationship- oriented, outgoing, enthusiastic
	//Type C = The Thinker: detail-oriented, logical, prepared
	//Type D = The Supporter: task-oriented, stabilizing, cautious

	//creating the new scanner object to grab the user input

	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int[] types = new int [4];
		String userresponse;

		Quiz myquiz = new Quiz();
		
		System.out.println(myquiz.askQuestion1());
		userresponse = console.next().toUpperCase();
		types = responseHandler(userresponse, types);
		
		System.out.println(myquiz.askQuestion3());
		userresponse = console.next().toUpperCase();
		types = responseHandler(userresponse, types);
		
		System.out.println(myquiz.askQuestion3());
		userresponse = console.next().toUpperCase();
		types = responseHandler(userresponse, types);
		
		System.out.println(myquiz.askQuestion4());
		userresponse = console.next().toUpperCase();
		types = responseHandler(userresponse, types);
		
		System.out.println(myquiz.askQuestion5());
		userresponse = console.next().toUpperCase();
		types = responseHandler(userresponse, types);
		
		System.out.println(myquiz.askQuestion6());
		userresponse = console.next().toUpperCase();
		types = responseHandler(userresponse, types);
		
		System.out.println(myquiz.askQuestion7());
		userresponse = console.next().toUpperCase();
		types = responseHandler(userresponse, types);
		
		System.out.println(myquiz.askQuestion8());
		userresponse = console.next().toUpperCase();
		types = responseHandler(userresponse, types);
		
	
		console.close();
		
String results = calculateResults(types);
		System.out.println (results);
	
	try {
		saveResults("output.txt", results);
		} catch(IOException e) {
			//throws an error when the file cant be read
			
			System.out.println("Unable to save results.");
	}
}
	private static String calculateResults(int[] arr) {
        int maxIndex = 0;
        String[] types = {
            "The Director: Goal-oriented, risk-taking, good under stress",
            "The Socializer: Relationship-oriented, outgoing, enthusiastic",
            "The Thinker: Detail-oriented, logical, prepared",
            "The Supporter: Task-oriented, stabilizing, cautious"
        };
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Print the tallies and result
        System.out.println("typeA:  " + arr[0] + " \ntypeB:  " + arr[1] + " \ntypeC:  " + arr[2] + " \ntypeD:  " + arr[3]);
        System.out.println("Your highest score: " + arr[maxIndex]);
        System.out.println("Personality Type: " + types[maxIndex]);

        return types[maxIndex]; 
    }
	
	// returning the results. After you answer the questions, it displays the tally

	//path: It places the text file in the original project folder
	private static void saveResults(String path, String results) throws IOException {
		//throws an error if there is a problem with the file...
		FileWriter writer = new FileWriter(path);
		//writing the results to the file
		writer.write(results);
		//writing the personality explanations into the file
		String personality = "\n If your typeA score is the highest your personality type is The Director. \n If your typeB score is the highest your personality type is The Socializer. \n If your typeC score is the highest your personality type is The Thinker,\n If your typeD score is the highest your personality type is The Supporter.\n If you have a tie for the score you are a mix of both.";
		writer.write(personality);

	}
	public static int[] responseHandler(String res, int[] arr) { 
		if (res.equals("A")) {
			arr[0]++;

		}
		else if (res.equals("B")) {
			arr [1]++;

		}
		else if (res.equals("C")) {
			arr [2]++;
		}
		else {
			arr[3]++;
		}
		return arr;
	}
	}
	





