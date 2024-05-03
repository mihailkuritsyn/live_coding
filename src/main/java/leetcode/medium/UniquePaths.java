package leetcode.medium;

/*There is a robot on an m x n grid.
The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths
that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.
*/
public class UniquePaths {

//  1 1 1
//  1 2 3
//  1 3 6

  public int uniquePaths(int m, int n) {
    int[][] paths = new int[m][n];
    return getPathsCount(m - 1, n - 1, paths);
  }

  private int getPathsCount(int i, int j, int[][] paths) {
    if (paths[i][j] != 0) {
      return paths[i][j];
    }
    if (i == 0 || j == 0) {
      return 1;
    }
    paths[i][j] = getPathsCount(i - 1, j, paths) + getPathsCount(i, j - 1, paths);
    return paths[i][j];
  }
}
