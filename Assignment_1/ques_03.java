import java.util.Scanner;

public class ques_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks for Physics (out of 100): ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for Chemistry (out of 100): ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks for Math (out of 100): ");
        int math = scanner.nextInt();

        
        double average = (physics + chemistry + math) / 3.0;

        
        String grade;
        String remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        
        System.out.println("\nResults:");
        System.out.printf("Average Mark: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
