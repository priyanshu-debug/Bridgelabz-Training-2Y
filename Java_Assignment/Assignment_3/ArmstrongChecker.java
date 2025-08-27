import java.util.*;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine().trim();

        long number = Math.abs(Long.parseLong(input));
        int numDigits = input.startsWith("-") ? input.length() - 1 : input.length();

        long sum = 0;
        long temp = number;

        while (temp > 0) {
            int digit = (int)(temp % 10);
            sum += pow(digit, numDigits);
            temp /= 10;
        }

        // Special case for 0
        if (number == 0) {
            sum = 0; // 0^1 is 0
        }

        if (sum == number) {
            System.out.println(input + " is an Armstrong number.");
        } else {
            System.out.println(input + " is not an Armstrong number.");
        }

        sc.close();
    }
    private static long pow(int base, int exp) {
        long result = 1;
        long b = base;
        int e = exp;
        while (e > 0) {
            if ((e & 1) == 1) {
                result *= b;
            }
            b *= b;
            e >>= 1;
        }
        return result;
    }
} 
