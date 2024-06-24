import java.util.Scanner;

public class Loop1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 0;
        int cols = 0;

        // Using While
        int age = 0;

        while (age < 18) {
            System.out.print("Enter age should be greater 18 year old: ");
            age = scanner.nextInt();
            if (age < 18) {
                System.out.println("Invalid input. Please enter a age greater 18 year old.");
            }
        }

        String welcome = """
                
                ░██████╗███████╗██╗░░░██╗  ░█████╗░██╗███╗░░██╗███████╗███╗░░░███╗░█████╗░
                ██╔════╝██╔════╝██║░░░██║  ██╔══██╗██║████╗░██║██╔════╝████╗░████║██╔══██╗
                ╚█████╗░█████╗░░██║░░░██║  ██║░░╚═╝██║██╔██╗██║█████╗░░██╔████╔██║███████║
                ░╚═══██╗██╔══╝░░██║░░░██║  ██║░░██╗██║██║╚████║██╔══╝░░██║╚██╔╝██║██╔══██║
                ██████╔╝███████╗╚██████╔╝  ╚█████╔╝██║██║░╚███║███████╗██║░╚═╝░██║██║░░██║
                ╚═════╝░╚══════╝░╚═════╝░  ░╚════╝░╚═╝╚═╝░░╚══╝╚══════╝╚═╝░░░░░╚═╝╚═╝░░╚═╝
                """;
        System.out.println(welcome);

        // Using do-while
        do {
            try {
                System.out.print("Enter the age of rows of seats in the cinema:");
                rows = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the age of columns of seats in the cinema:");
                cols = Integer.parseInt(scanner.nextLine());

                if (rows > 0 && cols > 0) {
                    break;
                } else {
                    System.out.println("Rows and columns must be positive integers. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
            }
        } while (true);


        // Using for
        System.out.println("...............Cinema Seats...............");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char rowLabel = (char) ('A' + i);
                int seatage = j + 1;
                System.out.print(rowLabel + "" + seatage);

                if (j < cols - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
