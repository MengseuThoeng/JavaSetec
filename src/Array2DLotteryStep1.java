import java.util.Scanner;

public class Array2DLotteryStep1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maximum number of players
        final int MAX_PLAYERS = 10;

        int[][] bets = new int[MAX_PLAYERS][100];  // Maximum 100 bets per player
        int[] betCount = new int[MAX_PLAYERS];     // Store the number of bets for each player
        int[] winnings = new int[MAX_PLAYERS];     // Store the winnings for each player

        int playerCount = 0;  // Keeps track of the number of players

        while (true) {
            System.out.print("Player " + (playerCount + 1) + ", how much do you want to bet?: ");
            int count = scanner.nextInt();
            if (count <= 0) {
                System.out.println("You must bet more than 0");
                continue;
            }

            betCount[playerCount] = count;
            int betIndex = 0;

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

            System.out.print("Do you want to continue? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                break;
            } else if (choice != 'y' && choice != 'Y') {
                System.out.println("Invalid choice. Exiting.");
                break;
            }

            playerCount++;
            if (playerCount >= MAX_PLAYERS) {
                System.out.println("Maximum number of players reached.");
                break;
            }
        }

        // Winning number
        int winningNumber = 99; // You can change this to any number

        // Calculate winnings for each player
        for (int player = 0; player <= playerCount; player++) {
            for (int i = 0; i < betCount[player] * 2; i += 2) {
                if (bets[player][i] == winningNumber) {
                    winnings[player] += bets[player][i + 1] * 80;  // 1 * 80 if win
                }
            }
        }

        // Display winners
        System.out.println("Winners List:");
        boolean hasWinner = false;
        for (int player = 0; player <= playerCount; player++) {
            if (winnings[player] > 0) {
                System.out.println("Player " + (player + 1) + " won $" + winnings[player]);
                hasWinner = true;
            }
        }
        if (!hasWinner) {
            System.out.println("No winners.");
        }

        scanner.close();
    }
}
