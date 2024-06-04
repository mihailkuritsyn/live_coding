package leetcode.medium.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWater11Test {

  ContainerWithMostWater11 target = new ContainerWithMostWater11();

  @Test
  void test1() {
    int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    Assertions.assertEquals(49, target.maxArea(height));
  }

  @Test
  void test2() {
    int[] height = new int[]{1, 1};
    Assertions.assertEquals(1, target.maxArea(height));
  }
}