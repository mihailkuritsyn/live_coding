package leetcode.medium.dp;

import java.util.Arrays;
import java.util.List;

public class Triangle120 {
//Given a triangle array, return the minimum path sum from top to bottom.
//
//For each step, you may move to an adjacent number of the row below.
//More formally, if you are on index i on the current row, you may
//move to either index i or index i + 1 on the next row.


  public int minimumTotal(List<List<Integer>> triangle) {
    if (triangle.size() == 1) {
      return triangle.get(0).get(0);
    }
    int[][] val = new int[triangle.size()][triangle.size() + 2];
    for (int[] temp : val) {
      Arrays.fill(temp, Integer.MAX_VALUE);
    }
    int res = Integer.MAX_VALUE;
    val[0][1] = triangle.get(0).get(0);
    for (int i = 1; i < triangle.size(); i++) {
      List<Integer> curRow = triangle.get(i);
      for (int j = 1; j <= curRow.size(); j++) {
        int prevLeft = val[i - 1][j - 1];
        int prevRight = val[i - 1][j];
        if (i == triangle.size() - 1) {
          res = Math.min(res, curRow.get(j - 1) + Math.min(prevLeft, prevRight));
        } else {
          val[i][j] = curRow.get(j - 1) + Math.min(prevLeft, prevRight);
        }
      }
    }
    return res;
  }

//  public int minimumTotal(List<List<Integer>> triangle) {
//    if (triangle.size() == 1) {
//      return triangle.get(0).get(0);
//    }
//    int res = Integer.MAX_VALUE;
//    for (int i = 1; i < triangle.size(); i++) {
//      List<Integer> curRow = triangle.get(i);
//      for (int j = 0; j < curRow.size(); j++) {
//        List<Integer> prevRow = triangle.get(i - 1);
//        int prevLeft = j - 1 >= 0 ? prevRow.get(j - 1) : Integer.MAX_VALUE;
//        int prevRight = prevRow.size() > j ? prevRow.get(j) : Integer.MAX_VALUE;
//        if (i == triangle.size() - 1) {
//          res = Math.min(res, curRow.get(j) + Math.min(prevLeft, prevRight));
//        } else {
//          curRow.set(j, curRow.get(j) + Math.min(prevLeft, prevRight));
//        }
//      }
//    }
//    return res;
//  }
//  public int minimumTotal(List<List<Integer>> triangle) {
//    if (triangle.size() == 1) {
//      return triangle.get(0).get(0);
//    }
//    for (int i = 1; i < triangle.size(); i++) {
//      List<Integer> curRow = triangle.get(i);
//      for (int j = 0; j < curRow.size(); j++) {
//        List<Integer> prevRow = triangle.get(i - 1);
//        int prevLeft = j - 1 >= 0 ?
//            prevRow.get(j - 1) : Integer.MAX_VALUE;
//        int prevRight = prevRow.size() > j ?
//            prevRow.get(j) : Integer.MAX_VALUE;
//        curRow.set(j, curRow.get(j) + Math.min(prevLeft, prevRight));
//      }
//    }
//    int res = Integer.MAX_VALUE;
//    for (Integer val : triangle.get(triangle.size() - 1)) {
//      res = Math.min(res, val);
//    }
//    return res;
//  }
}
