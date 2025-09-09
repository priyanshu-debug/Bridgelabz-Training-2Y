import java.util.Scanner;

public class HarshadChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // b. Get an integer input for the number variable.
        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();
        long originalNumber = number; // keep for output

        // c. Create an integer variable sum with initial value 0.
        int sumOfDigits = 0;

        // d. Create a while loop to access each digit of the number.
        long temp = Math.abs(number); // handle negative numbers gracefully
        while (temp > 0) {
            // e. Inside the loop, add each digit of the number to sum.
            sumOfDigits += (int)(temp % 10);
            temp /= 10;
        }

        // Handle the special case where the number is 0
        // By definition, 0 is divisible by the sum of its digits (which is 0) is not well-defined.
        // We'll treat 0 as a Harshad number if we consider sum of digits as 0 leading to division by zero.
        // To avoid division by zero, explicitly handle 0.
        boolean isHarshad = false;
        if (sumOfDigits != 0) {
            isHarshad = (originalNumber % sumOfDigits == 0);
        } else {
            // If number is 0, define as Harshad for this implementation
            isHarshad = (originalNumber == 0);
        }

        // g. If the number is divisible by the sum, print Harshad Number; otherwise print not.
        if (isHarshad) {
            System.out.println(originalNumber + " is a Harshad Number (divisible by sum of digits " + sumOfDigits + ").");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number (sum of digits = " + sumOfDigits + ").");
        }

        scanner.close();
    }
}