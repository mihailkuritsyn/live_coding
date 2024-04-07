package yandex.contest_base;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String s1 = scanner.next();
      String s2 = scanner.next();

      int res = isAnagram(s1, s2);

      System.out.println(res);
    }
  }

  private static int isAnagram(String s1, String s2) {
    if (s1 == null && s2 == null || s1.isEmpty() && s2.isEmpty()) {
      return 1;
    }
    if (s1.length() != s2.length()) {
      return 0;
    }
    int[] countLetter1 = new int[26];
    for (char c : s1.toCharArray()) {
      int i = c - 'a';
      countLetter1[i]++;
    }

    int[] countLetter2 = new int[26];
    for (char c : s2.toCharArray()) {
      int i = c - 'a';
      countLetter2[i]++;
    }
    return Arrays.equals(countLetter1, countLetter2) ? 1 : 0;
  }

}
