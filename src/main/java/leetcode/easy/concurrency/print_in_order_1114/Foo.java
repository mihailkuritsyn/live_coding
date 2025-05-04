package leetcode.easy.concurrency.print_in_order_1114;

import java.util.concurrent.Semaphore;

public class Foo {

  public Foo() {
  }

  public void first() {
    System.out.print("first");
  }

  public void second() {
    System.out.print("second");
  }

  public void third() {
    System.out.print("third");
  }

  private final Semaphore waitFirst = new Semaphore(0);
  private final Semaphore waitSecond = new Semaphore(0);

  public void first(Runnable printFirst) throws InterruptedException {
    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    waitFirst.release();
  }

  public void second(Runnable printSecond) throws InterruptedException {
    // printSecond.run() outputs "second". Do not change or remove this line.
    waitFirst.acquire();
    printSecond.run();
    waitSecond.release();
  }

  public void third(Runnable printThird) throws InterruptedException {
    // printThird.run() outputs "third". Do not change or remove this line.
    waitSecond.acquire();
    printThird.run();
  }

}
