package yandex.contest_new;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cnk {

  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String s = bufferedReader.readLine();
      bufferedReader.close();
      String[] s2 = s.split(" ");
      int n = Integer.parseInt(s2[0]);
      int k = Integer.parseInt(s2[1]);
      int c = fact(n) / (fact(k) * fact(n - k));
      System.out.println(c);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static int fact(int f) {
    int result = 1;
    for (int i = 1; i <= f; i++) {
      result = result * i;
    }
    return result;
  }
}

//
//public static void main(String[] args) {
//  try (Scanner scanner = new Scanner(System.in)) {
//    int n = scanner.nextInt();
//    int k = scanner.nextInt();
//
//    int c = fact(n) / (fact(k) * fact(n - k));
//    System.out.println(c);
//  }
//}