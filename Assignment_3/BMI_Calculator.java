import java.util.*;
public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your weight(kgs): ");
        int weight=sc.nextInt();

        System.out.print("Enter your height in (cms): ");
        int height=sc.nextInt();

        int BMI= weight / (height * height);
        if( BMI <= 18.4){
            System.out.print("Underweight");
        }

        else if(BMI >= 18.5 && BMI<=24.9){
            System.out.print("Normal");
        }

        else if(BMI >= 25 && BMI <=39.9){
            System.out.print("Overweight");
        }

        else if(BMI >= 40.0){
            System.out.print("Obese");
        }
        else{
            System.out.print("Please enetr correct number");
        }



    }
}

