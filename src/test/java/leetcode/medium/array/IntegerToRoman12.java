package leetcode.medium.array;

//Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:
//
//If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
//If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
//Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
//Given an integer, convert it to a Roman numeral.
public class IntegerToRoman12 {

  public String intToRoman(int num) {
    int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    StringBuilder sb = new StringBuilder();
    for (int i = values.length - 1; i >= 0; i--) {
      while (num >= values[i]) {
        sb.append(roman[i]);
        num -= values[i];
      }
    }
    return sb.toString();
  }

//  private static final String I = "I";
//  private static final String V = "V";
//  private static final String X = "X";
//  private static final String L = "L";
//  private static final String C = "C";
//  private static final String D = "D";
//  private static final String M = "M";
//  private static final String IV = "IV";
//  private static final String IX = "IX";
//  private static final String XL = "XL";
//  private static final String XC = "XC";
//  private static final String CD = "CD";
//  private static final String CM = "CM";
//  private static Map<Integer, String> intToRoman = new HashMap<>() {
//    {
//      put(1, I);
//      put(5, V);
//      put(10, X);
//      put(50, L);
//      put(100, C);
//      put(500, D);
//      put(1000, M);
//      put(4, IV);
//      put(9, IX);
//      put(40, XL);
//      put(90, XC);
//      put(400, CD);
//      put(900, CM);
//    }
//  };
//
//  public String intToRoman(int num) {
//    StringBuilder sb = new StringBuilder();
//    int div = 1000;
//    String base;
//    while (div > 0 && num > 0) {
//      int digit = num / div;
//      if (digit == 0) {
//        div = div / 10;
//        continue;
//      }
//
//      num = num % div;
//      if (digit <= 3) {
//        base = intToRoman.get(div);
//        for (int i = 0; i < digit; i++) {
//          sb.append(base);
//        }
//      } else if (digit == 4 || digit == 9 || digit == 5 || digit == 10) {
//        sb.append(intToRoman.get(digit * div));
//      } else if (digit >= 6 && digit <= 9) {
//        sb.append(intToRoman.get(div * 10 / 2));
//        base = intToRoman.get(div);
//        for (int i = 0; i < digit - 5; i++) {
//          sb.append(base);
//        }
//      }
//      div = div / 10;
//    }
//    return sb.toString();
//  }
}
