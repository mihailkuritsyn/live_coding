package leetcode.medium;

public class RemoveDuplicatesFromSortedArrayII80 {

//  Given an integer array nums sorted in non-decreasing order, remove some
//  duplicates in-place such that each unique element appears at most twice.
//  The relative order of the elements should be kept the same.
//
// Since it is impossible to change the length of the array in some languages,
// you must instead have the result be placed in the first part of the array nums.
// More formally, if there are k elements after removing the duplicates, then
// the first k elements of nums should hold the final result. It does not matter
// what you leave beyond the first k elements.
//
// Return k after placing the final result in the first k slots of nums.
//
// Do not allocate extra space for another array. You must do this by modifying
// the input array in-place with O(1) extra memory.

// 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4
// 1, 1, 2, 2, 3, 3, 4
// 0, 0, 0,-1,-1,-1,-1, 0, 0, 0,-4
// curr=1 count=1
// curr=1 count=2
// curr=1 count=3
// curr=2 count=3>2 count 1 offset+(3-2) = 1
// curr=2 count=2 offset 1
// curr=3 count=1 offset 1
// curr=3 count=2 offset 1
// curr=3 count=3 offset 1
// curr=3 count=4 offset 1
// curr=3 count=5 offset 1
// curr=4 count=1 offset=offset+(5-2)=4

  public int removeDuplicates(int[] nums) {
    if (nums.length == 1 || nums.length == 2) {
      return nums.length;
    }
    int offset = 0;
    int count = 1;
    int currNum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == currNum) {
        count++;
        if (count <= 2 && offset > 0) {
          nums[i - offset] = nums[i];
        }
      } else {
        currNum = nums[i];
        if (count > 2) {
          offset += count - 2;
        }
        if (offset > 0) {
          nums[i - offset] = nums[i];
        }
        count = 1;
      }
    }
    if (count > 2) {
      offset += count - 2;
    }
    return nums.length - offset;
  }

}
