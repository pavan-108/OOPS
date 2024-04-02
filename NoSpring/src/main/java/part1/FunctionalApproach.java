package part1;

// Without OOPS Approach

public class FunctionalApproach {

    public static void main(String[] args) {
        int length = 10;
        int width = 5;

        int area = calculateArea(length, width);
        int perimeter = calculatePerimeter(length, width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }
}