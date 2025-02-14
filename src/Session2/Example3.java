package Session2;

import java.util.Scanner;

// Custom Exception Class
class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class Example3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input for age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Checking age eligibility
            checkEligibility(age);

            System.out.println("You are eligible to vote!");

        } catch (UnderageException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid age.");
        } finally {
            scanner.close();
        }
    }

    // Method to check voting eligibility
    public static void checkEligibility(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You must be at least 18 years old to vote.");
        }
    }
}
