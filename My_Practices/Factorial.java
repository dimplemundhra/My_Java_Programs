package My_Practices;
// 6!=6*5*4*3*2*1

public class Factorial {
    public static void main(String[] args) {
        int num = 12;
        long factorial = 1;

        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
