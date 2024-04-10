package yandex.coderun.easy;

import java.util.Scanner;

public class MiddleNum {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      //      a b c
      //      a c b
      //      b a c
      //      b c a
      //      c a b
      //      c b a
      if (a <= b && b <= c || c <= b && b <= a) {
        System.out.println(b);
      } else if (a <= c && c <= b || b <= c && c <= a) {
        System.out.println(c);
      } else {
        System.out.println(a);
      }
    }
  }

}
