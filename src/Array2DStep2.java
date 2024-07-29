import java.util.Scanner;

public class Array2DStep2 {

    // Display the menu for day 1
    static void show1() {
        System.out.println("1. Play");
        System.out.print("Please Choose: ");
    }

    // Display the menu for subsequent days
    static void showAll() {
        System.out.println("1. Play");
        System.out.println("2. Report");
        System.out.println("3. Exit");
        System.out.print("Please Choose: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_PLAYERS = 10; // Maximum number of players

        int[][] bets = new int[MAX_PLAYERS][100];  // Maximum 100 bets per player
        int[] betCount = new int[MAX_PLAYERS];     // Store the number of bets for each player
        int[] winnings = new int[MAX_PLAYERS];     // Store the winnings for each player
        int[] ownerGains = new int[100];           // Owner's gains each day
        int[] ownerLosses = new int[100];          // Owner's losses each day

        int day = 1;  // Start at day 1

        while (true) {
            // Show menu options based on the day
            if (day == 1) {
                show1();
            } else {
                showAll();
            }
            int choice = scanner.nextInt();

            // Validate input choice on day 1
            if (day == 1 && choice > 1) {
                System.out.println("Invalid choice. Please enter 1.");
                continue;
            }

            // Handle the user's choice
            if (choice == 1) {
                System.out.println("Day " + day);

                int playerCount = 0;  // Reset player count for the new day

                // Loop for each player's betting process
                while (true) {
                    System.out.print("Player " + (playerCount + 1) + ", how much do you want to bet?: ");
                    int count = scanner.nextInt();
                    if (count <= 0) {
                        System.out.println("You must bet more than 0");
                        continue;
                    }

                    betCount[playerCount] = count;
                    int betIndex = 0;

                    // Collect bets and prices from the player
                    for (int i = 0; i < count; i++) {
                        while (true) {
                            System.out.print("Num" + (i + 1) + ": ");
                            int num = scanner.nextInt();

                            boolean isDuplicate = false;
                            for (int j = 0; j < betIndex; j += 2) {
                                if (bets[playerCount][j] == num) {
                                    isDuplicate = true;
                                    break;
                                }
                            }

                            if (isDuplicate) {
                                System.out.println("Duplicate number. Please choose a different number.");
                            } else {
                                bets[playerCount][betIndex] = num;
                                betIndex++;
                                break;
                            }
                        }

                        System.out.print("Price" + (i + 1) + ": ");
                        bets[playerCount][betIndex] = scanner.nextInt();
                        betIndex++;
                    }

                    // Ask if the user wants to continue entering bets
                    char continueChoice;
                    do {
                        System.out.print("Do you want to continue? (y/n): ");
                        continueChoice = scanner.next().toLowerCase().charAt(0);
                        if (continueChoice != 'y' && continueChoice != 'n') {
                            System.out.println("Invalid choice. Please enter 'y' or 'n'.");
                        }
                    } while (continueChoice != 'y' && continueChoice != 'n');

                    // If the user chooses not to continue, calculate winnings and losses
                    if (continueChoice == 'n') {
                        int winningNumber = 99; // Set the winning number

                        int totalGains = 0;
                        int totalLosses = 0;

                        // Calculate winnings for each player and update owner's gains and losses
                        for (int player = 0; player <= playerCount; player++) {
                            for (int i = 0; i < betCount[player] * 2; i += 2) {
                                if (bets[player][i] == winningNumber) {
                                    int winAmount = bets[player][i + 1] * 80;
                                    winnings[player] += winAmount;
                                    totalLosses += winAmount;
                                } else {
                                    totalGains += bets[player][i + 1];
                                }
                            }
                        }

                        ownerGains[day - 1] = totalGains;
                        ownerLosses[day - 1] = totalLosses;

                        // Display winners
                        boolean hasWinner = false;
                        for (int player = 0; player <= playerCount; player++) {
                            if (winnings[player] > 0) {
                                hasWinner = true;
                                break;
                            }
                        }

                        if (hasWinner) {
                            System.out.println("Winners List:");
                            for (int player = 0; player <= playerCount; player++) {
                                if (winnings[player] > 0) {
                                    System.out.println("Player " + (player + 1) + " won $" + winnings[player]);
                                }
                            }
                        } else {
                            System.out.println("No winners.");
                        }

                        System.out.println("+++++++++++++++++++++++++++++");
                        System.out.println("Owner Gains: $" + totalGains);
                        System.out.println("Owner Losses: $" + totalLosses);

                        day++; // Increment the day
                        break;
                    }

                    playerCount++;
                    if (playerCount >= MAX_PLAYERS) {
                        System.out.println("Maximum number of players reached.");
                        break;
                    }
                }
            } else if (choice == 2) {
                // Display the report for each day
                System.out.println("-----------------------------");
                for (int d = 1; d < day; d++) {
                    System.out.println("Day " + d);
                    System.out.println("Amount+  Amount-");
                    System.out.println(ownerGains[d - 1] + "\t\t  " + ownerLosses[d - 1]);
                    System.out.println("-----------------------------");
                }
            } else if (choice == 3) {
                break; // Exit the program
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close(); // Close the scanner
    }
}
