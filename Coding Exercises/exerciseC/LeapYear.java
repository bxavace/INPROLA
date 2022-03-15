/**
 * AUTHOR: Brylle Nunez
 * DATE: January 12, 2022
 * DESCRIPTION: The program LeapYear.java asks the user for a year (e.g. 2000, 1990, etc.) and checks if
 * that year is a leap year using the given decisions.
 * Write a program that reads a year from the user and displays a message indicating whether or not it is a leap year. You may use either
 * Scanner or JOptionPane in your program. Save the program as LeapYear.java. 
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Variables
        int userYear;

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year >> ");
        userYear = scanner.nextInt();

        // Process and Output
        if(userYear % 400 == 0 || userYear % 4 == 0 && userYear % 100 != 0){
            // userYear must either be divisible by 400 or divisible by 4 but not 100 
            // [e.g., 2100 is not a leap year as it is not 
            // a) divisible by 400 and b) divisible by 4 but not by 100]
            System.out.println("The year " + userYear + " is a leap year.");
            // if all of the conditions are false, do the else statement
         } else System.out.println("The year " + userYear + " is not a leap year.");
    }
}