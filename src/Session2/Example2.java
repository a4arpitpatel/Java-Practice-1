package Session2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Attempt division
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close(); // Closing scanner to prevent resource leak
        }

    }

    public static int divide(int num, int den) {
        return num / den; // May throw ArithmeticException if den is 0
    }
}
