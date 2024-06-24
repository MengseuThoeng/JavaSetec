import java.util.Scanner;

public class ArrayPratice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter to calculate sum? :");
        int[] myArray = new int[scanner.nextInt()];

        // Input values
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number["+i+"]:");
            myArray[i] = scanner.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int value : myArray) {
            sum += value;
        }

        // Output the sum
        System.out.println("Sum of the array elements: " + sum);

        scanner.close();
    }
}
