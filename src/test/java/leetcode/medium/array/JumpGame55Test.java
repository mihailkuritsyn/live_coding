package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JumpGame55Test {

  private JumpGame55 target = new JumpGame55();

  @Test
  void test1() {
    int[] prices = new int[]{2, 3, 1, 1, 4};
    assertTrue(target.canJump(prices));
  }

  @Test
  void test2() {
    int[] prices = new int[]{3, 2, 1, 0, 4};
    assertFalse(target.canJump(prices));
  }

  @Test
  void test3() {
    int[] prices = new int[]{3, 0, 0, 2, 0, 0};
    assertTrue(target.canJump(prices));
  }
}