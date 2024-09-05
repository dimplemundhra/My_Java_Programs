package My_Practices;
public class MethodOverloadEx {
    // Method with two int parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum with two parameters: " + add(2, 3));
        System.out.println("Sum with three parameters: " + add(2, 3, 4));
    }
}
