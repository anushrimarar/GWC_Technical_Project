//GWC Technical Project
//Anushri Marar
//Date: 11/16/17
//Time: Approx 2 hours


import java.util.Scanner;

public class GWC_Technical_Project {


    public static int computer() {

        int computerChoice = (int) (Math.random() * 3 + 1);
//        System.out.println(computerChoice);

        return computerChoice;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Rock Paper Scissors Game!\n\nMenu: ");

        int numberOfPlayerWins = 0;
        int numberOfComputerWins = 0;
        int numberOfTies = 0;
        int totalGames = 0;

        int gameOption = 0;

        while (gameOption != 3) {

            boolean b = true;
            while (b) {
                System.out.println("\n1. Play Game" +
                        "\n2. Look at my stats" +
                        "\n3. Exit");

                try {
                    System.out.print("\nPlease choose a menu option: ");
                    gameOption = input.nextInt();
                    b = false;
                } catch (Exception e) {
                    System.out.println("Not a valid answer, please try again.");
                    input.nextLine();
                }
            }

            if (gameOption == 1) {
                System.out.print("What is your choice of weapon? (Rock, Paper, or Scissors): ");

                //               boolean opt = true;

                //               while (opt) {
                //                   try {
                String option = input.next();
                option = option.toUpperCase();


                int computerChoice = computer();

                if (option.equals("ROCK")) {
                    //                   System.out.println("computer choice is" + computerChoice);
                    if (computerChoice == 1) {
                        System.out.println("The computer choose rock. It's a tie!");
                        numberOfTies++;
                    } else if (computerChoice == 2) {
                        System.out.println("The computer choose paper. Computer wins!");
                        numberOfComputerWins++;
                    } else if (computerChoice == 3) {
                        System.out.println("The computer choose scissors! You win!");
                        numberOfPlayerWins++;
                    }

                    totalGames++;

                } else if (option.equals("SCISSORS")) {
                    //                  System.out.println("computer choice is" + computerChoice);
                    if (computerChoice == 1) {
                        System.out.println("The computer choose rock. Computer wins!");
                        numberOfComputerWins++;
                    } else if (computerChoice == 2) {
                        System.out.println("The computer choose paper. You win!");
                        numberOfPlayerWins++;
                    } else if (computerChoice == 3) {
                        System.out.println("The computer choose scissors! It's a tie!");
                        numberOfTies++;
                    }

                    totalGames++;

                } else if (option.equals("PAPER")) {
//                    System.out.println("computer choice is" + computerChoice);
                    if (computerChoice == 1) {
                        System.out.println("The computer choose rock. You win!");
                        numberOfPlayerWins++;
                    } else if (computerChoice == 2) {
                        System.out.println("The computer choose paper. It's a tie!");
                        numberOfTies++;
                    } else if (computerChoice == 3) {
                        System.out.println("The computer choose scissors! Computer wins!");
                        numberOfComputerWins++;
                    }
                    totalGames++;
                } else {
                    System.out.println("That is not a valid option. Please try again.");
                }
/*
                    } catch (Exception e) {
                        System.out.println("Not a valid option. Please try again.");
                        input.nextLine();
                    } */


            } else if (gameOption == 2) {
                System.out.println("Here are your stats for Rock, Paper, Scissors");
                double percentOfWins = Math.round(((double) numberOfPlayerWins / (double) totalGames) * 100);
                System.out.println("Total Number of Player wins: " + numberOfPlayerWins +
                        "\nTotal Number of Computer wins: " + numberOfComputerWins +
                        "\nTotal Number of Ties: " + numberOfTies +
                        "\nPercent of Player wins: " + percentOfWins + "% " +
                        "\nTotal games: " + totalGames);
            }
        }
         if (gameOption == 3) {
            System.exit(0);
        }
    } //end of main method

} //end of class
