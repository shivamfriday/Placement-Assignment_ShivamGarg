public class PolymorphismDemo2 {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        PolymorphismDemo2 demo = new PolymorphismDemo2();

        int sum1 = demo.add(5, 10);
        int sum2 = demo.add(5, 10, 15);
        double sum3 = demo.add(2.5, 3.7);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}
