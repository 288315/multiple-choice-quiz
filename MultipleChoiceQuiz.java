import java.util.*;

public class MultipleChoiceQuiz {
        
    // initialize array
    static String[] questions = {
            "Where is the Spiral Abyss located?",
            "Who is not part of the Liyue Qixing?",
            "What does lupical mean?",
            "How many weak spots does a Ruin Guard have?",
            "Who is Paimon?"
    };

    static String[][] options = {
        {"Cape Oath", "Musk Reef", "Dadaupa Reef"},
        {"Xiao", "Ganyu", "Keqing"},
        {"Friend", "Wolf", "Family"},
        {"2", "3", "1"},
        {"Traveling Companion", "God", "Emergency Food"}
    };

    static char[] correctAnswers = {
        'b',
        'a',
        'c',
        'a',
        'c'
    };
    
    //initialize variables
    static char inputAnswer;
    static int score = 0;
    static int totalQuestions = questions.length;
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("---------------------GENSHIN IMPACT QUIZ---------------------");
        System.out.println("Answer the following questions to the best of your knowledge.");
        System.out.println();
        properQuiz();
        result();
    }
    
    public static void properQuiz() {

        // looping questions
        for (int i = 0; i < totalQuestions; i++) {
            
            // display the question
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);

            // display its options
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((char)(j + 'a') + ". " + options[i][j]);
            }
            
            // input answer by the user
            System.out.print("Enter your answer: ");
            inputAnswer = scan.next().charAt(0);

            // validate answer input by the user
            while (!(inputAnswer == 'a' || inputAnswer == 'b' || inputAnswer == 'c')) {
                System.out.println("Invalid input! " + inputAnswer + " is not in the options.");
                System.out.print("Please enter a, b, or c: ");
                inputAnswer = scan.next().charAt(0);
            }
            
            // Evaluate whether the answer is correct, score increased
            if(inputAnswer == correctAnswers[i]) {
                score++;
            }
            System.out.println();
        }
    }

    public static void result() {
        // calculate results
        int incorrectAnswer = totalQuestions - score;
        int percentage = score * 100 / totalQuestions;

        // display results
        System.out.println("-------------RESULTS-------------");
        System.out.println("Congratulations!");
        System.out.println("You got a score of: " + score + " out of " + totalQuestions);
        System.out.println("Correct Answered Questions: " + score);
        System.out.println("Incorrect Answered Questions: " + incorrectAnswer);
        System.out.println("Percentage: " + percentage + "%");
    }
}
