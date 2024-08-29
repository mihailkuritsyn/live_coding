package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntegerToRoman12Test {

  private IntegerToRoman12 t = new IntegerToRoman12();

  //4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
  //    1 - I;2 - II;3 - III;
//    4 - IV;9 - IX;
//    5 - V;10 - X
//    6 - VI;7 - VII;8 - VIII;

  @Test
  void test1() {
    assertEquals("MMMDCCXLIX", t.intToRoman(3749));
//    MMMDCCXLIX
//    num=3749
//    div=1000
//    digit/=div num%=div
//    1<=digit<=3
//    map.get(1000) - M
//    for i=0 i<3 sb.append("M")
//    div/=10
//    digit=7
  }

  @Test
  void test2() {
    assertEquals("CD", t.intToRoman(400));
  }

  @Test
  void test3() {
    assertEquals("DCC", t.intToRoman(700));
  }

  @Test
  void test4() {
    assertEquals("LX", t.intToRoman(60));
  }

  @Test
  void test5() {
    assertEquals("LVIII", t.intToRoman(58));
  }
  @Test
  void test6() {
    assertEquals("MCMXCIV", t.intToRoman(1994));
  }
}