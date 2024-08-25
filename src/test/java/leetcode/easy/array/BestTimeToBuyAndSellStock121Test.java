package leetcode.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStock121Test {

  BestTimeToBuyAndSellStock121 target = new BestTimeToBuyAndSellStock121();

  @Test
  void test1() {
    // 7, 1, 5, 3, 6, 4
//                 6, 4  max = 6 res = 0
//              3, 6     max = 6 res = 3
//           5, 6        max = 6 res = 3
//        1, 6           max = 6 res = 5
//     7, 6              max = 7 res = 5

    int[] prices = new int[]{7, 1, 5, 3, 6, 4};
    assertEquals(5, target.maxProfit(prices));
  }

  @Test
  void test2() {
    int[] prices = new int[]{7, 6, 4, 3, 1};
    assertEquals(0, target.maxProfit(prices));
  }
}