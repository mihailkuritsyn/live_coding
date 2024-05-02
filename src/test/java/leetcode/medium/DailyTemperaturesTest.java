package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DailyTemperaturesTest {

  private final DailyTemperatures dt = new DailyTemperatures();

  @Test
  void test1() {
    int[] nextHotDay = dt.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    Assertions.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, nextHotDay);
  }

  @Test
  void test2() {
    int[] nextHotDay = dt.dailyTemperatures(new int[]{30, 40, 50, 60});
    Assertions.assertArrayEquals(new int[]{1, 1, 1, 0}, nextHotDay);
  }

  @Test
  void test3() {
    int[] nextHotDay = dt.dailyTemperatures(new int[]{30, 60, 90});
    Assertions.assertArrayEquals(new int[]{1, 1, 0}, nextHotDay);
  }

  @Test
  void test4() {
    int[] nextHotDay = dt.dailyTemperatures(new int[]{13, 12, 15, 11, 9, 12, 16});
    Assertions.assertArrayEquals(new int[]{2, 1, 4, 2, 1, 1, 0}, nextHotDay);
  }
}