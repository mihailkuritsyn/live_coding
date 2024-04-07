package yandex.contest_base;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class InterestingJourney2 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();

      int[][] points = new int[n][2];
      for (int i = 0; i < n; i++) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] xy = {x, y};
        points[i] = xy;
      }
      int distanceLimit = scanner.nextInt();
      int start = scanner.nextInt();
      int finish = scanner.nextInt();

      int count = getRoadsCount(n, points, distanceLimit, start, finish);
      System.out.println("rc = " + count);
    }
  }

  private static int getRoadsCount(int n, int[][] points, int distanceLimit, int start,
      int finish) {
    boolean[] visited = new boolean[n];
    visited[start - 1] = true;

    int[] rCount = new int[n];

    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(start - 1);
    rCount[start - 1] = 0;

    while (!queue.isEmpty()) {
      int currInd = queue.remove();
      System.out.println("current " + (currInd + 1));

      for (int i = 0; i < n; i++) {
        if (visited[i]) {
          continue;
        }
        int cityDistance = checkDistance(points[currInd], points[i]);
        if (cityDistance <= distanceLimit) {
          if (i == finish - 1) {
            return rCount[currInd] + 1;
          }
          visited[i] = true;
          System.out.println("visited[" + (i + 1) + "] = true");
          rCount[i] = rCount[currInd] + 1;
          queue.add(i);
        }
      }
    }
    return -1;
  }

  private static int checkDistance(int[] current, int[] point) {
    return Math.abs(current[0] - point[0]) + Math.abs(current[1] - point[1]);
  }
//
//  private static double checkDistance(int[] current, int[] point) {
//    double cityDistance = Math.sqrt(
//        Math.pow(point[0] - current[0], 2) + Math.pow(point[1] - current[1], 2));
//    System.out.println("cityDistance = " + cityDistance);
//    return cityDistance;
//  }

}
