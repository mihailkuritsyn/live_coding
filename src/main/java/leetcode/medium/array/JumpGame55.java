package leetcode.medium.array;

//You are given an integer array nums. You are initially positioned
// at the array's first index, and each element in the array
// represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
public class JumpGame55 {

  public boolean canJump(int[] nums) {
    if (nums.length == 1) {
      return true;
    }
    if (nums.length == 2) {
      return nums[0] >= 1;
    }
    int minHoops = 1;
    for (int i = nums.length - 2; i >= 1; i--) {
      if (nums[i] >= minHoops) {
        minHoops = 1;
      } else {
        minHoops++;
      }
    }
    return nums[0] >= minHoops;
  }
}
