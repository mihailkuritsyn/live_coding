package leetcode.medium.concurrency.print_foobar_alternately;

import java.util.concurrent.Semaphore;

public class FooBar {

  public void foo() {
    System.out.print("foo");
  }

  public void bar() {
    System.out.print("bar");
  }

  private final Semaphore fooBarrier = new Semaphore(1);
  private final Semaphore barBarrier = new Semaphore(0);

  private int n;

  public FooBar(int n) {
    this.n = n;
  }

  public void foo(Runnable printFoo) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      // printFoo.run() outputs "foo". Do not change or remove this line.
      fooBarrier.acquire();
      printFoo.run();
      barBarrier.release();
    }
  }

  public void bar(Runnable printBar) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      // printBar.run() outputs "bar". Do not change or remove this line.
      barBarrier.acquire();
      printBar.run();
      fooBarrier.release();
    }
  }
}
