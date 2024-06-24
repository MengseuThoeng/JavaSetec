import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String username="st10";
        final String pwd="t123";

        System.out.print("Username: ");
        String usernameInput = scanner.next();

        System.out.print("Password: ");
        String pwdInput = scanner.next();


        if (!usernameInput.equals(username) && !pwdInput.equals(pwd)) {

            System.out.println("Login failed. Both username and password are incorrect.");
            return;

        } else if (!usernameInput.equals(username)) {

            System.out.println("Login failed. Username is incorrect.");
            return;

        } else if (!pwdInput.equals(pwd)) {

            System.out.println("Login failed. Password is incorrect.");
            return;

        } else {

            System.out.println("Login successful!");

        }


        double salary = 150.00;

        System.out.println("Welcome to the employee management system.");
        System.out.print("Enter employee hours: ");
        int hours = scanner.nextInt();


        if (hours < 0) {

            System.out.println("Invalid input. Hours must be greater than or equal to 0.");

        } else if (hours == 100) {

            System.out.println("Hours :" + hours);
            System.out.println("Salary :" + salary);
            return;

        } else if (hours > 100 && hours <= 120) {

            salary += (hours - 100) * 2;

        } else if (hours > 120) {

            int extraHours1 = 20;

            int extraHours2 = hours - 120;

            salary = 150.00 + (extraHours1 * 2) + (extraHours2 * 2.50);

        } else {

            salary -= (100 - hours);

        }

        System.out.println("Hours :" + hours);
        System.out.println("Salary :" + salary);
    }
}
