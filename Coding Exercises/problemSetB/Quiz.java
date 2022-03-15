/*
Author: Brylle Nunez
Date: February 10, 2022
Description: Application that creates a quiz that contains 10 questions with 4 multiple choices.
*/
import java.util.Scanner;

public class Quiz {

    // Method that asks user for their input
    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your answer >> [A/B/C/D] ");
        String answer = scanner.nextLine();
        return answer;
        }
    
    // Method that checks the user input, returns a boolean value to be checked later on
    public static boolean checkAnswer(String correctAnswer, String userAnswer) {
        boolean isCorrect, isNot;
        if (userAnswer.toLowerCase().equals(correctAnswer)) {
            System.out.println("Congratulations! You got it correct! \n\n");
            isCorrect = true;
            return isCorrect;
        } else {
            System.out.println("Sorry, you got it wrong! \nThe answer is " + 
            (correctAnswer.substring(0, 1).toUpperCase() + correctAnswer.substring(1) + "\n\n"));
            isNot = false;
            return isNot;
            }
        }
    
    // Quiz method
    public static void startQuiz() {
        // Declare variables
        int correctScoreCount = 0;
        int incorrectScoreCount = 0;

        // Item 1
        System.out.println("QUESTION 1: Who composed the Lacrimosa?"); // Question
        System.out.println("A. Beethoven" + "\t" + "B. Mozart\n" +
        "C. Wagner" + "\t" + "D. Bach"); // Choices
        String answer = getAnswer();
        checkAnswer("b", answer);

        // Score check
        if(checkAnswer("b", answer) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // // Item 2
        System.out.println("QUESTION 2: What is my favorite christmas movie?"); // Question
        System.out.println("A. Holidate" + "\t" + "B. Love, Actually\n" +
        "C. Christmas Chronicles" + "\t" + "D. Home Alone"); // Choices
        String answer2 = getAnswer();
        checkAnswer("d", answer2);

        // // Score check
        if(checkAnswer("d", answer2) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Item 3
        System.out.println("QUESTION 3: What is my favorite Marvel movie?");
        System.out.println("A. Guardians of the Galaxy\tB. Spiderman 2002\nC. Avengers: Endgame\tD. Thor: Ragnarok");
        String answer3 = getAnswer();
        checkAnswer("a", answer3);
        // Score check
        if(checkAnswer("a", answer3) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Item 4
        System.out.println("QUESTION 4: What is my favorite DC movie?");
        System.out.println("A. Superman\tB. The Suicide Squad\nC. Aquaman\tD. Justice League");
        String answer4 = getAnswer();
        checkAnswer("b", answer4);
        // Score check
        if(checkAnswer("b", answer4) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Item 5
        System.out.println("QUESTION 5: What is my first instrument?");
        System.out.println("A. Piano\tB. Drums\nC. Guitar\tD. Violin");
        String answer5 = getAnswer();
        checkAnswer("c", answer5);
        // Score check
        if(checkAnswer("c", answer5) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Item 6
        System.out.println("QUESTION 6: What is my favorite food?");
        System.out.println("A. Fried Bacon\tB. Sinigang\nC. Cheeseburger \tD. French Fries");
        String answer6 = getAnswer();
        checkAnswer("a", answer6);
        // Score check
        if(checkAnswer("a", answer6) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Item 7
        System.out.println("QUESTION 7: Who is my favorite singer/musician?");
        System.out.println("A. Queens\tB. Bruno Mars\nC. Kenny Rogers \tD. Louie Zhong");
        String answer7 = getAnswer();
        checkAnswer("d", answer7);
        // Score check
        if(checkAnswer("d", answer7) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Item 8
        System.out.println("QUESTION 8: What is my favorite constellation?");
        System.out.println("A. Ursa\tB. Orion\nC. Taurus \tD. Cassiopeia");
        String answer8 = getAnswer();
        checkAnswer("b", answer8);
        // Score check
        if(checkAnswer("b", answer8) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Item 9
        System.out.println("QUESTION 9: What is my favorite sci-fi movie?");
        System.out.println("A. Martian\tB. Independence Day\nC. Interstellar \tD. Ad Astra");
        String answer9 = getAnswer();
        checkAnswer("c", answer9);
        // Score check
        if(checkAnswer("c", answer9) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Item 10
        System.out.println("QUESTION 10: What is my favorite country?");
        System.out.println("A. Japan\tB. Canada\nC. Sweden \tD. Africa");
        String answer10 = getAnswer();
        checkAnswer("c", answer10);
        // Score check
        if(checkAnswer("c", answer10) == true) {
            correctScoreCount = correctScoreCount + 1;
        } else {
            incorrectScoreCount = incorrectScoreCount + 1;
        }

        // Display total score
        System.out.println("SCORE \nCorrect answers: " + correctScoreCount + "\nIncorrect answers: " + incorrectScoreCount);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to my\nPERSONAL POP QUIZ!\n\nMy quiz is composed of 10 questions, which are my personal interests as topic.\nHave fun!\n" +
        "==================================");
        startQuiz();
    }
}