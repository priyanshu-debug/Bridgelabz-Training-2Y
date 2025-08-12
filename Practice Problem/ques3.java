import java.util.*;
public class ques3 {
    public static void main(String[] args){
//power of given number
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Base number: ");
        int base= sc.nextInt();
        System.out.print("Enter the exponent number: ");
        int exponent=sc.nextInt();
        double result= Math.pow(base,exponent);
        System.out.print(result);
    }
}
