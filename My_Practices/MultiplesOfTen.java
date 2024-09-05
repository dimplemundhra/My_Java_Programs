package My_Practices;
import java.util.Scanner;

public class MultiplesOfTen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting interval: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending interval: ");
        int end = scanner.nextInt();

        System.out.println("Multiples of 10 between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
