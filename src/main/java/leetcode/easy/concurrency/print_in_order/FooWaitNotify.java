package leetcode.easy.concurrency.print_in_order;

public class FooWaitNotify {

  public void first() {
    System.out.print("first");
  }

  public void second() {
    System.out.print("second");
  }

  public void third() {
    System.out.print("third");
  }

  private volatile boolean waitFirst = true;
  private volatile boolean waitSecond = true;

  public FooWaitNotify() {
  }

  public synchronized void first(Runnable printFirst) throws InterruptedException {
    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    waitFirst = false;
    notifyAll();
  }

  public synchronized void second(Runnable printSecond) throws InterruptedException {
    // printSecond.run() outputs "second". Do not change or remove this line.
    while (waitFirst) {
      wait();
    }
    printSecond.run();
    waitSecond = false;
    notify();
  }

  public synchronized void third(Runnable printThird) throws InterruptedException {
    // printThird.run() outputs "third". Do not change or remove this line.
    while (waitSecond) {
      wait();
    }
    printThird.run();
  }

}
