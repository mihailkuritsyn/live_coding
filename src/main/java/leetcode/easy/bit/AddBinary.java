package leetcode.easy.bit;

public class AddBinary {

  public String addBinary(String a, String b) {
    char[] ach = a.toCharArray();
    char[] bch = b.toCharArray();

    int i = ach.length - 1;
    int j = bch.length - 1;
    boolean carry = false;
    int counter = Math.max(i, j);

    char[] res = new char[counter + 1];
    while (counter >= 0) {
      char achCur = i >= 0 ? ach[i--] : '0';
      char bchCur = j >= 0 ? bch[j--] : '0';
      if (achCur == '0' && bchCur == '0') {
        res[counter] = carry ? '1' : '0';
        carry = false;
      } else if ((achCur == '1' && bchCur == '0') || (achCur == '0' && bchCur == '1')) {
        res[counter] = carry ? '0' : '1';
      } else {
        res[counter] = carry ? '1' : '0';
        carry = true;
      }
      counter--;
    }

    return carry ? "1" + new String(res) : new String(res);
  }
}
