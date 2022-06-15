import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the best zodiac sign?";
        String choiceOne = "scorpio";
        String choiceTwo = "leo";
        String choiceThree = "virgo";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = scanner.next();

        // If the user's input matches the correctAnswer...
        if (correctAnswer.equals(userInput.toLowerCase(Locale.ROOT))){
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("correct answer!");
        }else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Your answer is not correct. the correct answer is: " + correctAnswer);
        }

    }

}