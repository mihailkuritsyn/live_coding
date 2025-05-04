package leetcode.easy.concurrency.print_in_order_1114;

import java.util.List;
import java.util.stream.Stream;

public class PrintInOrder1114 {

  public static void main(String[] args) throws InterruptedException {
    FooVolatile foo = new FooVolatile();
    Thread a = new Thread(() -> {
      try {
        foo.first(foo::first);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });
    Thread b = new Thread(() -> {
      try {
        foo.second(foo::second);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });
    Thread c = new Thread(() -> {
      try {
        foo.third(foo::third);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    List<Thread> workers = Stream.of(a, c, b).toList();
//    List<Thread> workers = Stream.of(a, b, c).toList();
    workers.forEach(Thread::start);

    for (Thread thread : workers) {
      thread.join();
    }
  }

}
