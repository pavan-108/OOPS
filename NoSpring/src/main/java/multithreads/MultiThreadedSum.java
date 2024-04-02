package multithreads;

import java.util.Arrays;

public class MultiThreadedSum {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[10_00_00_000];

        Arrays.fill(numbers, 1);

        int numberOfThreads = 4; // For example, we'll use 4 threads
        Thread[] threads = new Thread[numberOfThreads];
        SumTask[] sumTasks = new SumTask[numberOfThreads];

        int segmentSize = numbers.length / numberOfThreads;  // 2_50_00_000

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * segmentSize;
            int end = (i + 1) * segmentSize;
            if (i == numberOfThreads - 1) {
                end = numbers.length; // Handle any remainder in the last segment
            }
            sumTasks[i] = new SumTask(numbers, start, end);
            threads[i] = new Thread(sumTasks[i]);
            threads[i].start();
        }

        long sum = 0;
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join(); // Wait for thread to finish
            sum += sumTasks[i].getResult();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Sum: " + sum);
        System.out.println("Multi-threaded execution time: " + (endTime - startTime) + " ms");
    }
}
