package multithreads;

import java.util.Arrays;

public class SingleThreadedSum {
    public static void main(String[] args) {
        int[] numbers = new int[100_000_000];

        // Arrays.fill(numbers, 1);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1; // Assign a value to each element
        }

        long startTime = System.currentTimeMillis();

        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Sum: " + sum);
        System.out.println("Single-threaded execution time: " + (endTime - startTime) + " ms");
    }
}

