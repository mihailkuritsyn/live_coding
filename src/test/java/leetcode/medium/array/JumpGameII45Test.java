package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JumpGameII45Test {

  private JumpGameII45 target = new JumpGameII45();

  @Test
  void test1() {
    int[] prices = new int[]{2, 3, 1, 1, 4};
    assertEquals(2, target.jump(prices));
  }

  @Test
  void test2() {
    int[] prices = new int[]{2, 3, 0, 1, 4};
    assertEquals(2, target.jump(prices));
  }

  @Test
  void test3() {
    int[] prices = new int[]{3, 0, 0, 2, 0, 0};
    assertEquals(2, target.jump(prices));
  }

  @Test
  void test4() {
    int[] prices = new int[]{1, 2, 3};
    assertEquals(2, target.jump(prices));
  }

  @Test
  void test5() {
//    3, 0, 2, 3, 2, 0, 0 l=0 r=0 while r <= length-1
//    3                   l=1 r=0+3=3 res 1
//       0, 2, 3          l=4 r=3 res 1
//                2, 0, 0
    int[] prices = new int[]{3, 0, 2, 3, 2, 0, 0};
    assertEquals(2, target.jump(prices));
  }
}