package yandex.contest_base;

import java.util.Scanner;

public class BraceCombination {

  private static final char CLOSED_PARENTHESES = ')';
  private static final char OPEN_PARENTHESES = '(';

  private static void genSeq(String currentSeq, int openCount, int remainingCount) {
    if (remainingCount == 0) {
      System.out.println(currentSeq);
    } else if (remainingCount == openCount) {
      genSeq(currentSeq + CLOSED_PARENTHESES, openCount - 1, remainingCount - 1);
    } else if (openCount == 0) {
      genSeq(currentSeq + OPEN_PARENTHESES, openCount + 1, remainingCount - 1);
    } else {
      genSeq(currentSeq + OPEN_PARENTHESES, openCount + 1, remainingCount - 1);
      genSeq(currentSeq + CLOSED_PARENTHESES, openCount - 1, remainingCount - 1);
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      genSeq("", 0, n * 2);
    }
  }

}
