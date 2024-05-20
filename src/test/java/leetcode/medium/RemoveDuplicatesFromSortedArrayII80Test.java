package leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayII80Test {

  RemoveDuplicatesFromSortedArrayII80 target = new RemoveDuplicatesFromSortedArrayII80();

  @Test
  void test1() {
    int[] nums = {1, 1, 1, 2, 2, 3};
    int size = target.removeDuplicates(nums);
    assertEquals(5, size);
    assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, nums);
  }

  @Test
  void test2() {
    int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    int size = target.removeDuplicates(nums);
    assertEquals(7, size);
    assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3, 3, 3}, nums);
  }

  @Test
  void test3() {
    int[] nums = {1};
    int size = target.removeDuplicates(nums);
    assertEquals(1, size);
    assertArrayEquals(new int[]{1}, nums);
  }

  @Test
  void test4() {
    int[] nums = {1, 1, 1};
    int size = target.removeDuplicates(nums);
    assertEquals(2, size);
    assertArrayEquals(new int[]{1, 1, 1}, nums);
  }
}