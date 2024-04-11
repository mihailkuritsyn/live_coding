package youtube;

import java.util.HashSet;
import java.util.Set;

public class FindMaxUniqCharsSubString {

  public static void main(String[] args) {
    String source = "abcabcd"; // abcd

    findMax(source);
  }

  public static int findMax(String source) {
    if (source == null || source.length() == 0) {
      return 0;
    }
    if (source.length() == 1) {
      return 1;
    }

    char[] chars = source.toCharArray();
    Set<Character> charSet = new HashSet<>();

    charSet.add(chars[0]);
    int resMax = 1;

    int prevAdded = 0;
    for (int end = 1; end < chars.length; end++) {
      char c = chars[end];

      if (!charSet.contains(c)) {
        charSet.add(c);
        prevAdded = end;
      } else {
        if (prevAdded + 1 == end) {
          charSet = new HashSet<>();
          charSet.add(c);
        }
      }
      resMax = Math.max(resMax, charSet.size());
    }
    return resMax;
  }
//aabcabc
//a
// a
// ab
// abc
//  bca
//   cab
//    abc

}
