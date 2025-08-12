import java.util.*;
public class ques1{
    public static void main(String[] args) {
    //calculate simple intrest
        Scanner sc= new Scanner(System.in);
        System.out.print("Principal amount: ");
        int PA=sc.nextInt();
        System.out.print("Enter time period: ");
        int T=sc.nextInt();
        System.out.print("Enter Rate of intrest: ");
        int R=sc.nextInt();
        int SI=(PA * T * R)/100;
        System.out.print("Total amount to be paid: "+SI);
    }
}
