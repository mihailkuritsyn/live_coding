package leetcode.medium.maximal_square;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximalSquare221Test {

  private final MaximalSquare221 target = new MaximalSquare221();

  @Test
  void test1() {
    char[][] m = new char[][]{
        {'1', '1', '1'},
        {'1', '1', '1'},
        {'1', '1', '1'}};
    Assertions.assertEquals(9, target.maximalSquare(m));
  }

  @Test
  void test2() {
    char[][] m = new char[][]{
        {'0', '1'},
        {'1', '0'}};
    Assertions.assertEquals(1, target.maximalSquare(m));
  }

  @Test
  void test3() {
    char[][] m = new char[][]{
        {'1', '1'},
        {'1', '1'}};
    Assertions.assertEquals(4, target.maximalSquare(m));
  }

  @Test
  void test4() {
    char[][] m = new char[][]{
        {'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'}};
    Assertions.assertEquals(4, target.maximalSquare(m));
  }

}