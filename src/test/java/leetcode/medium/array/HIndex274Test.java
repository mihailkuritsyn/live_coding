package leetcode.medium.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HIndex274Test {

  private HIndex274 target = new HIndex274();

  @Test
  void test1() {
    int[] a = new int[]{3, 0, 6, 1, 5};
//    0 1 2 3 4 5
//    1 1 0 1 0 2
//    1 4 0 3 2 2
//
    Assertions.assertEquals(3, target.hIndex(a));
  }

  @Test
  void test2() {
    int[] a = new int[]{1, 3, 1};
//    0 1 2 3
//    0 2 0 1
    Assertions.assertEquals(1, target.hIndex(a));
  }

  @Test
  void test3() {
    int[] a = new int[]{1, 2, 3};
//    0 1 2 3
//    0 1 1 1
    Assertions.assertEquals(2, target.hIndex(a));
  }

  @Test
  void test4() {
    int[] a = new int[]{3, 3, 3};
//    0 1 2 3
//    0 0 0 3
    Assertions.assertEquals(3, target.hIndex(a));
  }

  @Test
  void test5() {
    int[] a = new int[]{1, 1, 1};
    Assertions.assertEquals(1, target.hIndex(a));
  }

  @Test
  void test6() {
    int[] a = new int[]{10, 10, 10};
    Assertions.assertEquals(3, target.hIndex(a));
  }
}