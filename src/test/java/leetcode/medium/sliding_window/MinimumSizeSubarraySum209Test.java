package leetcode.medium.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinimumSizeSubarraySum209Test {

  MinimumSizeSubarraySum209 target = new MinimumSizeSubarraySum209();

  @Test
  void test1() {
    // 1,1,1 - 3
    // 1       l=0 r=0 cs=1
    // 1,1 < 3 l=0 r=1 cs=2
    // 1,1,1=3 l=0 r=2 cs=3
    //   1,1=3 l=1 r=2
    //   1,1=3 l=1 r=2
    assertEquals(3, target.minSubArrayLen(3, new int[]{1, 1, 1}));
  }

  @Test
  void test2() {
    // 1,1 - 3
    // 1
    // 1,1 < 3 r++ = 3 > length
    assertEquals(0, target.minSubArrayLen(3, new int[]{1, 1}));
  }

  @Test
  void test3() {
    // 1, 2, 3 - 5
    // 1
    // 1, 2 <5
    // 1, 2, 3 > 5
    //    2, 3 = 5
    assertEquals(2, target.minSubArrayLen(5, new int[]{1, 2, 3}));
  }

  @Test
  void test4() {
    //2,3,1,2,4,3 - 7
    //2 < 7
    //2,3 < 7
    //2,3,1 <7
    //2,3,1,2 > 7
    //  3,1,2
    //  3,1,2,4
    //    1,2,4 - min = 3
    //      2,4,3
    //        4,3 - min = 2
    assertEquals(2, target.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
  }

  @Test
  void test5() {
    assertEquals(1, target.minSubArrayLen(4, new int[]{1, 4, 4}));
  }

  @Test
  void test6() {
    assertEquals(0, target.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
  }

  @Test
  void test7() {
    assertEquals(3, target.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
  }

  @Test
  void test8() {
    assertEquals(1, target.minSubArrayLen(7, new int[]{1, 1, 1, 1, 7}));
  }
}