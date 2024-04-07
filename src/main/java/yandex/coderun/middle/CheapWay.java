package yandex.coderun.middle;

import java.util.Scanner;

public class CheapWay {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();

      int[][] mx = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          int val = scanner.nextInt();
          mx[i][j] = val;
          if (i == 0 && j == 0) {
            continue;
          } else if (j - 1 < 0) {
            mx[i][j] += mx[i - 1][j];
          } else if (i - 1 < 0) {
            mx[i][j] += mx[i][j - 1];
          } else {
            mx[i][j] = Math.min(mx[i][j - 1] + mx[i][j], mx[i - 1][j] + mx[i][j]);
          }
        }
      }
      System.out.println(mx[n - 1][m - 1]);
    }
  }
}