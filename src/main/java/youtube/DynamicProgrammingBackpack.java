package youtube;

import java.util.ArrayList;
import java.util.List;

public class DynamicProgrammingBackpack {


  public List<Integer> pack(int[] w, int[] p, int capacity) {
    int count = w.length;

    int[][] dp = new int[count + 1][capacity + 1];

    for (int itemNum = 0; itemNum <= count; itemNum++) {
      for (int wCurr = 0; wCurr <= capacity; wCurr++) {
        if (itemNum == 0 || wCurr == 0) {
          dp[itemNum][wCurr] = 0;
        } else {
          if (wCurr >= w[itemNum - 1]) {
            dp[itemNum][wCurr] = Math.max(dp[itemNum - 1][wCurr],
                p[itemNum - 1] + dp[itemNum - 1][wCurr - w[itemNum - 1]]);
          } else {
            dp[itemNum][wCurr] = dp[itemNum - 1][wCurr];
          }
        }
      }
    }

    List<Integer> res = new ArrayList<>();
    int cLeft = capacity;
    for (int i = count; i > 0; i--) {
      if (dp[i][cLeft] != dp[i - 1][cLeft]) {
        res.add(i);
        cLeft = cLeft - w[i - 1];
      }
    }
    return res;
  }

}
