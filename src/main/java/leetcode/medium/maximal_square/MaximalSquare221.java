package leetcode.medium.maximal_square;

public class MaximalSquare221 {

//  Given an m x n binary matrix filled with 0's and 1's,
//  find the largest square containing only 1's and return its area.

  public int maximalSquare(char[][] m) {
    int maxRes = 0;

    int[][] dp = new int[m.length + 1][m[0].length + 1];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (m[i][j] == '1') {
          dp[i + 1][j + 1] = 1 + Math.min(dp[i + 1][j], Math.min(dp[i][j], dp[i][j + 1]));
          maxRes = Math.max(maxRes, dp[i + 1][j + 1]);
        }
      }
    }
    return maxRes * maxRes;
  }

  // -----------my (M x N)^2 solution----------
//  public int maximalSquare(char[][] m) {
//    int maxRes = 0;
//    for (int i = 0; i < m.length; i++) {
//      for (int j = 0; j < m[i].length; j++) {
//        if (m[i][j] == '1') {
//          maxRes = Math.max(maxRes, traverse(m, i, j));
//        }
//      }
//    }
//    return maxRes * maxRes;
//  }
//
//  private int traverse(char[][] m, int i, int j) {
//    int res = 1;
//
//    int k = i + 1;
//    int l = j + 1;
//    while (k < m.length && l < m[0].length) {
//      if (m[k][l] == '0') {
//        return res;
//      }
//      for (int n = i, o = j; n < k; n++, o++) {
//        if (m[n][l] == '0' || m[k][o] == '0') {
//          return res;
//        }
//      }
//      res++;
//      k++;
//      l++;
//    }
//    return res;
//  }
}
