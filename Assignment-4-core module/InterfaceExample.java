// Define an interface
interface Animal {
    void sound(); // Abstract method
}

// Implement the interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Create instances of the implementing classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the sound method
        dog.sound(); // Output: Woof!
        cat.sound(); // Output: Meow!
    }
}
