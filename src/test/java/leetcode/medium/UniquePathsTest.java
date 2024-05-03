package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniquePathsTest {

  private final UniquePaths up = new UniquePaths();

  @Test
  void test1() {
    int res = up.uniquePaths(2, 2);
    Assertions.assertEquals(2, res);
  }

  @Test
  void test2() {
    int res = up.uniquePaths(3, 3);
    Assertions.assertEquals(6, res);
  }

  @Test
  void test3() {
    int res = up.uniquePaths(3, 2);
    Assertions.assertEquals(3, res);
  }

  @Test
  void test4() {
    int res = up.uniquePaths(3, 7);
    Assertions.assertEquals(28, res);
  }

  @Test
  void test5() {
    int res = up.uniquePaths(1, 1);
    Assertions.assertEquals(1, res);
  }

  @Test
  void test6() {
    int res = up.uniquePaths(51, 9);
    Assertions.assertEquals(1916797311, res);
  }
}