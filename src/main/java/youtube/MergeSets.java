package youtube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeSets {

  public static void main(String[] args) {
    int sets[][] = {{1, 2}, {2, 3}}; // intersect {1, 3}
//    int sets[][] = {{1, 2}, {1, 1}}; // 1 contains 2  {1, 2}
//    int sets[][] = {{1, 1}, {1, 2}}; // 2 contains 1  {1, 2}
//    int sets[][] = {{1, 2}, {2, 3}, {3, 4}}; // intersect all

    doMerge(sets);
  }

  public static List<int[]> doMerge(int[][] sets) {
    Arrays.sort(sets, Comparator.comparingInt(a -> a[0]));

    int[] current = sets[0];
    List<int[]> res = new ArrayList<>();

    for (int i = 1; i < sets.length; i++) {
      if (current[1] >= sets[i][0]) {
        // intersect
        if (current[1] > sets[i][1]) {
          // 1 contains 2
        } else if (current[1] < sets[i][1] && current[0] == sets[i][0]) {
          // 2 contains 1
          current = sets[i];
        } else {
          current = new int[]{current[0], sets[i][1]};
        }
      } else {
        // no intersect
        res.add(current);
        current = sets[i];
      }
    }
    res.add(current);
    return res;
  }

}
