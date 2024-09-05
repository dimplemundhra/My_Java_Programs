package My_Practices;
import java.util.Scanner;

public class AdmissionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\nEnter details for student #" + i);
            System.out.print("Enter marks in Mathematics: ");
            int mathMarks = scanner.nextInt();

            System.out.print("Enter marks in Physics: ");
            int physicsMarks = scanner.nextInt();

            System.out.print("Enter marks in Chemistry: ");
            int chemistryMarks = scanner.nextInt();

            int totalMarks = mathMarks + physicsMarks + chemistryMarks;

            if ((mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40 && totalMarks >= 200) ||
                (totalMarks >= 150 && mathMarks + physicsMarks >= 150)) {
                System.out.println("Student #" + i + " is eligible for admission.");
            } else {
                System.out.println("Student #" + i + " is not eligible for admission.");
            }
        }
    }
}
