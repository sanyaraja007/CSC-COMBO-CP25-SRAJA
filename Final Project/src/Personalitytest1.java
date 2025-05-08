

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

	//    private static int typeA = 0;
	//    private static int typeB = 0;
	//    private static int typeC = 0;
	//    private static int typeD = 0;


	public static void main(String[] args) {
		int[] types = new int [4];
		String userresponse;

		Quiz myquiz = new Quiz();
		//the method calls the questions that will be asked for the personality test.
		System.out.println(myquiz.askQuestion1());

		userresponse = console.next();
		types = responseHandler(userresponse, types);

              
		console.close();
		//setting result string to equal the output of the calculated results method
		// whatever that output equals
//		String results = calculateResults();


		System.out.println (results);
	}

//		try {
//			saveResults("output.txt", results());
//		} catch(IOException e) {
//			//throws an error when the file cant be read
//			System.out.println("Unable to save results.");
//		}
//	}

	

	private static void saveResults(String path, Object results) {
		// TODO Auto-generated method stub
		
	}



	private static String calculateResults(int []arr) {
		return "typeA "  + arr[0] + " typeB  " + arr[1] + " typeC " + arr[3] + " typeD " + arr[4];
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

		// Adds the text onto the text file


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
	 
	
	public static void results(int [] arr) {
		int biggestNum;
		
		for (int i = 0; i< arr.length; i++) {
			
				
		}
		
		
	}
	
}




//4 class variables created for each class type (explained the 4 types in notes)..

//        askQuestion("Which one of these would be chosen if your parents had to describe you in one word?",
//                "Goal-oriented",
//                "Relationship-oriented",
//                "Detail-oriented",
//                "Task-oriented");
//
//
//        askQuestion("Which one of these jobs attracts you?",
//                "Manager",
//                "Sales person",
//                "Programmer",
//                "Social worker");
//
//
//        askQuestion("What group of words motivates you?",
//                "Funny, Opportunity, Challenges, Urgency, Leadership",
//                "Public Recognition, Awards, Latest Styles, Trends",
//                "Control, Challenges, Problem solving",
//                "Stability, Benefits, Security, Calm Work Atmosphere");
//
//        askQuestion("Which word best describes you?",
//                "Risk-taking",
//                "Outgoing",
//                "Logical",
//                "Stabilizing");
//
//        askQuestion("Which of these words would an former employer use to describe you?",
//                "Good under stress",
//                "Enthusiastic",
//                "Prepared",
//                "Cautious");
//
//        askQuestion("During group projects, which is most like you?",
//                "Do most of the work",
//                "Help with the project",
//                "Plan the project",
//                "Hope someone did the project");
//
//        askQuestion("Which color best fits you?",
//                "Blue",
//                "Green",
//                "Gold",
//                "Orange");
//
//        askQuestion("What group of words do you not associate with the most?",
//                "Touchy feely things, long explanations, looking vulnerable, falling into routines and being manipulated",
//                "Public humiliation, being unappreciated, appearing uninvolved, people and things that distract attention",
//                "Uncontrolled emotions, irrational acts, people who are self centered, loss of control",
//                "Risks, pushy people, change, instability");


