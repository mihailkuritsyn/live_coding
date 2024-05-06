package leetcode.medium;

public class ZigzagConversion6 {

  public String convert(String s, int numRows) {
    if (s == null || s.length() == 0 || s.length() == 1 || numRows == 1) {
      return s;
    }

    char[] chars = s.toCharArray();

    int orderLength = numRows + numRows - 2;
    int[] order = new int[orderLength];
    for (int i = 0; i < numRows; i++) {
      order[i] = i;
    }
    int decr = 2;
    for (int i = numRows; i < orderLength; i++, decr++) {
      order[i] = numRows - decr;
    }

    StringBuilder[] sbArr = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
      sbArr[i] = new StringBuilder();
    }
    for (int i = 0; i < chars.length; i++) {
      int sbInd = order[i % orderLength];
      sbArr[sbInd].append(chars[i]);
    }

    for (int i = 1; i < numRows; i++) {
      sbArr[0].append(sbArr[i]);
    }
    return sbArr[0].toString();
  }
}
