package My_Practices;
// Base class Animal
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class Mammal, inherits from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

// Derived class Dog, inherits from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultiLevInherit {
    public static void main(String[] args) {
        // Create an object of the base class Animal
        Animal animal = new Animal();
        animal.eat();

        // Create an object of the derived class Mammal
        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.walk();

        // Create an object of the derived class Dog
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}
