package My_Practices;
import java.util.Scanner;

// General ThreeDObject class
class ThreeDObject {
    // Method to calculate the whole surface area
    double wholeSurfaceArea() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }

    // Method to calculate the volume
    double volume() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }
}

// Derived class Box
class Box extends ThreeDObject {
    double length, width, height;

    // Constructor
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Override methods to calculate whole surface area and volume for Box
    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

// Derived class Cube
class Cube extends ThreeDObject {
    double side;

    // Constructor
    Cube(double side) {
        this.side = side;
    }

    // Override methods to calculate whole surface area and volume for Cube
    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

// Derived class Cylinder
class Cylinder extends ThreeDObject {
    double radius, height;

    // Constructor
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override methods to calculate whole surface area and volume for Cylinder
    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class Cone
class Cone extends ThreeDObject {
    double radius, height;

    // Constructor
    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override methods to calculate whole surface area and volume for Cone
    @Override
    double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

// Main class to test the ThreeDObject and its derived classes
public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test for Box
        System.out.println("Enter dimensions for Box (length, width, height): ");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Box myBox = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box Whole Surface Area: " + myBox.wholeSurfaceArea());
        System.out.println("Box Volume: " + myBox.volume());

        // Test for Cube
        System.out.println("\nEnter side length for Cube: ");
        double cubeSide = scanner.nextDouble();
        Cube myCube = new Cube(cubeSide);
        System.out.println("Cube Whole Surface Area: " + myCube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + myCube.volume());

        // Test for Cylinder
        System.out.println("\nEnter dimensions for Cylinder (radius, height): ");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        Cylinder myCylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Whole Surface Area: " + myCylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + myCylinder.volume());

        // Test for Cone
        System.out.println("\nEnter dimensions for Cone (radius, height): ");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone myCone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Whole Surface Area: " + myCone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + myCone.volume());
    }
}
