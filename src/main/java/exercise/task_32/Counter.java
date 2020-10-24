package exercise.task_32;

import exercise.task_29.MyThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Zaimplementuj klasę implementująca licznik w sposób wielowątkowy
 */

public class Counter {

    private int sum = 0;

    public synchronized void incrementCounter() {
        sum++;
    }

    public int getSum() {
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Counter counter = new Counter();

        for(int i = 0; i < 1000; i++) {
            executorService.execute(() -> counter.incrementCounter());
        }
        executorService.awaitTermination(2, TimeUnit.SECONDS);

        System.out.println(counter.getSum());

        executorService.shutdown();
    }
}
