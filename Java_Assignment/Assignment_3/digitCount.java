import java.util.*;
public class digitCount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit=sc.nextInt();
        int count=0;
        while(digit >0){
            digit /= 10;
            count++;
        }
        System.out.print(count);
    }
    
}
