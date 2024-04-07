package yandex.contest_base;

import java.util.Scanner;

public class BraceCombination2 {

  public static void gen(int n, char[] curSeq, int toCloseCount, int curIndex) {
    if (curIndex == 2 * n) {
      for (char bracket : curSeq) {
        System.out.print(bracket);
      }
      System.out.println();
    } else {
      if (toCloseCount == 2 * n - curIndex) {
        // если количество оставшихся позиций в точности равно
        // количеству скобок, которые надо закрыть, то новые скобки мы не можем открывать
        curSeq[curIndex] = ')';
        toCloseCount--;
        gen(n, curSeq, toCloseCount, curIndex + 1);
      } else {
        // пробуем поставить обе скобки, сначала ставим ту,
        // которая лексикографически меньше
        curSeq[curIndex] = '(';
        toCloseCount++;
        gen(n, curSeq, toCloseCount, curIndex + 1);

        if (toCloseCount > 1) {
          curSeq[curIndex] = ')';
          toCloseCount -= 2;
          gen(n, curSeq, toCloseCount, curIndex + 1);
        }
      }
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      char[] curSeq = new char[2 * n];
      gen(n, curSeq, 0, 0);
    }
  }

}