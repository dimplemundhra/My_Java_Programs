package My_Practices;
public class CombinationGenerator {
    public static void main(String[] args) {
        int limit = 3;

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
