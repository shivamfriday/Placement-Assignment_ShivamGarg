
// Abstraction is a key concept in object-oriented 
// programming that allows you to create simplified models of real-world entities by 
// focusing on essential characteristics while hiding unnecessary details. It involves capturing 
// the relevant information and behavior in classes, interfaces, and methods, while abstracting away the underlying complexities.

abstract class Vehicle {
    // Common attributes and behaviors
    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void accelerate();
}

class Car extends Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

class Motorcycle extends Vehicle {
    public void accelerate() {
        System.out.println("Motorcycle is accelerating.");
    }
}

class Bicycle extends Vehicle {
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();

        car.start();
        car.accelerate();
        car.stop();

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();

        bicycle.start();
        bicycle.accelerate();
        bicycle.stop();
    }
}

