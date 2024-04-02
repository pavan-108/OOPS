package part4;

public class OverloadingExample {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();

        // Calling the first add method
        System.out.println("Sum of two integers: " + operations.add(10, 20));

        // Calling the second add method
        System.out.println("Sum of three integers: " + operations.add(10, 20, 30));

        // Calling the third add method
        System.out.println("Sum of two doubles: " + operations.add(10.5, 20.5));
    }
}
