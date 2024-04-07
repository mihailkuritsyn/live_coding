package yandex.contest_base;

import java.io.IOException;
import java.util.Scanner;

public class BraceCombination3 {

  public static void main(String[] args) throws IOException {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      run(n*2);
    }
  }

  private static void writeLine(char[] IntToFile) throws IOException {
    for (char bracket : IntToFile) {
      System.out.print(bracket);
    }
    System.out.println();
  }

  private static void run(int n) throws IOException {
    if (n < 2) {
      return;
    }
    char[] chrs = new char[n];
    for (int i = 0; i < n / 2; i++) {
      chrs[i] = '(';
    }
    for (int i = n / 2; i < n; i++) {
      chrs[i] = ')';
    }
    writeLine(chrs);
    do {
      int i = n - 1;
      int c = 0;
      while (i >= 0) {
        c += chrs[i] == ')' ? -1 : 1;
        if ((c < 0) && (chrs[i] == '(')) {
          break;
        }
        --i;
      }
      if (i < 0) {
        break;
      }

      chrs[i++] = ')';
      int ind = i;
      for (; i < n; i++) {
        chrs[i] = (i <= (n - ind + c) / 2 + ind) ? '(' : ')';
      }
      writeLine(chrs);
    } while (true);
  }

}
