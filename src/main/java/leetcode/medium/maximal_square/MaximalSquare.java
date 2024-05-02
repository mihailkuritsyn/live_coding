package leetcode.medium.maximal_square;

public class MaximalSquare {

  public static void main(String[] args) {
//    char[][] matrix = new char[][]{{'0', '1'}, {'1', '0'}};
//    char[][] matrix = new char[][]{{'1', '1'}, {'1', '1'}};
    char[][] matrix = new char[][]{
        {'1', '1', '1'},
        {'1', '1', '1'},
        {'1', '1', '1'}};
    int res = new MaximalSquare().maximalSquare(matrix);
    System.out.println(res);
  }

  public int maximalSquare(char[][] matrix) {
    int maxRes = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        maxRes = Math.max(maxRes, traverse(matrix, i, j));
      }
    }
    return maxRes;
  }

  public int traverse(char[][] m, int i, int j) {
    int res = 0;

    int limit = Math.min(m.length - i, m[0].length - j);

    if (m[i][j] == '1') {
      res = 1;

      int stepNum = 0;
      while (stepNum < limit) {
        stepNum++;

        for (int k = 0, l = stepNum - 1; k < stepNum; k++, l--) {
          if (m[k][l] == '0' || m[l][k] == '0') {
            return res;
          }
        }
        if (m[stepNum][stepNum] == '0') {
          return res;
        }
        res++;
      }
    }

//    if (m[i][j] == '1') {
//      res = 1;
//      if (m[i][j + 1] == '1' &&
//
//          m[i + 1][j] == '1' &&
//
//          m[i + 1][j + 1] == '1') {
//        res = 2;
//        if (m[i][j + 2] == '1' &&
//            m[i + 1][j + 2] == '1' &&
//
//            m[i + 2][j + 2] == '1' &&
//
//            m[i + 2][j + 1] == '1' &&
//            m[i + 2][j] == '1') {
//          res = 3;
//        }
//      }
//    }
    return res;
  }
}
