package tinkoff.ira;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
      }

      int lowerBound = a[0];
      int upperBound = a[1];

      int goodDays = 0;
      int[] adjustments = new int[n];
      for (int i = 2; i < n; i++) {
        if (a[i] >= lowerBound && a[i] <= upperBound) {
          goodDays++;
        } else {
          if (a[i] < lowerBound) {
            adjustments[i] = lowerBound - a[i];
          } else if (a[i] > upperBound) {
            adjustments[i] = a[i] - upperBound;
          }
        }
      }

      if (goodDays >= m) {
        System.out.println(0);
        return;
      }

      Arrays.sort(adjustments);
      int corrections = 0;
      for (int i = 0; i < n && goodDays < m; i++) {
        if (adjustments[i] > 0) {
          corrections += adjustments[i];
          goodDays++;
        }
      }
      System.out.println(corrections);
    }
  }
}

//Чтобы набрать форму к лету, Виктория решила бегать каждый день. До лета осталось всего n дней именно на протяжении этого срока она и будет бегать. Ее личный тренер уже составил ей
//расписание: в i-й день Виктория должна пробежать а_і километров.
//Виктория считает і-й (3 <= і <= n) день хорошим, если в этот день она пробежит не меньше, чем в
//первый день, и не больше, чем во второй день. Расписание же ей понравится, если хотя бы m дней будут хорошими. В расписании можно делать корректировки: произвольное а_i (1 <= i <= n) можно увеличить или уменьшить на 1 километр. Разрешается корректировать один и тот же день несколько раз.
//Какое минимальное число корректировок необходимо внести в расписание, чтобы оно понравилось Виктории?
//Формат входных данных
//Первая строка содержит числа п (3 <= n <= 200000) и m (1 <= m <= n-2) - количество дней до лета и количество хороших дней, которое необходимо Виктории, чтобы ей понравилось расписание.
//Следующая строка содержит числа а_1, a_2, ... a_n (1 <= a_i < 1000000000), где а_i - количество километров, которое должна пробежать Виктория согласно начальному расписанию.
//Формат выходных данных
//Выведите одно число - минимальное количество корректировок, которое необходимо внести в расписание, чтобы оно понравилось Виктории. Напиши решение на языке Java
