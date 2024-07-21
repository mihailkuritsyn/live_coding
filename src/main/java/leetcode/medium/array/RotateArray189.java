package leetcode.medium.array;

public class RotateArray189 {

  public void rotate(int[] nums, int k) {
//    1, 2, 3, 4, 5, 6, 7
//    0  1  2  3  4  5  6
//    4       5  6
//    size-3    size-1
//    from      to
//    6        size-k-1 3
//    5 6 7 1 2 3 4
//    0 1 2 3 4 5 6
//    0  -> 3
//      1 ->  4
//         2 -> 5
//          3 ->  6
    //    for (int i = nums.length - 1; i >= k; i--) {
//      nums[i] = nums[i - k];
//    }

    if (nums.length == 1) {
      return;
    }
    if (k > nums.length) {
      k = k % nums.length;
    }
    int[] endPart = new int[k];
    System.arraycopy(nums, nums.length - k, endPart, 0, k);
    System.arraycopy(nums, 0, nums, k, nums.length - k);
    System.arraycopy(endPart, 0, nums, 0, endPart.length);
  }
}
