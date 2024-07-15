import java.util.Random;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] myArray;
        int rows, columns;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        myArray = new int[rows][columns];

        // Input values
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print("Enter number[" + i + "][" + j + "]:");
                myArray[i][j] = scanner.nextInt();
            }
        }

        // out put the random values in array

        System.out.println("Random values in the array:");
        int[][] randomArray = myArray;
        System.out.print(randomArray[random.nextInt(rows)][random.nextInt(columns)]);


    }
}
