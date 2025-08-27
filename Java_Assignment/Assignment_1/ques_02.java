package Assigment_3;

import java.util.Scanner;

public class ques_02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        
        if (year >= 1582) {
            
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Year is not valid. Works only for year >= 1582.");
        }

        sc.close();
    }
}
