import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Using &&
        System.out.println("......Using &&.....");
        System.out.println("Before register to our girls university, please answer the following questions..!");

        System.out.print("What is your age? :");
        int age = scanner.nextInt();

        System.out.print("What is your gender? :");
        String gender = scanner.next();

        if (age >= 18 && gender.equalsIgnoreCase("female")) {
            System.out.println("You are eligible to register");
        } else {
            System.out.println("You are not eligible to register");
        }

        // Using ||
        System.out.println("......Using ||.....");
        String username = "mengseu";
        String email = "mengseu@gmail.com";
        String pwd = "123";

        String usernameLogin = "ok";
        String emailLogin = "mengseu@gmail.com";
        String pwdLogin = "123";

        if ( (usernameLogin.equals(username) || emailLogin.equals(email) ) && pwdLogin.equals(pwd)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }

        // Using !
        String emailRegister = "mengseupsn@gmail.com";

        System.out.println("......Using !.....");
        System.out.println("register");
        System.out.print("Enter your email: ");
        String emailInput = scanner.next();
        System.out.print("Enter your password: ");
        String passwordInput = scanner.next();
        if (!emailInput.equals(emailRegister)) {
            System.out.println("Email has created successfully...");
        } else {
            System.out.println("Email is already registered.");
        }
    }
}