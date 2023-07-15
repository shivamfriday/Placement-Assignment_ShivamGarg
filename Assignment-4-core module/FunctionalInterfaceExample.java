import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example 1: Predicate functional interface
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("Even numbers:");
        for (Integer number : numbers) {
            if (isEven.test(number)) {
                System.out.println(number);
            }
        }

        // Example 2: Runnable functional interface
        Runnable helloWorld = () -> {
            System.out.println("Hello, World!");
        };

        System.out.println("Executing helloWorld:");
        helloWorld.run();
    }
}
