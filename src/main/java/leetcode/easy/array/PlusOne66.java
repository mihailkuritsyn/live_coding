package leetcode.easy.array;

public class PlusOne66 {

  public int[] plusOne(int[] digits) {
    if (digits[digits.length - 1] != 9) {
      digits[digits.length - 1] += 1;
      return digits;
    }
    digits[digits.length - 1] = 0;
    boolean buff = true;
    for (int i = digits.length - 2; i >= 0; i--) {
      if (buff) {
        if (digits[i] == 9) {
          digits[i] = 0;
        } else {
          digits[i] += 1;
          buff = false;
        }
      }
    }
    if (buff) {
      int[] res = new int[digits.length + 1];
      // default int value == 0 so, no need to arrayCopy
      res[0] = 1;
      return res;
    }
    return digits;
  }

//  public int[] plusOne(int[] digits) {
//    int len = digits.length;
//
//    for (int i = len - 1; i >= 0; i--) {
//      if (digits[i] < 9) {
//        digits[i] += 1;
//        return digits;
//      } else {
//        digits[i] = 0;
//      }
//    }
//    int[] ans = new int[len + 1]; // default int value == 0
//    ans[0] = 1;
//    return ans;
//  }
}
