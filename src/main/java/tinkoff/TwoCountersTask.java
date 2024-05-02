package tinkoff;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwoCountersTask {

  private static int num1;
  private static int num2;

  public static void main(String[] args) throws InterruptedException {
    int count = 10000;
    CountDownLatch latch = new CountDownLatch(count);

    ExecutorService executorService = Executors.newFixedThreadPool(
        Runtime.getRuntime().availableProcessors());
    for (int i = 0; i < count; i++) {
      executorService.submit(() -> {
        num1++;
        num2++;
        latch.countDown();
      });
    }

    latch.await();
    System.out.println(num1);
    System.out.println(num2);

    executorService.shutdown();
  }
}
