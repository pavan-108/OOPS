package part5_design_and_exception_handling;

import java.util.Scanner;

public class ShapeAreaDesignAndExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        int choice = scanner.nextInt();
        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter radius:");
                double radius = scanner.nextDouble();
                shape = ShapeFactory.createShape("Circle", radius);
                break;
            case 2:
                System.out.println("Enter length:");
                double length = scanner.nextDouble();
                System.out.println("Enter width:");
                double width = scanner.nextDouble();
                shape = ShapeFactory.createShape("Rectangle", length, width);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(1);
        }

        if (shape != null) {
            System.out.println("Area: " + shape.calculateArea());
        }

        scanner.close();
    }
}

