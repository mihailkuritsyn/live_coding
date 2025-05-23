package leetcode.medium.concurrency.print_zero_even_odd;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class ZeroEvenOdd {

  private int n;
  private final Semaphore zeroWait = new Semaphore(1);
  private final Semaphore oddWait = new Semaphore(0);
  private final Semaphore evenWait = new Semaphore(0);

  public ZeroEvenOdd(int n) {
    this.n = n;
  }

  public void zero(IntConsumer printNumber) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      zeroWait.acquire();
      printNumber.accept(0);
      if (i % 2 == 0) {
        oddWait.release();
      } else {
        evenWait.release();
      }
    }
  }

  public void odd(IntConsumer printNumber) throws InterruptedException {
    for (int i = 0; i < (n + 1) / 2; i++) {
      oddWait.acquire(1);
      printNumber.accept(2 * i + 1);
      zeroWait.release();
    }
  }

  public void even(IntConsumer printNumber) throws InterruptedException {
    for (int i = 0; i < n / 2; i++) {
      evenWait.acquire(1);
      printNumber.accept((i + 1) * 2);
      zeroWait.release();
    }
  }

//  01 02 03 04 05 n=5
//  1 1 0
//  0 1 0
//  0
//  0 2 1
//  0 0 1
//  1
//  1 0 2
//  0 0 2
//  0
//  0 1 3
//  0 1 1
//  2
//  1 2 1
//  0 2 1
//  0
//  0 3 2
//  0 1


}
