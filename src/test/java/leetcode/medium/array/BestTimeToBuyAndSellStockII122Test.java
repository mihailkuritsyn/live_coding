package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockII122Test {

  private BestTimeToBuyAndSellStockII122 target = new BestTimeToBuyAndSellStockII122();

  @Test
  void test1() {
//    7, 1, 5, 3, 6, 4
//             3, 6
//       1, 5
//                6, 4     prevMax = 4 -> 6
//             3, 6        prevMax = 3 sum = 3
//          5, 3           prevMax = 3 -> 5
//       1, 5              prevMax = 1 sum = 3 + 4
    int[] prices = new int[]{7, 1, 5, 3, 6, 4};
    assertEquals(7, target.maxProfit(prices));
  }

  @Test
  void test2() {
//    1, 11, 101
//       10
//           90
//           100
    int[] prices = new int[]{1, 11, 101};
    assertEquals(100, target.maxProfit(prices));
  }

  @Test
  void test3() {
    int[] prices = new int[]{1, 2, 3, 4, 5};
    assertEquals(4, target.maxProfit(prices));
  }

  @Test
  void test4() {
    int[] prices = new int[]{7, 6, 4, 3, 1};
    assertEquals(0, target.maxProfit(prices));
  }
}