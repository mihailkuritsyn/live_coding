package leetcode.medium.array;

public class JumpGameII45 {

  public int jump(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    if (nums.length == 2) {
      return 1;
    }
    int res = 0;
    int l = 0;
    int r = 0;
    while (r < nums.length - 1) {
      int maxJump = r;
      for (int i = l; i <= r; i++) {
        maxJump = Math.max(i + nums[i], maxJump);
      }
      l = r + 1;
      r = maxJump;
      res++;
    }
    return res;
  }
}
