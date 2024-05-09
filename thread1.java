
import java.util.concurrent.*;

class FibonacciGenerator implements Runnable {
    private int n;
    private CountDownLatch latch;

    public FibonacciGenerator(int n, CountDownLatch latch) {
        this.n = n;
        this.latch = latch;
    }

    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        try {
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int temp = a;
                a = b;
                b = temp + b;
            }
        } finally {
            latch.countDown(); // Signal that Fibonacci series printing is complete
        }
    }
}

class EvenNumberPrinter implements Runnable {
    private int start, end;
    private CountDownLatch latch;

    public EvenNumberPrinter(int start, int end, CountDownLatch latch) {
        this.start = start;
        this.end = end;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await(); // Wait for Fibonacci series printing to complete
            System.out.println("\nEven Numbers:");
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);

        Thread fibonacciThread = new Thread(new FibonacciGenerator(10, latch));
        Thread evenNumberThread = new Thread(new EvenNumberPrinter(1, 20, latch));
        

        fibonacciThread.start();
        evenNumberThread.start();
    }
}
