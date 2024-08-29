package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GasStation134Test {

  private GasStation134 target = new GasStation134();

  @Test
  void test1() {
    int[] gas = new int[]{1, 2, 3, 4, 5};
    int[] cost = new int[]{3, 4, 5, 1, 2};
    assertEquals(3, target.canCompleteCircuit(gas, cost));
//    1, 2, 3, 4, 5
//    3, 4, 5, 1, 2
//   -2 -2 -2  3  3
  }

  @Test
  void test2() {
    int[] gas = new int[]{2, 2, 3};
    int[] cst = new int[]{1, 2, 4};
    assertEquals(0, target.canCompleteCircuit(gas, cst));
//    2, 2, 3
//    1, 2, 4
//    1  0 -1

  }

  @Test
  void test3() {
    int[] gas = new int[]{2, 3, 4};
    int[] cst = new int[]{3, 4, 3};
    assertEquals(-1, target.canCompleteCircuit(gas, cst));
//    2, 3, 4
//    3, 4, 3
//   -1 -1  1
  }

  @Test
  void test4() {
    int[] gas = new int[]{3, 4, 3, 3, 2};
    int[] cst = new int[]{4, 3, 4, 4, 0};
    assertEquals(4, target.canCompleteCircuit(gas, cst));
//    3  4  3  3  2
//    4  3  4  4  0
//   -1  1 -1 -1  2
  }

  @Test
  void test5() {
    int[] gas = new int[]{1, 2, 3, 4, 5};
    int[] cost = new int[]{3, 4, 5, 1, 2};
    assertEquals(3, target.canCompleteCircuit(gas, cost));
//    1, 2, 3, 4, 6
//    3, 4, 5, 1, 2
//   -2 -2 -2  3  4
  }

  @Test
  void test6() {
    int[] gas = new int[]{3, 3, 3, 3, 3, 3, 3, 3};
    int[] cost = new int[]{5, 1, 4, 4, 4, 2, 2, 2};
    assertEquals(5, target.canCompleteCircuit(gas, cost));
//    3, 3,  3,  3,  3, 3, 3, 3
//    5, 1,  4,  4,  4, 2, 2, 2
//   -2, 2, -1, -1, -1, 1, 1, 1
  }

  @Test
  void test7() {
    int[] gas = new int[]{0};
    int[] cost = new int[]{0};
    assertEquals(0, target.canCompleteCircuit(gas, cost));
  }

  @Test
  void test8() {
    int[] gas = new int[]{0};
    int[] cost = new int[]{1};
    assertEquals(-1, target.canCompleteCircuit(gas, cost));
  }
}