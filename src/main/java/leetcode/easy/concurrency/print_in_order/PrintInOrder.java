package main.java.leetcode.easy.concurrency.print_in_order;

import java.util.List;
import java.util.stream.Stream;

public class PrintInOrder {

  public static void main(String[] args) throws InterruptedException {
    Foo foo = new Foo();
    FooWorker1 fw1 = new FooWorker1(foo);
    FooWorker2 fw2 = new FooWorker2(foo);
    FooWorker3 fw3 = new FooWorker3(foo);

    Thread a = new Thread(() -> {
      try {
        foo.first(fw1);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });
    Thread b = new Thread(() -> {
      try {
        foo.second(fw2);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });
    Thread c = new Thread(() -> {
      try {
        foo.third(fw3);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    List<Thread> workers = Stream.of(a, b, c).toList();
    workers.forEach(Thread::start);
  }

  public static class FooWorker1 implements Runnable {

    private Foo foo;

    public FooWorker1(Foo foo) {
      this.foo = foo;
    }

    @Override
    public void run() {
      foo.first();
    }
  }

  public static class FooWorker2 implements Runnable {

    private Foo foo;

    public FooWorker2(Foo foo) {
      this.foo = foo;
    }

    @Override
    public void run() {
      foo.second();
    }
  }

  public static class FooWorker3 implements Runnable {

    private Foo foo;

    public FooWorker3(Foo foo) {
      this.foo = foo;
    }

    @Override
    public void run() {
      foo.third();
    }
  }

}
