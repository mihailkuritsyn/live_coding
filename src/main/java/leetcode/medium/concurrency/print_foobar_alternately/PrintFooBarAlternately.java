package leetcode.medium.concurrency.print_foobar_alternately;

import java.util.List;
import java.util.stream.Stream;

public class PrintFooBarAlternately {

  public static void main(String[] args) throws InterruptedException {
    FooBar fooBar = new FooBar(2);
    PrintFooWorker fw1 = new PrintFooWorker(fooBar);
    PrintBarRunnable fw2 = new PrintBarRunnable(fooBar);

    Thread a = new Thread(() -> {
      try {
        fooBar.foo(fw1);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });
    Thread b = new Thread(() -> {
      try {
        fooBar.bar(fw2);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    List<Thread> workers = Stream.of(a, b).toList();
    workers.forEach(Thread::start);

    for (Thread thread : workers) {
      thread.join();
    }

//    ExecutorService executor = Executors.newFixedThreadPool(2);
//
//    CompletableFuture<Void> task1 = CompletableFuture.runAsync(() -> {
//      fooBar.foo();
//    });
//
//    CompletableFuture<Void> task2 = CompletableFuture.runAsync(() -> {
//      VbkPartMessageDto messageDto = new VbkPartMessageDto();
//      messageDto.setVbkPartContract(JaxbUtil.parseBody(VBK_PART_XML, VbkContractListDto.class));
//      vbkPartService.handleVbkPartMessage(UPDATE_EVENT_TYPE, null, TEST_UNIQ_NUMBER, messageDto,
//          1713516804000L);
//    });
//
//    CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1, task2);
//    allTasks.join();
//
//    executor.shutdown();
  }

  public static class PrintFooWorker implements Runnable {

    private FooBar fooBar;

    public PrintFooWorker(FooBar fooBar) {
      this.fooBar = fooBar;
    }

    @Override
    public void run() {
      fooBar.foo();
    }
  }

  public static class PrintBarRunnable implements Runnable {

    private FooBar fooBar;

    public PrintBarRunnable(FooBar fooBar) {
      this.fooBar = fooBar;
    }

    @Override
    public void run() {
      fooBar.bar();
    }
  }

}
