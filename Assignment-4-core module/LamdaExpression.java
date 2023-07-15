// In Java, Lambda expressions basically express instances of functional interfaces (An interface with a single abstract method is called a functional interface). Lambda Expressions in Java are the same as lambda functions which are the short block of code that accepts input as parameters and returns a resultant value. Lambda Expressions are recently included in Java SE 8. 

// Functionalities of Lambda Expression in Java
// Lambda Expressions implement the only abstract function and therefore implement functional interfaces lambda expressions are added in Java 8 and provide the below functionalities.

// Enable to treat functionality as a method argument, or code as data.
// A function that can be created without belonging to any class.
// A lambda expression can be passed around as if it was an object and executed on demand.

// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

// A sample functional interface (An interface with
// single abstract method
interface FuncInterface
{
	// An abstract function
	void abstractFun(int x);

	// A non-abstract (or default) function
	default void normalFun()
	{
	System.out.println("Hello");
	}
}

class LamdaExpression
{
	public static void main(String args[])
	{
		// lambda expression to implement above
		// functional interface. This interface
		// by default implements abstractFun()
		FuncInterface fobj = (int x)->System.out.println(2*x);

		// This calls above lambda expression and prints 10.
		fobj.abstractFun(5);
	}
}
