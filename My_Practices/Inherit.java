package My_Practices;
class Num {
    protected int number; // Base class with an integer number

    public Num(int number) {
        this.number = number;
    }

    public void shownum() {
        System.out.println("Decimal Value: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void shownum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number));
    }
}

public class Inherit {
    public static void main(String[] args) {
        Num decimalNum = new Num(42);
        HexNum hexadecimalNum = new HexNum(42);

        // Demonstrate the working of the classes
        System.out.println("Base Class:");
        decimalNum.shownum(); // Display decimal value

        System.out.println("\nDerived Class:");
        hexadecimalNum.shownum(); // Display hexadecimal value
    }
}
