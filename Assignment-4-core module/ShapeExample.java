abstract class Shape {
    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    // Concrete methods
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
    
    public void displayPerimeter() {
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(2.5);
        
        rectangle.displayArea();        // Output: Area: 15.0
        rectangle.displayPerimeter();   // Output: Perimeter: 16.0
        
        circle.displayArea();           // Output: Area: 19.634954084936208
        circle.displayPerimeter();      // Output: Perimeter: 15.707963267948966
    }
}
