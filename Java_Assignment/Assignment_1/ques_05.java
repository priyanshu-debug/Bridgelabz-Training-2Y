package Assigment_3;

import java.util.Scanner;

public class ques_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int result = 0;
        int digits = String.valueOf(num).length(); 
        
        
        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }
        
       
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is Not an Armstrong Number.");
        }
        
        sc.close();
    }
}
