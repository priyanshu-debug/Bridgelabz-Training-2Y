import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // b. Get inputs for the two numbers and operator
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        // Read operator as a string; since next() reads up to whitespace
        String op = scanner.next();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        double result;
        boolean valid = true;

        // e. Use switch…case to perform operation
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Error: Division by zero");
                    scanner.close();
                    return;
                }
                result = first / second;
                break;
            default:
                valid = false;
                result = 0;
        }

        // f. Print the result or invalid operator
        if (valid) {
            System.out.println(first + " " + op + " " + second + " = " + result);
        } else {
            System.out.println("Invalid Operator");
        }

        scanner.close();
    }
}