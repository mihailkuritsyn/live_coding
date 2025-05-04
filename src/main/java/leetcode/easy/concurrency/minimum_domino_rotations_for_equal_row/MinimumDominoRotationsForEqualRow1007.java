package leetcode.easy.concurrency.minimum_domino_rotations_for_equal_row;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MinimumDominoRotationsForEqualRow1007 {

  public int minDominoRotations(int[] tops, int[] bottoms) {
    int res = Integer.MAX_VALUE;

    List<Future<Integer>> futures = new ArrayList<>();
    try (ExecutorService es = Executors.newFixedThreadPool(6)) {
      for (int i = 0; i <= 6; i++) {
        int finalI = i;
        futures.add(es.submit(() -> getRotationsCount(tops, bottoms, finalI)));
      }
    }

    for (Future<Integer> future : futures) {
      try {
        res = Math.min(res, future.get());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return res == Integer.MAX_VALUE ? -1 : res;
  }

  public static int getRotationsCount(int[] tops, int[] bottoms, int target) {
    int topRotationsCount = 0;
    int bottomRotationsCount = 0;
    for (int i = 0; i < tops.length; i++) {
      if (tops[i] != target && bottoms[i] != target) {
        return Integer.MAX_VALUE;
      } else if (tops[i] == bottoms[i]) {
      } else if (tops[i] == target) {
        bottomRotationsCount++;
      } else {
        topRotationsCount++;
      }
    }
    return Math.min(bottomRotationsCount, topRotationsCount);
  }

}
