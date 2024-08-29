package leetcode.medium.sliding_window;

public class MinimumSizeSubarraySum209 {
// Given an array of positive integers nums and a positive integer
// target, return the minimal length of a subarray
// whose sum is greater than or equal to target. If there is no such
// subarray, return 0 instead.

  public int minSubArrayLen(int target, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0] >= target ? 1 : 0;
    }

    int l = 0;
    int r = 0;
    int currSum = nums[0];
    int res = Integer.MAX_VALUE;
    do {
      if (currSum >= target) {
        res = Math.min(res, r - l + 1);
        currSum -= nums[l];
        l++;
      } else {
        r++;
        if (r == nums.length) {
          return res == Integer.MAX_VALUE ? 0 : res;
        }
        currSum += nums[r];
      }
    } while (l != nums.length);
    return res == Integer.MAX_VALUE ? 0 : res;
  }

//  public int minSubArrayLen(int target, int[] nums) {
//    int result = Integer.MAX_VALUE;
//
//    int left = 0;
//    int val_sum = 0;
//    for (int i = 0; i < nums.length; i++) {
//      val_sum += nums[i];
//      while (val_sum >= target) {
//        result = Math.min(result, i + 1 - left);
//        val_sum -= nums[left];
//        left++;
//      }
//    }
//    return result != Integer.MAX_VALUE ? result : 0;
//  }
}
