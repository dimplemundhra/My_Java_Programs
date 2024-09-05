package My_Practices;
import java.util.Scanner;
//Sum of Natural Numbers:
public class SumOfNN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range (n): ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
    }
}
