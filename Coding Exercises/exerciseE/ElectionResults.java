/*
Author: Brylle Nunez
Date: February 24, 2022
Description: Program that displays election results by votes received and % of the votes per candidate.
*/
import java.util.Scanner;

public class ElectionResults {
    public static void main(String[] args) {
        // Declare arrays
        String[] candidates = new String[5];
        double[] voteCount = new double[5];
        double[] votePercent = new double[5];
        int totalVoteCount = 0;

        // Input name/vote count to arrays (scanner)
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerVote = new Scanner(System.in);
        for (int i = 0; i < candidates.length; i++)
        {
            System.out.print("Enter candidate's last name >> ");
            candidates[i] = scannerName.nextLine();
            System.out.print("Enter the candidate's vote count >> ");
            voteCount[i] = scannerVote.nextInt();

            // Get total votes from the candidate
            totalVoteCount += voteCount[i];
        }

        // Getting the percentage of each vote
        for (int i = 0; i < votePercent.length; i++) votePercent[i] = voteCount[i] * 100.0 / totalVoteCount;

        // Display the table (used print formatting; Stack Overflow)
        String col1 = "Candidate Name", col2 = "Votes Received", col3 = "% of the Total Vote";
        System.out.printf("%-20s %-20s %-20s", col1, col2, col3);
        System.out.println();
        for (int i = 0; i < candidates.length; i++)
        {
            String candidateName = candidates[i];
            int votesCount = (int) voteCount[i];
            double votesPercent = votePercent[i];
            System.out.printf("%-20s %-20d %1.2f %n", candidateName, votesCount, votesPercent);
        }

        // Display total votes, then winner
        System.out.printf("Total votes: %10s", totalVoteCount);
        System.out.println();

        // Compare votes and display winner
        double max = voteCount[0];
        int winnerIndex = 0;

        for (int i = 1; i < voteCount.length; i++)
        {
            if (voteCount[i] > max)
            {
                max = voteCount[i];
                winnerIndex = i;
            }
        }
        System.out.print("The winner of the election is " + candidates[winnerIndex]);

        // notes on print formatting: https://www.baeldung.com/java-printstream-printf
    }
}
