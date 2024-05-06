package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArray88Test {

  private final MergeSortedArray88 target = new MergeSortedArray88();

  @Test
  void test1() {
//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    1,2,3,0,0,0 -> 1,2,0,3,0,0
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    target.merge(nums1, 3, new int[]{2, 5, 6}, 3);
    Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
  }

  @Test
  void test2() {
//    Input: nums1 = [1,2,3,7,8,0,0,0], m = 5, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6,7,8]
//    1,2,3,7,8,0,0,0 -> 1,2,0,3,0,0,7,8

//    1,2,3,7,8,0,0,0 | 2,5,6    m=5 n=3
//    1,2,3,7,0,0,0,8 | 2,5,6    m=4 n=3
//    1,2,3,0,0,0,7,8 | 2,5,6    m=3 n=3
//    1,2,3,0,0,6,7,8 | 2,5      m=3 n=2
//    1,2,3,0,5,6,7,8 | 2        m=3 n=1
//    1,2,0,3,5,6,7,8 | 2        m=2 n=1
//    1,2,2,3,5,6,7,8 |          m=2 n=0
    int[] nums1 = {1, 2, 3, 7, 8, 0, 0, 0};
    target.merge(nums1, 5, new int[]{2, 5, 6}, 3);
    Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6, 7, 8}, nums1);
  }

  @Test
  void test3() {
//    Input: nums1 = [1], m = 1, nums2 = [], n = 0
//    Output: [1]
    int[] nums1 = {1};
    target.merge(nums1, 1, new int[0], 0);
    Assertions.assertArrayEquals(new int[]{1}, nums1);
  }

  @Test
  void test4() {
//    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//    Output: [1]
    int[] nums1 = {0};
    target.merge(nums1, 0, new int[]{1}, 1);
    Assertions.assertArrayEquals(new int[]{1}, nums1);
  }

  @Test
  void test5() {
//    2,0 | 1    m=1 n=1
//    0,2 | 1    m=0 n=1
    int[] nums1 = {2, 0};
    target.merge(nums1, 1, new int[]{1}, 1);
    Assertions.assertArrayEquals(new int[]{1, 2}, nums1);
  }
}