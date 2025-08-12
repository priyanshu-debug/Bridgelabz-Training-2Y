import java.util.*;
public class ques4 {
    public static void main(String[] args){
//average of three numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        int average= (a+b+c)/3;
        System.out.print("The average of given two numbers: "+average);
    }
}
