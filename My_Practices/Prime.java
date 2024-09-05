package My_Practices;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lower = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upper = scanner.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
