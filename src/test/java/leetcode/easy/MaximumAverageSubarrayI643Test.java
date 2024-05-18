package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumAverageSubarrayI643Test {

  MaximumAverageSubarrayI643 target = new MaximumAverageSubarrayI643();

  @Test
  void test1() {
    double maxAverage = target.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3, 4}, 4);
    Assertions.assertEquals(12.75, maxAverage);
  }

  @Test
  void test2() {
    double maxAverage = target.findMaxAverage(new int[]{5}, 1);
    Assertions.assertEquals(5, maxAverage);
  }
}