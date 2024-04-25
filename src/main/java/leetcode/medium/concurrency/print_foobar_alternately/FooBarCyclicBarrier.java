package leetcode.medium.concurrency.print_foobar_alternately;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FooBarCyclicBarrier {

  public void foo() {
    System.out.print("foo");
  }

  public void bar() {
    System.out.print("bar");
  }

  private static final CyclicBarrier barrier = new CyclicBarrier(2);

  private int n;

  public FooBarCyclicBarrier(int n) {
    this.n = n;
  }

  public void foo(Runnable printFoo) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      // printFoo.run() outputs "foo". Do not change or remove this line.
      try {
        barrier.await();
      } catch (BrokenBarrierException e) {
        throw new RuntimeException(e);
      }
      printFoo.run();
    }
  }

  public void bar(Runnable printBar) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      // printBar.run() outputs "bar". Do not change or remove this line.
      try {
        barrier.await();
      } catch (BrokenBarrierException e) {
        throw new RuntimeException(e);
      }
      printBar.run();
    }
  }
}
