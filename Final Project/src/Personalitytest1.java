

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
    private static int typeA = 0;
    private static int typeB = 0;
    private static int typeC = 0;
    private static int typeD = 0;

//4 class variables created for each class type (explained the 4 types in notes)..

    public static void main(String[] args) {

        //the method calls the questions that will be asked for the personality test.


        askQuestion("Which one of these would be chosen if your parents had to describe you in one word?",
                "Goal-oriented",
                "Relationship-oriented",
                "Detail-oriented",
                "Task-oriented");


        askQuestion("Which one of these jobs attracts you?",
                "Manager",
                "Sales person",
                "Programmer",
                "Social worker");


        askQuestion("What group of words motivates you?",
                "Funny, Opportunity, Challenges, Urgency, Leadership",
                "Public Recognition, Awards, Latest Styles, Trends",
                "Control, Challenges, Problem solving",
                "Stability, Benefits, Security, Calm Work Atmosphere");

        askQuestion("Which word best describes you?",
                "Risk-taking",
                "Outgoing",
                "Logical",
                "Stabilizing");

        askQuestion("Which of these words would an former employer use to describe you?",
                "Good under stress",
                "Enthusiastic",
                "Prepared",
                "Cautious");

        askQuestion("During group projects, which is most like you?",
                "Do most of the work",
                "Help with the project",
                "Plan the project",
                "Hope someone did the project");

        askQuestion("Which color best fits you?",
                "Blue",
                "Green",
                "Gold",
                "Orange");

        askQuestion("What group of words do you not associate with the most?",
                "Touchy feely things, long explanations, looking vulnerable, falling into routines and being manipulated",
                "Public humiliation, being unappreciated, appearing uninvolved, people and things that distract attention",
                "Uncontrolled emotions, irrational acts, people who are self centered, loss of control",
                "Risks, pushy people, change, instability");

        console.close();
//setting result string to equal the output of the calculated results method
        // whatever that output equals
        String results = calculateResults();


        System.out.println(results);

        try {
            saveResults("output.txt", results);
        } catch(IOException e) {
            //throws an error when the file cant be read
            System.out.println("Unable to save results.");
        }
    }

	private static void askQuestion(String question, String answerA, String answerB, String answerC, String answerD) {
        // ask question.. method calls for 5 parameters.
        System.out.println(question);
        System.out.println("A: " + answerA);
        System.out.println("B: " + answerB);
        System.out.println("C: " + answerC);
        System.out.println("D: " + answerD);
//ask question method


        // this loop accepts the user answer choice if it is a valid choice and then increments the corresponding personality type by 1
        while(true) {
            String response = console.nextLine();
            if(response.equalsIgnoreCase("A")) typeA++;
            else if(response.equalsIgnoreCase("B")) typeB++;
            else if(response.equalsIgnoreCase("C")) typeC++;
            else if(response.equalsIgnoreCase("D")) typeD++;
            else {
                System.out.println("Invalid response. Try again.");
                continue;
                // ignores case.. which is helpful and can process whether the user answers with capitalization or not!!
            }
            break;

            // breaks out of the loop
        }
	}

    private static String calculateResults() {
        return "typeA = " + typeA + " typeB = " + typeB + " typeC = " + typeC + " typeD = " + typeD;
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
}

