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
