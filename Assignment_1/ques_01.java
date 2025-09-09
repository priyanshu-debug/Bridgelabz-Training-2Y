import java.util.*;
public class ques_01{
    public static void main(String[] args){
        // to check number is divisible by 5
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0){
            System.out.print("The number"+ n+"divisible by 5");
        }
    }
}