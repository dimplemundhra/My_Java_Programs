package My_Practices;
// Base class Vehicle
class Vehicle {
    // Protected instance variables
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    // Constructor for Vehicle class
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    // Method to show data for Vehicle class
    protected void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

// Subclass Bus inheriting from Vehicle
class Bus extends Vehicle {
    // Private instance variable specific to Bus
    private String routeNumber;

    // Constructor for Bus class
    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    // Override showData method to show Bus details
    @Override
    protected void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
    // Private instance variable specific to Car
    private String manufacturerName;

    // Constructor for Car class
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    // Override showData method to show Car details
    @Override
    protected void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

// Main class to test Vehicle, Bus, and Car classes
public class VehicleTest {
    public static void main(String[] args) {
        // Creating an object of the Bus class
        Bus myBus = new Bus("XYZ123", 60, "Red", "John Doe", "Route 101");
        System.out.println("Bus Details:");
        myBus.showData();

        System.out.println();

        // Creating an object of the Car class
        Car myCar = new Car("ABC456", 120, "Blue", "Jane Doe", "Toyota");
        System.out.println("Car Details:");
        myCar.showData();
    }
}
