package My_Practices;
// Base class Num
class Num {
    protected int number; // integer number

    // Constructor to initialize the number
    public Num(int number) {
        this.number = number;
    }

    // Method to display the number
    public void shownum() {
        System.out.println("Decimal Number: " + number);
    }
}

// Derived class OctNum, inherits from Num
class OctNum extends Num {
    // Constructor to call the base class constructor
    public OctNum(int number) {
        super(number);
    }

    // Override the shownum() method to display the octal value
    @Override
    public void shownum() {
        System.out.println("Octal Number: " + Integer.toOctalString(number));
    }
}

// Main class to demonstrate the working of the classes
public class Inherit2 {
    public static void main(String[] args) {
        // Create an object of the base class Num
        Num baseNum = new Num(25);
        // Call the shownum() method of the base class
        baseNum.shownum();

        // Create an object of the derived class OctNum
        OctNum octalNum = new OctNum(25);
        // Call the overridden shownum() method of the derived class
        octalNum.shownum();
    }
}
