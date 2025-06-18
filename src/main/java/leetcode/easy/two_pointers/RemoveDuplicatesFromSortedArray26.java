package leetcode.easy.two_pointers;

public class RemoveDuplicatesFromSortedArray26 {

//  public int removeDuplicates(int[] nums) {
//    if (nums.length == 1) {
//      return 1;
//    }
//    if (nums.length == 2) {
//      return nums[0] == nums[1] ? 1 : 2;
//    }
//    int l = 1;
//    int prev = nums[0];
//    for (int i = 1; i < nums.length; i++) {
//      if (prev != nums[i]) {
//        nums[l] = nums[i];
//        prev = nums[i];
//        l++;
//      }
//    }
//    return l;
//  }

  public int removeDuplicates(int[] nums) {
    int l = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        l++;
        nums[l] = nums[i];
      }
    }
    return l + 1;
  }
}
