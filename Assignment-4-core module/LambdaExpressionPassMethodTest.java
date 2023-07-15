// A lambda expression passed in a method that has an argument of type of functional interface. If we need to pass a lambda expression as an argument, the type of parameter receiving the lambda expression argument must be of a functional interface type.

// In the below example, the lambda expression can be passed in a method which argument's type is "TestInterface". 

interface TestInterface {
   boolean test(int a);
}
class Test {
   // lambda expression can be passed as first argument in the check() method
   static boolean check(TestInterface ti, int b) {
      return ti.test(b);
   }
}
public class LambdaExpressionPassMethodTest {
   public static void main(String arg[]) {
      // lambda expression
      boolean result = Test.check((x) -> (x%2) == 0, 10);
      System.out.println("The result is: "+ result);
   }
}