import java.util.*;
public class ques5{
    public static void main(String[] args) {
// kilometers into Miles
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the distance(in KMs): ");
        int KM=sc.nextInt();
        double miles = KM * 0.621371;
        System.out.print(miles);


    }
}
