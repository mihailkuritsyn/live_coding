package leetcode.medium.array;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
public class ProductOfArrayExceptSelf238 {

  public int[] productExceptSelf(int[] nums) {
    if (nums.length == 2) {
      return new int[]{nums[1], nums[0]};
    }
    int[] res = new int[nums.length];
    res[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      res[i] = res[i - 1] * nums[i - 1];
    }
    int postfix = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      res[i] = res[i] * postfix;
      postfix *=nums[i];
    }
    return res;
  }

  // extra space solution
//  public int[] productExceptSelf(int[] nums) {
//    if (nums.length == 2) {
//      return new int[]{nums[1], nums[0]};
//    }
//    int[] prefix = new int[nums.length];
//    prefix[0] = nums[0];
//    int[] postfix = new int[nums.length];
//    postfix[nums.length - 1] = nums[nums.length - 1];
//
//    for (int i = 1; i < nums.length; i++) {
//      prefix[i] = prefix[i - 1] * nums[i];
//      postfix[nums.length - 1 - i] = postfix[nums.length - i] * nums[nums.length - 1 - i];
//    }
//
//    int[] res = new int[nums.length];
//    for (int i = 0; i < nums.length; i++) {
//      int l = i > 0 ? prefix[i - 1] : 1;
//      int r = i < nums.length - 1 ? postfix[i + 1] : 1;
//      res[i] = l * r;
//    }
//    return res;
//  }
}
