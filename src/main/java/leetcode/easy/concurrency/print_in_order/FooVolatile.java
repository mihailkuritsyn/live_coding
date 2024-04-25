package leetcode.easy.concurrency.print_in_order;

public class FooVolatile {

  public void first() {
    System.out.print("first");
  }

  public void second() {
    System.out.print("second");
  }

  public void third() {
    System.out.print("third");
  }

  public FooVolatile() {
  }

  private volatile boolean waitFirst = true;
  private volatile boolean waitSecond = true;

  public void first(Runnable printFirst) throws InterruptedException {
    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    waitFirst = false;
  }

  public void second(Runnable printSecond) throws InterruptedException {
    // printSecond.run() outputs "second". Do not change or remove this line.
    while (waitFirst) {
      Thread.onSpinWait();
    }
    printSecond.run();
    waitSecond = false;
  }

  public void third(Runnable printThird) throws InterruptedException {
    // printThird.run() outputs "third". Do not change or remove this line.
    while (waitSecond) {
      Thread.onSpinWait();
    }
    printThird.run();
  }

}
