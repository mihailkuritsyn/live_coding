package youtube.jenkow_concurrency.happens_before;

import java.util.ArrayList;
import java.util.List;

public class HappensBeforeExample {

  public static void main(String[] args) throws InterruptedException {
    FrameExchanger exchanger = new FrameExchanger();

    List<Thread> threads = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      Runnable r1 = () -> exchanger.storeFrame(new Frame());
      Runnable r2 = exchanger::takeFrame;

      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      threads.add(t1);
      threads.add(t2);

      t1.start();
      t2.start();
    }

    for (Thread thread : threads) {
      thread.join();
    }

    System.out.println(exchanger.framesStoredCount);
    System.out.println(exchanger.framesTakenCount);
  }

}
