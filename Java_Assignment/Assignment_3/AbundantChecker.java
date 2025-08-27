import java.util.Scanner;

public class AbundantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // b. Get an integer input for the number variable.
        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        // c. Create an integer variable sum with initial value 0.
        long sumOfDivisors = 1; // 1 is a proper divisor for all >1 numbers

        // d. Run a loop to access each potential divisor up to sqrt(number)
        long limit = (long) Math.sqrt(number);
        for (long i = 2; i <= limit; i++) {
            if (number % i == 0) {
                long paired = number / i;
                sumOfDivisors += i;
                if (paired != i && paired != number) {
                    sumOfDivisors += paired;
                }
            }
        }

        // Handle the special case when number is 1 (no proper divisors)
        if (number == 1) {
            sumOfDivisors = 0;
        }

        // g. Compare sum with the original number
        boolean isAbundant = sumOfDivisors > number;

        // h. Print result
        if (isAbundant) {
            System.out.println(number + " is an Abundant Number. (Sum of proper divisors = " + sumOfDivisors + ")");
        } else {
            System.out.println(number + " is NOT an Abundant Number. (Sum of proper divisors = " + sumOfDivisors + ")");
        }

        scanner.close();
    }
}