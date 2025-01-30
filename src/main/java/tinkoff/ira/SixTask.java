package tinkoff.ira;

import java.util.Scanner;

public class SixTask {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int[][] points = new int[n][2];

      for (int i = 0; i < n; i++) {
        points[i][0] = scanner.nextInt();
        points[i][1] = scanner.nextInt();
      }

      boolean[] used = new boolean[n];
      int happyTriples = 0;
      for (int i = 0; i < n; i++) {
        if (used[i]) {
          continue;
        }
        for (int j = i + 1; j < n; j++) {
          if (used[i]) {
            break;
          }
          if (used[j]) {
            continue;
          }
          for (int k = j + 1; k < n; k++) {
            if (used[k]) {
              continue;
            }
            if (isNonDegenerate(points[i], points[j], points[k])) {
              happyTriples++;
              used[i] = true;
              used[j] = true;
              used[k] = true;
              break;
            }
          }
        }
      }
      System.out.println(happyTriples);
    }
  }

  private static boolean isNonDegenerate(int[] p1, int[] p2, int[] p3) {
    long area = (long) p1[0] * (p2[1] - p3[1]) +
        (long) p2[0] * (p3[1] - p1[1]) +
        (long) p3[0] * (p1[1] - p2[1]);
    return area != 0;
  }
}

//В этом году главой Флатландии является Егор. Всего во Флатландии проживает n людей, каждый в
//своем доме. i-й дом находится в целочисленной точке (x_і, y_і).
//Егор может выделить некоторые тройки людей. Требуется лишь, чтобы каждый человек относился не более, чем к одной тройке. Тройка людей считается счастливой, если треугольник, образованный их домами, является невырожденным (то есть три дома не находятся на одной прямой).
//Помогите Егору определить, какого максимального количества счастливых троек можно добиться во Флатландии.
//Формат входных данных
//Первая строка содержит число м (3 <= n <= 300) - количество жителей во Флатландии.
//і-я из следующих n строчек содержит числа х_i и у_i: (-1000000000 <= x_і, y_i <= 1000000000) - координаты дома, где проживает i-й человек.
//Гарантируется, что никакие два дома не находятся в одной точке.
//Формат выходных данных
//Выведите одно число - максимальное количество счастливых троек, которого можно добиться во Флатландии. реши задачу на языку java