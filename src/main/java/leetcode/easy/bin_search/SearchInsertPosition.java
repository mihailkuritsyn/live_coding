package leetcode.easy.bin_search;

public class SearchInsertPosition {

//  public int searchInsert(int[] nums, int target) {
//    return findInSub(0, nums.length - 1, nums, target);
//  }
//
//  private int findInSub(int startIdx, int endIdx, int[] nums, int target) {
//    if (endIdx - startIdx <= 0) {
//      return target > nums[startIdx] ? startIdx + 1 : startIdx;
//    }
//    int midIdx = (endIdx - startIdx) / 2 + startIdx;
//    if (nums[midIdx] == target) {
//      return midIdx;
//    } else if (target < nums[midIdx]) {
//      return findInSub(startIdx, midIdx - 1, nums, target);
//    } else {
//      return findInSub(midIdx + 1, endIdx, nums, target);
//    }
//  }


  public int searchInsert(int[] nums, int target) {
    int startIdx = 0;
    int endIdx = nums.length - 1;
    while (endIdx >= startIdx) {
      int midIdx = (endIdx - startIdx) / 2 + startIdx;
      if (nums[midIdx] == target) {
        return midIdx;
      } else if (target < nums[midIdx]) {
        endIdx = midIdx - 1;
      } else {
        startIdx = midIdx + 1;
        if (startIdx > nums.length - 1) {
          return startIdx;
        }
      }
    }
    return target > nums[startIdx] ? startIdx + 1 : startIdx;
  }
}
