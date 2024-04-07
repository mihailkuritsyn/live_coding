package leetcode.easy.dp;

public class ClimbingStairs {

//  public int climbStairs(int n) {
//    System.out.println(n);
//    if (n <= 3) {
//      return n;
//    } else {
//      return climbStairs(n - 1) + climbStairs(n - 2);
//    }
//  }

//  public int climbStairs(int n) {
//    if (n <= 3) {
//      return n;
//    } else {
//      int[] fib = new int[n + 1];
//      fib[1] = 1;
//      fib[2] = 2;
//      fib[3] = 3;
//      for (int i = 4; i <= n; i++) {
//        fib[i] = fib[i - 1] + fib[i - 2];
//      }
//      return fib[n];
//    }
//  }

  public int climbStairs(int n) {
    if (n <= 3) {
      return n;
    } else {
      int prev1 = 2;
      int prev2 = 3;
      int res = 0;
      for (int i = 4; i <= n; i++) {
        res = prev1 + prev2;
        prev1 = prev2;
        prev2 = res;
      }
      return res;
    }
  }
}
