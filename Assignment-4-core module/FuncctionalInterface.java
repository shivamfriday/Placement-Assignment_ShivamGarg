// A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. Runnable, ActionListener, and Comparable are some of the examples of functional interfaces. 

// Functional Interface is additionally recognized as Single Abstract Method Interfaces. In short, they are also known as SAM interfaces. Functional interfaces in Java are the new feature that provides users with the approach of fundamental programming. 

// Functional interfaces are included in Java SE 8 with Lambda expressions and Method references in order to make code more readable, clean, 
//and straightforward. Functional interfaces are interfaces that ensure that they include precisely only one abstract method. 
//Functional interfaces are used and executed by representing the interface with an annotation called @FunctionalInterface.
// As described earlier, functional interfaces can contain only one abstract method. However, 
//they can include any quantity of default and static methods. 

// Java program to demonstrate functional interface

class Test {
	public static void main(String args[])
	{
		// create anonymous inner class object
		new Thread(new Runnable() {
			@Override public void run()
			{
				System.out.println("New thread created");
			}
		}).start();
	}
}
