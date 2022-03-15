/*
Author: Brylle Nunez
Date: February 10, 2022
Description: Application that converts value from inches to feet and inches to yards.
*/
import java.util.Scanner;

public class InchConversion {

    public static void inchToFeet(int inches) {
        final double INCHES_IN_FOOT = 12;
        double footConverted = inches / INCHES_IN_FOOT;
        System.out.println("Since there are 12 inches in a foot, " + inches +
        " inches converted to feet is " + footConverted + " feet.");
    }

    public static void inchtoYard(int inches) {
        final double FEET_IN_YARD = 3;
        final double INCHES_IN_FOOT = 12;
        double footConverted = inches / INCHES_IN_FOOT;
        double yardConverted = footConverted / FEET_IN_YARD;
        System.out.printf("Since there are 3 feet in a yard, and 12 inches in a foot, "
        + inches + " inches to yard is %.2f yards.", yardConverted);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length in INCHES >> ");
        int inches = scanner.nextInt();
        inchToFeet(inches);
        inchtoYard(inches);
    }
}
