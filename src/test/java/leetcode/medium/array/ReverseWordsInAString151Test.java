package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseWordsInAString151Test {

  private ReverseWordsInAString151 target = new ReverseWordsInAString151();

  @Test
  void test1() {
    assertEquals("blue is sky the", target.reverseWords("the sky is blue"));
//    the sky  is blue
//               l   r
//              lr
//       l  r    r
  }

  @Test
  void test2() {
    assertEquals("world hello", target.reverseWords("  hello world  "));
//    "  hello world  "
//                   l
//            l    r
//       l   r
  }

  @Test
  void test3() {
    assertEquals("hi", target.reverseWords(" hi "));
//    " hi "
//     0123
//     l r
//     0 2  length=2-0=2
//    "hi"
  }
}