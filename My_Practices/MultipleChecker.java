package My_Practices;
import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (m % n == 0) {
            System.out.println(m + " is a multiple of " + n);
        } else {
            System.out.println(m + " is not a multiple of " + n);
        }
    }
}
