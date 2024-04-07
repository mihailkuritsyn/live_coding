package yandex.contest_base;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteDuplicates {

  public static void main(String[] args) throws Exception {
    try (InputStreamReader in = new InputStreamReader(
        System.in); BufferedReader r = new BufferedReader(in)) {
      int n = Integer.parseInt(r.readLine());
      if (n < 1) {
        return;
      }
      int prevNum = Integer.parseInt(r.readLine());
      for (int i = 1; i < n; i++) {
        int num = Integer.parseInt(r.readLine());

        if (num != prevNum) {
          System.out.println(prevNum);
          prevNum = num;
        }
      }
      System.out.println(prevNum);
    }
  }
}
