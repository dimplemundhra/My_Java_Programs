package My_Practices;
// Base class Building
class Building {
    // Instance variables
    protected int numberOfFloors;
    protected int numberOfRooms;
    protected double totalFootage;

    // Constructor for Building class
    public Building(int numberOfFloors, int numberOfRooms, double totalFootage) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.totalFootage = totalFootage;
    }

    // Method to display information for Building class
    public void display() {
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Total Footage: " + totalFootage + " square feet");
    }
}

// Derived class House inheriting from Building
class House extends Building {
    // Additional instance variables
    private int numberOfBedrooms;
    private int numberOfBathrooms;

    // Constructor for House class
    public House(int numberOfFloors, int numberOfRooms, double totalFootage,
                 int numberOfBedrooms, int numberOfBathrooms) {
        super(numberOfFloors, numberOfRooms, totalFootage);
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    // Override display method to include House-specific information
    @Override
    public void display() {
        super.display();
        System.out.println("Number of Bedrooms: " + numberOfBedrooms);
        System.out.println("Number of Bathrooms: " + numberOfBathrooms);
    }
}

// Derived class Office inheriting from Building
class Office extends Building {
    // Additional instance variables
    private String officeType;

    // Constructor for Office class
    public Office(int numberOfFloors, int numberOfRooms, double totalFootage, String officeType) {
        super(numberOfFloors, numberOfRooms, totalFootage);
        this.officeType = officeType;
    }

    // Override display method to include Office-specific information
    @Override
    public void display() {
        super.display();
        System.out.println("Office Type: " + officeType);
    }
}
// Driver program to test the classes
public class BuildingTest {
    public static void main(String[] args) {
        // Creating instances of each class for testing
        House myHouse = new House(2, 4, 2000.0, 3, 2);
        Office myOffice = new Office(5, 10, 5000.0, "Corporate");

        // Displaying information for each instance
        System.out.println("House Details:");
        myHouse.display();
        System.out.println();

        System.out.println("Office Details:");
        myOffice.display();
    }
}
// Base class Building
class Building{
    int numFloors;
    int numRooms;
    double totalFootage;

    // Constructor
    public Building(int numFloors, int numRooms, double totalFootage) {
        this.numFloors = numFloors;
        this.numRooms = numRooms;
        this.totalFootage = totalFootage;
    }
}

// Derived class House
class House extends Building {
    int numBedrooms;
    int numBathrooms;

    // Constructor
    public House(int numFloors, int numRooms, double totalFootage, int numBedrooms, int numBathrooms) {
        super(numFloors, numRooms, totalFootage);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }
}

// Derived class Office
class Office extends Building {
    int numTelephones;
    int numTables;

    // Constructor
    public Office(int numFloors, int numRooms, double totalFootage, int numTelephones, int numTables) {
        super(numFloors, numRooms, totalFootage);
        this.numTelephones = numTelephones;
        this.numTables = numTables;
    }
}

public class BuildingTT {
    public static void main(String[] args) {
        // Demonstrate the working of the classes

        // Create an instance of the House class
        House myHouse = new House(2, 5, 1500.0, 3, 2);
        System.out.println("House details:");
        System.out.println("Number of floors: " + myHouse.numFloors);
        System.out.println("Number of rooms: " + myHouse.numRooms);
        System.out.println("Total footage: " + myHouse.totalFootage);
        System.out.println("Number of bedrooms: " + myHouse.numBedrooms);
        System.out.println("Number of bathrooms: " + myHouse.numBathrooms);

        // Create an instance of the Office class
        Office myOffice = new Office(1, 10, 2000.0, 5, 20);
        System.out.println("\nOffice details:");
        System.out.println("Number of floors: " + myOffice.numFloors);
        System.out.println("Number of rooms: " + myOffice.numRooms);
        System.out.println("Total footage: " + myOffice.totalFootage);
        System.out.println("Number of telephones: " + myOffice.numTelephones);
        System.out.println("Number of tables: " + myOffice.numTables);
    }
}
