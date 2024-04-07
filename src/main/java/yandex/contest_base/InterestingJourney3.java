package yandex.contest_base;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterestingJourney3 {

  private static boolean checkDistance(int[] current, int[] point, int limit) {
    return Math.abs(current[0] - point[0]) + Math.abs(current[1] - point[1]) <= limit;
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();

      Set<Integer> remaining = new HashSet<>();

      int[][] points = new int[n][2];
      for (int i = 0; i < n; i++) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] xy = {x, y};
        points[i] = xy;
        remaining.add(i);
      }
      int distanceLimit = scanner.nextInt();
      int start = scanner.nextInt();
      int finish = scanner.nextInt();

      int count = getCount(remaining, points, distanceLimit, start, finish);

//      System.out.println("rc = " + count);
      System.out.println(count);
    }
  }

  private static int getCount(Set<Integer> remaining, int[][] points, int distanceLimit,
      int start, int finish) {
    int layerNumber = 0;
    Set<Integer> prevLayer = new HashSet<>();
    Set<Integer> currLayer = new HashSet<>();

    currLayer.add(start - 1);
    remaining.remove(start - 1);

    while (!currLayer.contains(finish - 1)) {
      if (remaining.size() == 0) {
        return -1;
      }
      Set<Integer> nexLayer = new HashSet<>();

      for (Integer currPointInd : currLayer) {
        for (Integer remPointInd : remaining) {
          if (checkDistance(points[currPointInd], points[remPointInd], distanceLimit) &&
              !prevLayer.contains(currPointInd)) {
            nexLayer.add(remPointInd);
          }
        }
      }
      nexLayer.forEach(remaining::remove);
      if (nexLayer.isEmpty()) {
        return -1;
      }

      prevLayer = currLayer;
      currLayer = nexLayer;
      layerNumber++;
    }
    return layerNumber;
  }
}
