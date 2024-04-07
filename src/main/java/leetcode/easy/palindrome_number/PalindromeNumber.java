package leetcode.easy.palindrome_number;

public class PalindromeNumber {

  public static void main(String[] args) {
    PalindromeNumber pn = new PalindromeNumber();
//    System.out.println(pn.isPalindrome(0));
//    System.out.println(pn.isPalindrome(222222));
    System.out.println(pn.isPalindrome(1000001));
//    System.out.println(pn.isPalindrome(12345));
  }

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    } else if (x < 10) {
      return true;
    } else {
      int x1 = x;
      int toRemove, reversed = 0;
      while (x1 > 0) {
        toRemove = x1 % 10;
        reversed = toRemove + reversed * 10;
        x1 = x1 / 10;
      }
      return x == reversed;
    }
  }

  public boolean isPalindromeBadPerf(int x) {
    if (x < 0) {
      return false;
    }
    if (x < 10) {
      return true;
    }
    int countDigits = countDigits(x);

    while (countDigits > 0) {
      if (x < 10 && countDigits == 1) {
        return true;
      }
      int powLeft = (int) Math.pow(10, --countDigits);
      int left = x / powLeft;

      x -= left * powLeft;

      int right = x % 10;

      if (left != right) {
        return false;
      }

      x /= 10;
      countDigits--;
    }
    return true;
  }

  private int countDigits(int number) {
    if (number < 100000) {
      if (number < 100) {
        if (number < 10) {
          return 1;
        } else {
          return 2;
        }
      } else {
        if (number < 1000) {
          return 3;
        } else {
          if (number < 10000) {
            return 4;
          } else {
            return 5;
          }
        }
      }
    } else {
      if (number < 10000000) {
        if (number < 1000000) {
          return 6;
        } else {
          return 7;
        }
      } else {
        if (number < 100000000) {
          return 8;
        } else {
          if (number < 1000000000) {
            return 9;
          } else {
            return 10;
          }
        }
      }
    }
  }


}
