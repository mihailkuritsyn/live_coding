package leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {

  private static final char I = 'I';
  private static final char V = 'V';
  private static final char X = 'X';
  private static final char L = 'L';
  private static final char C = 'C';
  private static final char D = 'D';
  private static final char M = 'M';

  private static Map<Character, Integer> romanToInt = new HashMap<>() {
    {
      put(I, 1);
      put(V, 5);
      put(X, 10);
      put(L, 50);
      put(C, 100);
      put(D, 500);
      put(M, 1000);
    }
  };

  public int romanToInt(String s) {
    if (!s.matches("[IVXLCDM]{1,15}")) {
      throw new RuntimeException("invalid input");
    }
    int result = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      char currChar = s.charAt(i);
      result += romanToInt.get(currChar);

      int prevIndex = i - 1;
      if (prevIndex >= 0) {
        char prevChar = s.charAt(prevIndex);
        if ((currChar == V || currChar == X) && prevChar == I ||
            (currChar == L || currChar == C) && prevChar == X ||
            (currChar == D || currChar == M) && prevChar == C) {
          result -= romanToInt.get(prevChar);
          i--;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    RomanToInteger13 rti = new RomanToInteger13();

    //  Input: s = "III"
    //  Output: 3
    //  Explanation: III = 3.
    int res1 = rti.romanToInt("III");
    System.out.println(res1);

    //    Example 2:
    //    Input: s = "LVIII"
    //    Output: 58
    //    Explanation: L = 50, V= 5, III = 3.
    int res2 = rti.romanToInt("LVIII");
    System.out.println(res2);

    //    Input: s = "MCMXCIV"
    //    Output: 1994
    //    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
    int res3 = rti.romanToInt("MCMXCIV");
    System.out.println(res3);

    //    Input: s = "IV"
    int res4 = rti.romanToInt("IV");
    System.out.println(res4);
  }
}
