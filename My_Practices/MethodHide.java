package My_Practices;
// Parent class
class Parent {
    // Static method in the parent class
    static void display() {
        System.out.println("Static method in the parent class");
    }
}

// Child class hiding the static method in the parent class
class Child extends Parent {
    // Static method with the same name as in the parent class
    static void display() {
        System.out.println("Static method in the child class");
    }
}

public class MethodHide {
    public static void main(String[] args) {
        // Calling the static method using the class name
        Parent.display(); // Output: Static method in the parent class

        // Calling the hidden static method using the child class name
        Child.display(); // Output: Static method in the child class
    }
}
