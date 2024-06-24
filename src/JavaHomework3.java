import java.util.Scanner;

public class JavaHomework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "mengseu";
        String password = "st10";

        // login first only 3 times
        boolean loop = true;
        int time = 0;

        do {
            System.out.print("Enter username: ");
            String loginUsername = scanner.next();

            System.out.print("Enter password: ");
            String loginPassword = scanner.next();

            // check if the username and password are correct
            if (loginUsername.equalsIgnoreCase(username)
                    && loginPassword.equalsIgnoreCase(password)) {

                System.out.println("Login successful!");
                loop = false;

            } else {
                System.out.println("Login failed. Please try again.");
                time++;

                if (time == 3) {
                    System.out.println("You have reached the maximum number of attempts. Please try again later.");
                    return;
                }
            }
        } while (loop);

        // after login successful
        char continueChoice; // continue or not (y/n)
        int studentCount = 0; // student count
        double cpp, ds = -1, eng = -1; // scores
        int passCount = 0, failCount = 0; // pass and fail count


        do {
            System.out.println("Student " + (++studentCount));

            // C++ score
            do {
                System.out.print("C++ =");
                cpp = scanner.nextDouble();
            } while (cpp < 0 || cpp > 100);

            // Ds score
            while (ds < 0 || ds > 100) {
                System.out.print("DS =");
                ds = scanner.nextDouble();
            }

            // English score
            for (; eng < 0 || eng > 100; ) {
                System.out.print("English = ");
                eng = scanner.nextDouble();
            }

            double total = cpp + ds + eng;
            System.out.println("Total Score: " + total);

            double avg = total / 3;
            System.out.println("Average: " + avg);

            if (avg < 50) {
                failCount++;
            } else {
                passCount++;
            }
            eng = -1;
            ds = -1;

            do {
                System.out.print("Continue? (y/n): ");
                continueChoice = scanner.next().toLowerCase().charAt(0);
                if (continueChoice != 'y' && continueChoice != 'n') {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            } while (continueChoice != 'y' && continueChoice != 'n');

        } while (continueChoice == 'y');

        System.out.println("=====================================");
        System.out.println("Total Student: " + studentCount);
        System.out.println("Pass: " + passCount);
        System.out.println("Fail: " + failCount);

    }
}
