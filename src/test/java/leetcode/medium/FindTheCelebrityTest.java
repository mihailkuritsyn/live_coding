package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTheCelebrityTest {

  private final FindTheCelebrity fc = new FindTheCelebrity();

  @Test
  void test1() {
    int[][] m = {
        {0, 1, 0},
        {0, 0, 0},
        {0, 1, 0}
    };
    int celebrity = fc.celebrity(m, m.length);
    Assertions.assertEquals(1, celebrity);
  }

  @Test
  void test2() {
    int[][] m = {
        {0, 1},
        {1, 0},
    };
    int celebrity = fc.celebrity(m, m.length);
    Assertions.assertEquals(-1, celebrity);
  }

  @Test
  void test3() {
    int[][] m = {
        {0, 0},
        {1, 0},
    };
    int celebrity = fc.celebrity(m, m.length);
    Assertions.assertEquals(0, celebrity);
  }

  @Test
  void test4() {
    int[][] m = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0},
    };
    int celebrity = fc.celebrity(m, m.length);
    Assertions.assertEquals(-1, celebrity);
  }

  @Test
  void test5() {
    int[][] m = {
        {0, 0, 1},
        {0, 0, 0},
        {0, 0, 0},
    };
    int celebrity = fc.celebrity(m, m.length);
    Assertions.assertEquals(-1, celebrity);
  }

  @Test
  void test6() {
    int[][] m = {
        {0, 0, 1, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 0, 0, 0, 0}
    };
    int celebrity = fc.celebrity(m, m.length);
    Assertions.assertEquals(4, celebrity);
  }

  @Test
  void test7() {
    int[][] m = {
        {0, 1, 0},
        {1, 0, 0},
        {0, 1, 0},
    };
    int celebrity = fc.celebrity(m, m.length);
    Assertions.assertEquals(-1, celebrity);
  }
}