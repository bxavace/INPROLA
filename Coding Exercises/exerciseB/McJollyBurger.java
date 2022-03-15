/*
** Author: Brylle Nunez
** Date: December 16, 2021
** Description: This program accepts two parameters: any amount of Regular burger and any amount of Kiddie burger
** After accepting response, the program computes for the revenue and profit of each burgers
** Finally, the program also calculates the total revenue and profit for both burgers
*/

import javax.swing.JOptionPane;

public class McJollyBurger {
    public static void main(String[] args) {
        // This block of codes serves as a variable declaration to be used in next
        // commands
        String regularBurgerString, kiddieBurgerString; // Declared two strings that accepts input from JOption Dialog
        final int RBURGERPRICE = 200, KBURGERPRICE = 125, RBURGERCOST = 135, KBURGERCOST = 90; // Constants from the given
        int regularBurgerAmtRevenue, kiddieBurgerAmtRevenue, regularBurgerCost, kiddieBurgerCost, regularBurgerProfit, 
                kiddieBurgerProfit, totalRevenue, totalProfit; // Declared variables to be used for computation

        // This block of code is an introduction message to the program (Not necessary, but for aesthetics)
        JOptionPane.showMessageDialog(null, "This program accepts the number of each burger with price stated below:"
                + "\nSelling price of a Regular Burger: PHP 200" + "\nSelling price of a Kiddie Burger: PHP 125"
                + "\nThe cost of producing each burger are stated as follows:"
                + "\nPHP 135 for Regular Burgers and PHP 90 for Kiddie Burgers. Have fun!",
                "McJolly Burger Sales Calculator", JOptionPane.INFORMATION_MESSAGE);

        // This block of codes ask the user for the amount of regular and kiddie burgers
        // to be sold and automatically computes it and stores it as a revenue
        regularBurgerString = JOptionPane.showInputDialog(null, "Enter the amount of Regular Burgers to be sold:",
                "Regular Burgers Section", JOptionPane.INFORMATION_MESSAGE);
        regularBurgerAmtRevenue = Integer.parseInt(regularBurgerString) * RBURGERPRICE; // The amount inputted by the user is automatically computed and stored in this variable

        kiddieBurgerString = JOptionPane.showInputDialog(null, "Enter amount of Kiddie Burgers to be sold:",
                "Kiddie Burgers Section", JOptionPane.INFORMATION_MESSAGE);
        kiddieBurgerAmtRevenue = Integer.parseInt(kiddieBurgerString) * KBURGERPRICE; // The amount inputted by the user is automatically computed and stored in this variable

        // This block of codes computes for the profit of each burger (Revenue - Cost = Profit)

        // Costs of each burger produced
        regularBurgerCost = Integer.parseInt(regularBurgerString) * RBURGERCOST; // Number of burgers inputted by the user multiplied by its constant cost
        kiddieBurgerCost = Integer.parseInt(kiddieBurgerString) * KBURGERCOST; // Same as above

        // Profit of each burger produced and sold
        regularBurgerProfit = regularBurgerAmtRevenue - regularBurgerCost; // Difference of the revenue and cost stored in a burger's profit variable
        kiddieBurgerProfit = kiddieBurgerAmtRevenue - kiddieBurgerCost; // Same as above

        // Total revenue and profit from selling the burgers
        totalRevenue = regularBurgerAmtRevenue + kiddieBurgerAmtRevenue; // Sum of the two revenues stored in a new variable
        totalProfit = regularBurgerProfit + kiddieBurgerProfit; // Sum of the two profits stored in a new variable

        // Displaying all of the required parameters
        // Regular Burger and Kiddie Burger's: Revenue and profit
        // Total revenue and profit from selling both burgers
        JOptionPane.showMessageDialog(null,
                "REGULAR BURGER: " + "\nRevenue Generated: PHP " + regularBurgerAmtRevenue + "\nProfit Generated: PHP "
                        + regularBurgerProfit + "\nKIDDIE BURGER: " + "\nRevenue Generated: PHP "
                        + kiddieBurgerAmtRevenue + "\nProfit Generated: PHP " + kiddieBurgerProfit
                        + "\nTOTAL REVENUE: PHP " + totalRevenue + "\nTOTAL PROFIT: PHP " + totalProfit,
                "McJolly Burger Computations", JOptionPane.INFORMATION_MESSAGE); // Overall message

    }
}
