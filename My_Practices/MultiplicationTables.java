package My_Practices;
import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table for " + number + " is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
