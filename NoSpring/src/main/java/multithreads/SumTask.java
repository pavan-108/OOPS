package multithreads;

class SumTask implements Runnable {
    private int[] numbers;
    private int start;
    private int end;
    private long result = 0;

    public SumTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            result += numbers[i];
        }
    }

    public long getResult() {
        return result;
    }
}
