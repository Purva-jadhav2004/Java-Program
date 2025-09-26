package assignment1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

class CricketPlayer {
    String name;
    int noOfInnings;
    int noOfTimesNotOut;
    int totalRuns;
    double batAvg;

    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
        this.batAvg = calculateBattingAverage(totalRuns, noOfInnings, noOfTimesNotOut);
    }

    // Static method to calculate batting average
    public static double calculateBattingAverage(int totalRuns, int noOfInnings, int noOfTimesNotOut) {
        try {
            int dismissals = noOfInnings - noOfTimesNotOut;
            if (dismissals <= 0) {
                // Handle cases where a player has not been dismissed or innings played is less than not-outs
                return 0.0; // Or throw a custom exception if specific handling is required
            }
            return (double) totalRuns / dismissals;
        } catch (ArithmeticException e) {
            // This catch block is technically not reachable for division by zero with integer dismissals <= 0
            // but included for general exception handling principles.
            System.err.println("Error calculating batting average: " + e.getMessage());
            return 0.0;
        }
    }

    // Static method to sort players by batting average
    public static void sortPlayers(CricketPlayer[] players) {
        Arrays.sort(players, Comparator.comparingDouble(player -> player.batAvg));
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Batting Average: " + String.format("%.2f", batAvg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = 0;
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer for the number of players.");
            scanner.close();
            return;
        }
        scanner.nextLine(); // Consume newline

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            int noOfInnings = 0;
            int noOfTimesNotOut = 0;
            int totalRuns = 0;

            try {
                System.out.print("Number of Innings: ");
                noOfInnings = scanner.nextInt();
                System.out.print("Number of Times Not Out: ");
                noOfTimesNotOut = scanner.nextInt();
                System.out.print("Total Runs: ");
                totalRuns = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Invalid input for numerical fields. Please enter integers.");
                scanner.nextLine(); // Consume invalid input
                i--; // Re-enter details for the current player
                continue;
            }
            scanner.nextLine(); // Consume newline

            players[i] = new CricketPlayer(name, noOfInnings, noOfTimesNotOut, totalRuns);
        }

        // Sort the players
        sortPlayers(players);

        // Display player details in sorted order
        System.out.println("\nPlayer Details (Sorted by Batting Average):");
        for (CricketPlayer player : players) {
            System.out.println(player);
        }

        scanner.close();
    }
}