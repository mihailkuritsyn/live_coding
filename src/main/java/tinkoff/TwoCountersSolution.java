package tinkoff;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TwoCountersSolution {

  private static volatile AtomicInteger num1 = new AtomicInteger();
  private static volatile AtomicInteger num2 = new AtomicInteger();

  public static void main(String[] args) throws InterruptedException {
    int count = 10000;
    CountDownLatch latch = new CountDownLatch(count);

    ExecutorService executorService = Executors.newFixedThreadPool(
        Runtime.getRuntime().availableProcessors());
    for (int i = 0; i < count; i++) {
      executorService.submit(() -> {
        num1.incrementAndGet();
        num2.incrementAndGet();
        latch.countDown();
      });
    }

    latch.await();
    System.out.println(num1);
    System.out.println(num2);

    executorService.shutdown();
  }
}
