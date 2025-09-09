import java.util.*;
public class gradePercentage{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the marks of Physics: ");
        int physics=sc.nextInt();


        System.out.print("Enter the marks of Chemistry: ");
        int chem=sc.nextInt();


        System.out.print("Enter the marks of maths: ");
        int maths=sc.nextInt();

        int percentage= (physics+ chem + maths)/3;
        if(percentage>=80 && percentage<=100){
            System.out.print("Grade A");
        }

        else if(percentage>=70 && percentage<=79){
            System.out.print("Grade B");
        }

        else if(percentage>=60 && percentage<=69){
            System.out.print("Grade C");
        }

        else if(percentage>=50 && percentage<=59){
            System.out.print("Grade D");
        }

        else if(percentage>=40 && percentage<=49){
            System.out.print("Grade E");
        }

        else if( percentage<=39){
            System.out.print("Grade R");
        }

        
    }
}