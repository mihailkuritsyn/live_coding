package leetcode.medium.concurrency.print_zero_even_odd;

public class PrintZeroEvenOdd1116 {

  public static void main(String[] args) throws InterruptedException {
    ZeroEvenOdd z = new ZeroEvenOdd(5);

    Thread a = new Thread(() -> {
      try {
        z.zero(PrintZeroEvenOdd1116::printNumber);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    Thread b = new Thread(() -> {
      try {
        z.even(PrintZeroEvenOdd1116::printNumber);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    Thread c = new Thread(() -> {
      try {
        z.odd(PrintZeroEvenOdd1116::printNumber);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    a.start();
    b.start();
    c.start();

    a.join();
    b.join();
    c.join();
  }

  public static void printNumber(int n) {
    System.out.println(n);
  }
}
