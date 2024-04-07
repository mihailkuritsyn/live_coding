package yandex.contest_base;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinVector {

  public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    int result = 0;
    int currLength = 0;
    int n = Integer.parseInt(r.readLine());
    for (int i = 0; i < n; i++) {
      int nItem = Integer.parseInt(r.readLine());

      if (nItem == 1) {
        currLength++;
      } else {
        result = Math.max(currLength, result);
        currLength = 0;
      }
    }
    result = Math.max(currLength, result);
    System.out.println(result);
  }
}
