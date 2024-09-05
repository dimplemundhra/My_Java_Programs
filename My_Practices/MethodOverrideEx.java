package My_Practices;
// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class overriding the draw method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class MethodOverrideEx {
    public static void main(String[] args) {
        // Creating an object of the child class
        Circle myCircle = new Circle();

        // Calling the overridden method
        myCircle.draw();
    }
}
