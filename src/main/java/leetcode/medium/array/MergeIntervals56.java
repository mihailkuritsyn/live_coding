package leetcode.medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given an array of intervals where intervals[i] = [starti, endi],
//merge all overlapping intervals, and return an array of the non-overlapping
//intervals that cover all the intervals in the input.
public class MergeIntervals56 {

  public int[][] merge(int[][] intervals) {
    if (intervals.length == 1) {
      return intervals;
    }

    List<int[]> res = new ArrayList<>(intervals.length);
    Arrays.sort(intervals, Comparator.comparingInt(l -> l[0]));
    int[] curr = intervals[0];
    for (int i = 1; i < intervals.length; i++) {
      int[] item = intervals[i];
      if (curr[1] >= item[0]) {
        if (curr[1] < item[1]) {
          curr[1] = item[1];
        }
      } else {
        res.add(curr);
        curr = item;
      }
    }
    res.add(curr);
    return res.toArray(new int[res.size()][]);
  }
}
