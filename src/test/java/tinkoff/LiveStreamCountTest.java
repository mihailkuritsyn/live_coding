package tinkoff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tinkoff.LiveStreamCount.Pair;

class LiveStreamCountTest {

  LiveStreamCount target = new LiveStreamCount();

  @Test
  void test0() {
    Pair[] pairs = new Pair[0];
    Assertions.assertEquals(0, target.countRate(pairs));
  }

  @Test
  void test1() {
    Pair[] pairs = new Pair[]{new Pair(1, 5), new Pair(5, 10)};
    Assertions.assertEquals(1, target.countRate(pairs));
  }

  @Test
  void test2() {
    // [(1, 5), (0, 1), (4, 5)]
    // 1 - s
    // 5 - f
    // 0 - s
    // 1 - f
    // 4 - s
    // 5 - f

    // 0 1 4 5
    // 1 0 1 -2
    Pair[] pairs = new Pair[]{
        new Pair(1, 5),
        new Pair(0, 1),
        new Pair(4, 5),
    };
    Assertions.assertEquals(2, target.countRate(pairs));
  }

  @Test
  void test3() {
    Pair[] pairs = new Pair[]{
        new Pair(1, 10),
        new Pair(5, 6),
        new Pair(2, 3),
        new Pair(7, 8)
    };
    Assertions.assertEquals(2, target.countRate(pairs));
  }

  @Test
  void test4() {
    Pair[] pairs = new Pair[]{
        new Pair(1, 2),
        new Pair(1, 10),
        new Pair(4, 9),
        new Pair(8, 15),
        new Pair(5, 6),
        new Pair(8, 16)
    };
    Assertions.assertEquals(4, target.countRate(pairs));
  }
}