package leetcode.medium.array;

public class RotateArray189 {

//    1 2 3 4 5 6 7
//    0 1 2 3 4 5 6
//    5 6 7 1 2 3 4
//    0 1 2 3 4 5 6
//    0  -> 3
//      1 ->  4
//        2  -> 5
//          3 ->  6
//            4 ->  0
//              5 ->  1
//                6 ->  2


  //    1 2 3 4 5 6 7
  //    7 6 5|4 3 2 1
  //    5 6 7|4 3 2 1
  //    5 6 7|1 2 3 4
  public void rotate(int[] nums, int k) {
    if (nums.length == 1) {
      return;
    }
    if (k > nums.length) {
      k = k % nums.length;
    }

    int i = 0;
    int j = nums.length - 1;
    int tmp;
    while (i < j) {
      tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
      i++;
      j--;
    }

    i = 0;
    j = k - 1;
    while (i < j) {
      tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
      i++;
      j--;
    }

    i = k;
    j = nums.length - 1;
    while (i < j) {
      tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
      i++;
      j--;
    }
  }

//      for (int i = 0; i < nums.length / 2; i++) {
//    int tmp = nums[i];
//    nums[i] = nums[nums.length - i - 1];
//    nums[nums.length - i - 1] = tmp;
//  }
//    for (int i = 0; i < k / 2; i++) {
//    int tmp = nums[i];
//    nums[i] = nums[k - i - 1];
//    nums[k - i - 1] = tmp;
//  }

  // additional memory
//  public void rotate(int[] nums, int k) {
//    if (nums.length == 1) {
//      return;
//    }
//    if (k > nums.length) {
//      k = k % nums.length;
//    }
//    int[] endPart = new int[k];
//    System.arraycopy(nums, nums.length - k, endPart, 0, k);
//    System.arraycopy(nums, 0, nums, k, nums.length - k);
//    System.arraycopy(endPart, 0, nums, 0, endPart.length);
//  }
}
