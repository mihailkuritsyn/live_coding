package yandex.coderun.middle;

import java.util.Scanner;
import java.util.Stack;

public class FindCycleInGraph {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();

      int[] parent = new int[n];

      int[][] mx = new int[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          int val = scanner.nextInt();
          mx[i][j] = val;
        }
        parent[i] = -1;
      }

      boolean[] visited = new boolean[n];
      int visitedCount = 0;

      Stack<Integer> stack = new Stack<>();
      stack.push(0);

      while (!stack.isEmpty()) {
        int current = stack.pop();
//        System.out.println("Visit " + current);

        if (!visited[current]) {
          visited[current] = true;
          visitedCount++;

          for (int i = 0; i < n; i++) {
            if (mx[current][i] == 1) {
              if (!visited[i]) {
                stack.push(i);
                parent[i] = current;
              } else if (parent[current] != i && parent[i] != current) {
                System.out.println("YES");
                StringBuilder path = new StringBuilder((i + 1) + " ");
                int j = current;
                while (j != i) {
                  path.append(j + 1).append(" ");
                  j = parent[j];
                }
                int x = path.length() / 2;
                System.out.println(x);
                System.out.println(path);
                return;
              }
            }
          }
        }

        if (stack.isEmpty() && visitedCount != n) {
          for (int i = 0; i < n; i++) {
            if (!visited[i]) {
              stack.push(i);
              break;
            }
          }
        }
      }
      System.out.println("NO");
    }
  }
}

//  private static boolean detectCycle(int[][] mx, int current, boolean[] visited, int[] parent) {
//    visited[current] = true;
//    for (int i = 0; i < visited.length; i++) {
//      if (mx[current][i] == 1) {
//        if (!visited[i]) {
//          parent[i] = current;
//          if (detectCycle(mx, i, visited, parent)) {
//            return true;
//          }
//        } else if (parent[current] != i && parent[i] != current) {
//          System.out.println("Loop");
//          int j = i;
//          while (j != -1) {
//            System.out.print(j + " ");
//            j = parent[j];
//          }
//          return true;
//        }
//      }
//    }
//    return false;
//  }
