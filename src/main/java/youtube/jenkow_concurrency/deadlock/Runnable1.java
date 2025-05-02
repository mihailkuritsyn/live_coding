package youtube.jenkow_concurrency.deadlock;

import java.util.concurrent.locks.Lock;

public class Runnable1 implements Runnable {

  private Lock lock1 = null;
  private Lock lock2 = null;

  public Runnable1(Lock lock1, Lock lock2) {
    this.lock1 = lock1;
    this.lock2 = lock2;
  }

  @Override
  public void run() {
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName + " Attempting to lock 1");
    lock1.lock();
    System.out.println(threadName + " Lock 1 locked");

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      // ignore
    }

    System.out.println(threadName + " Attempting to lock 2");
    lock2.lock();
    System.out.println(threadName + " Lock 2 locked");

    System.out.println(threadName + " Lock 1 unlocked");
    lock1.unlock();
    System.out.println(threadName + " Lock 2 unlocked");
    lock2.unlock();
  }
}
