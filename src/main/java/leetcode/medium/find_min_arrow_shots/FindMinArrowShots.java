package main.java.leetcode.medium.find_min_arrow_shots;

import java.util.Arrays;

public class FindMinArrowShots {

  public static void main(String[] args) {
    FindMinArrowShots obj = new FindMinArrowShots();

//    int[][] points = {{1, 3}, {2, 3}};
    int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
//    int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {6,6}};
    int minArrowShots = obj.findMinArrowShots(points);
    System.out.printf("arrows count: " + minArrowShots);
  }

  public int findMinArrowShots(int[][] points) {
//    Arrays.sort(points, Comparator.comparingInt(balloon -> balloon[0]));
    Arrays.sort(points, (o1, o2) -> Integer.compare(o1[0], o2[0]));
    int arrowCount = 1;

    int[] current = points[0];
    int x1 = current[0];
    int x2 = current[1];

    for (int i = 1; i < points.length; i++) {
      int[] next = points[i];
      int nx1 = next[0];
      int nx2 = next[1];
      // check includes next
      if (x1 <= nx1 && x2 >= nx2) {
        x1 = nx1;
        x2 = nx2;
      } else if (x2 >= nx1) { // check intersect
        // set intersection as current
        x1 = nx1;
      } else { // no intersection
        x1 = nx1;
        x2 = nx2;
        arrowCount++;
      }
    }
    return arrowCount;
  }

}
