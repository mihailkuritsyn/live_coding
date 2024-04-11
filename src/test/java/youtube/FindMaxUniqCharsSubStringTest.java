package youtube;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaxUniqCharsSubStringTest {

  @Test
  public void test1() {
    int max = FindMaxUniqCharsSubString.findMax("aaa");

    assertEquals(1, max);
  }

  @Test
  public void test2() {
    //aabcabc
//a
// a
// ab
// abc
//  bca
//   cab
//    abc
    int max = FindMaxUniqCharsSubString.findMax("aabcabc");

    assertEquals(3, max);
  }

  @Test
  public void test3() {
    //aabbcc
    //a
    // a
    // ab
    //   b
    //   bc
    //     c

    int max = FindMaxUniqCharsSubString.findMax("aabbcc");

    assertEquals(2, max);
  }

  @Test
  public void test4() {
    int max = FindMaxUniqCharsSubString.findMax("abca");

    assertEquals(3, max);
  }

  @Test
  public void test5() {
    int max = FindMaxUniqCharsSubString.findMax("aabc");

    assertEquals(3, max);
  }

  @Test
  public void test6() {
    int max = FindMaxUniqCharsSubString.findMax("abcabcd");

    assertEquals(4, max);
  }
}
