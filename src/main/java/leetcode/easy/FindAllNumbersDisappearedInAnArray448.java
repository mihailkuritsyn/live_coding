package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {

  // Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> res = new ArrayList<>();
    if (nums.length == 1) {
      return res;
    }
    int i = 0;
    while (i < nums.length) {
      if (nums[i] != nums[nums[i] - 1]) {
        swap(i, nums[i] - 1, nums);
      } else {
        i++;
      }
    }
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        res.add(i + 1);
      }
    }
    return res;
  }

  private static void swap(int ind1, int ind2, int[] nums) {
    int tmp = nums[ind1];
    nums[ind1] = nums[ind2];
    nums[ind2] = tmp;
  }

  public List<Integer> findDisappearedNumbersAdditionalMemory(int[] nums) {
    List<Integer> res = new ArrayList<>();
    if (nums.length == 1) {
      return res;
    }

    boolean[] numPresent = new boolean[nums.length];
    for (int num : nums) {
      numPresent[num - 1] = true;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!numPresent[i]) {
        res.add(i + 1);
      }
    }
    return res;
  }
}
