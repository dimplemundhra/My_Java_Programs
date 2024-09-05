package My_Practices;
// Base class Staff
class Staff {
    // Instance variables
    protected int code;
    protected String name;

    // Constructor for Staff class
    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    // Method to display information for Staff class
    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

// Subclass Teacher inheriting from Staff
class Teacher extends Staff {
    // Additional instance variables
    private String subject;
    private String publication;

    // Constructor for Teacher class
    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    // Override display method to include Teacher-specific information
    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

// Subclass Officer inheriting from Staff
class Officer extends Staff {
    // Additional instance variables
    private String grade;

    // Constructor for Officer class
    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    // Override display method to include Officer-specific information
    @Override
    public void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

// Subclass Typist inheriting from Staff
class Typist extends Staff {
    // Additional instance variables
    private int speed;

    // Constructor for Typist class
    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    // Override display method to include Typist-specific information
    @Override
    public void display() {
        super.display();
        System.out.println("Speed: " + speed);
    }
}

// Subclass RegularTypist inheriting from Typist
class RegularTypist extends Typist {
    // Additional instance variables
    private double remuneration;

    // Constructor for RegularTypist class
    public RegularTypist(int code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    // Override display method to include RegularTypist-specific information
    @Override
    public void display() {
        super.display();
        System.out.println("Remuneration: " + remuneration);
    }
}

// Subclass CasualTypist inheriting from Typist
class CasualTypist extends Typist {
    // Additional instance variables
    private double dailyWages;

    // Constructor for CasualTypist class
    public CasualTypist(int code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    // Override display method to include CasualTypist-specific information
    @Override
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

// Driver program to test the classes
public class InstitutionDBTest {
    public static void main(String[] args) {
        // Creating instances of each class for testing
        Teacher myTeacher = new Teacher(101, "John Doe", "Math", "Mathematics Journal");
        Officer myOfficer = new Officer(201, "Jane Smith", "Grade A");
        RegularTypist myRegularTypist = new RegularTypist(301, "Alice Brown", 60, 5000.0);
        CasualTypist myCasualTypist = new CasualTypist(401, "Bob Johnson", 40, 100.0);

        // Displaying information for each instance
        System.out.println("Teacher Details:");
        myTeacher.display();
        System.out.println();

        System.out.println("Officer Details:");
        myOfficer.display();
        System.out.println();

        System.out.println("Regular Typist Details:");
        myRegularTypist.display();
        System.out.println();

        System.out.println("Casual Typist Details:");
        myCasualTypist.display();
    }
}
