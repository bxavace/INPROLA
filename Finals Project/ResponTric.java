// Notes: used ArrayList instead of Array
// https://stackoverflow.com/questions/15776644/java-how-do-i-initialize-an-array-size-if-its-unknown

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ResponTric {

    public static String getApplianceName() 
    {
        return JOptionPane.showInputDialog(null, "Enter appliance name (e.g., Microwave, Television)", "Appliance", JOptionPane.QUESTION_MESSAGE);
    }

    public static String getWattRating(String appliance)
    {
        return JOptionPane.showInputDialog(null, "Enter watt rating of your " + appliance.toLowerCase(), "Watt Rating", JOptionPane.QUESTION_MESSAGE);
    }

    public static String getTimeConsumption()
    {
        return JOptionPane.showInputDialog(null, "Enter time appliance is used per day (IN MINUTES)", "Time Consumed", JOptionPane.QUESTION_MESSAGE);
    }

    public static void displayOutput(double COST_PER_KW, String appliance, double costPerDay, double kWhUsedPerDay, double carbonPerKW)
    {
        String kwhOutput = String.format("Based on your inputs, you are consuming %2.02f kilowatts per day by using the %s.", kWhUsedPerDay, appliance);
        JOptionPane.showMessageDialog(null, kwhOutput, "kiloWatt-hours Generated", JOptionPane.OK_OPTION);

        String costOutput = String.format("The Meralco Electricity rate for households is Php %2.02f as of December 2021. \nSo, the cost of using the %s alone is Php %2.02f per day. ", COST_PER_KW, appliance, costPerDay);
        JOptionPane.showMessageDialog(null, costOutput, "Cost per kWh Consumed", JOptionPane.OK_OPTION);

        String carbonOutput = String.format("Lastly, the carbon emitted just be the kilo-watt hour per day is %2.02f pounds per day.", carbonPerKW);
        JOptionPane.showMessageDialog(null, carbonOutput, "Carbon Emissions", JOptionPane.OK_OPTION);
    }
    
    public static void displayFinalOutput(double kiloWattsUsed, double carbonEmitted, double energyCost, ArrayList<String> appliances) 
    {
        String display = "Appliances listed: ";
        for (String element: appliances) {
            display += element.toLowerCase() + '\n';
        }

        String finalOutput = String.format("The total energy/electricity consumed by all of the appliances inputted is %2.02f kW.\nMeanwhile, the total carbon emitted from the energy consumption is %2.02f pounds. \nLastly, your daily electricity bill from the appliances is Php %2.02f.", kiloWattsUsed, carbonEmitted, energyCost);
        
        JOptionPane.showMessageDialog(null, display + "\n" + finalOutput, "Electricity, Cost, and Carbon Computed", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void start() 
    {
        String displayMessage = "Welcome to Energy Calculator by Brylle Nunez! \nThis program will compute your appliance's electricity cost as well as the CARBON emitted just by using that appliance! \nThis is inline with United Nation's Sustainable Development Goal of Affordable and Clean Energy & Responsible Consumption. \nEnjoy!";

        JOptionPane.showMessageDialog(null, displayMessage, "Household Appliance Energy Audit + Carbon Emission Calculator", JOptionPane.WARNING_MESSAGE);
    }

    public static boolean innerLoopPrompt()
    {
        int listingPrompt;
        listingPrompt = JOptionPane.showConfirmDialog(null, "Continue auditing appliances?", "Appliance Energy Audit", JOptionPane.YES_NO_OPTION);

        if (listingPrompt == JOptionPane.YES_OPTION) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public static boolean mainLoopPrompt() 
    {
        int termiString;
        termiString = JOptionPane.showConfirmDialog(null, "Restart the program?", "Restart Program", JOptionPane.YES_NO_OPTION);
        if(termiString == JOptionPane.YES_OPTION){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        boolean checkBool = true;
        while (checkBool) // Whole program loop 1
        {
            // Display message
            start();

            // Declare variables (for the total part)
            ArrayList<String> appliances = new ArrayList<String>();
            double kiloWattsUsed, carbonEmitted, energyCost;
            boolean toContinue = true;
            kiloWattsUsed = 0;
            carbonEmitted = 0;
            energyCost = 0;
            
            while (toContinue) // Listing of appliance loop 2
            {
                // Declare variables for the energy input
                String appliance;
                double wattRating, timeUsed, kWhUsedPerDay, costPerDay, carbonPerKW;
                final double COST_PER_KW = 9.77;
                final double MINUTES_IN_HOUR = 60.00; 
                final double WATT_KILOWATT = 1000.00;
                final double CARBON_PER_KILOWATT = 0.85;

                // Store the user inputs in variables, 
                // then parse to respective type
                appliance = getApplianceName();
                wattRating = (double) Double.parseDouble(getWattRating(appliance));
                timeUsed = (double) Double.parseDouble(getTimeConsumption());


                // Audit the following user inputs stored in variables
                // kiloWatt hours used per day
                kWhUsedPerDay = wattRating * ((timeUsed / MINUTES_IN_HOUR) / WATT_KILOWATT);
                // cost from energy consumption
                costPerDay = kWhUsedPerDay * COST_PER_KW;
                // carbon emitted from energy consumption
                carbonPerKW = kWhUsedPerDay * CARBON_PER_KILOWATT;

                // Display the appliance's energy audit
                displayOutput(COST_PER_KW, appliance, costPerDay, kWhUsedPerDay, carbonPerKW);

                // Prompt if the user wants to end the energy audit,
                // or if the user wants to add more appliances.
                // Either way, the audit data from recent appliance input will be
                // added to the total variables to be displayed at the end
                // of the program.
                kiloWattsUsed = kiloWattsUsed + kWhUsedPerDay;
                carbonEmitted = carbonEmitted + carbonPerKW;
                energyCost = energyCost + costPerDay;
                appliances.add(appliance);
                toContinue = innerLoopPrompt();
            }
            displayFinalOutput(kiloWattsUsed, carbonEmitted, energyCost, appliances);
            checkBool = mainLoopPrompt();
        }

        // End of the program
        JOptionPane.showMessageDialog(null, "Thank you for using the program!", "Electricity and Carbon Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}