package leetcode.medium.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArray189Test {

  RotateArray189 target = new RotateArray189();

  @Test
  void tets1() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    target.rotate(nums, 3);
    Assertions.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
  }

  @Test
  void tets2() {
    int[] nums = {-1, -100, 3, 99};
    target.rotate(nums, 2);
    Assertions.assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
  }

  @Test
  void tets3() {
    int[] nums = {-1};
    target.rotate(nums, 2);
    Assertions.assertArrayEquals(new int[]{-1}, nums);
  }

  @Test
  void tets4() {
    int[] nums = {1, 2};
//  2,1
//  1,2
//  2,1
//  1,2

    target.rotate(nums, 4);
    Assertions.assertArrayEquals(new int[]{1, 2}, nums);
  }

  @Test
  void tets5() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    target.rotate(nums, 11);
    Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 1}, nums);
  }
}