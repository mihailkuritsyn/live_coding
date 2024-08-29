package leetcode.medium.array;

public class ReverseWordsInAString151 {

  public String reverseWords(String s) {
    char[] chars = s.toCharArray();
    char[] res = new char[chars.length];
    int r = chars.length - 1;
    int l = chars.length - 1;
    boolean prevSpace = true;
    int lastPos = 0;
    int extra = 0;
    for (int i = chars.length - 1; i >= 0; i--) {
      if (chars[i] == ' ') {
        if (prevSpace) {
          r--;
          l--;
          extra++;
        } else {
          int length = r - l;
          System.arraycopy(chars, l + 1, res, lastPos, length);
          res[lastPos + length] = ' ';
          lastPos += length + 1;
          l--;
          r = l;
          prevSpace = true;
        }
      } else {
        prevSpace = false;
        l--;
      }
    }
    if (!prevSpace) {
      int length = r - l;
      System.arraycopy(chars, l + 1, res, lastPos, length);
      extra--;
    }
    char[] copy = new char[chars.length - extra - 1];
    System.arraycopy(res, 0, copy, 0, copy.length);
    return new String(copy);
  }
}
