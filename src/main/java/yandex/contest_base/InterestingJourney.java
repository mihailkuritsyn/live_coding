package yandex.contest_base;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterestingJourney {

  //  This Java program reads the input, creates an array of coordinates for each city,
  //  and initializes the distance array with infinity for each city except the start city.
  //  It then uses a BFS to explore each city, updating the distance array with the number
  //  of roads (edges) it has to travel to reach that city. If it finds a city that is within
  //  the fuel limit and hasn't been visited yet or can be reached with fewer roads,
  //  it updates the distance and adds the city to the queue.
  //  Finally, it prints the minimum number of roads to reach the end city,
  //  or -1 if it's not reachable.
  public static void main(String[] args) throws IOException {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int[][] coords = new int[n][2];
      for (int i = 0; i < n; i++) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] xy = {x, y};
        coords[i] = xy;
      }
      int k = scanner.nextInt();
      int start = scanner.nextInt() - 1;
      int end = scanner.nextInt() - 1;

      int[] dist = new int[n];
      Arrays.fill(dist, Integer.MAX_VALUE);
      dist[start] = 0;
      Queue<Integer> queue = new LinkedList<>();
      queue.add(start);

      while (!queue.isEmpty()) {
        int v = queue.poll();
        for (int u = 0; u < n; u++) {
          if (Math.abs(coords[v][0] - coords[u][0]) + Math.abs(coords[v][1] - coords[u][1]) <= k) {
            if (dist[u] > dist[v] + 1) {
              dist[u] = dist[v] + 1;
              queue.add(u);
            }
          }
        }
      }

      int x = dist[end] != Integer.MAX_VALUE ? dist[end] : -1;
//      System.out.println("rc = " + x);
      System.out.println(x);
    }
  }
}
