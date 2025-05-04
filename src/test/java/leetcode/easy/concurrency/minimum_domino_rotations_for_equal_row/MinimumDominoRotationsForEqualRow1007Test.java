package leetcode.easy.concurrency.minimum_domino_rotations_for_equal_row;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumDominoRotationsForEqualRow1007Test {

  private MinimumDominoRotationsForEqualRow1007 target = new MinimumDominoRotationsForEqualRow1007();

  @Test
  void test1() {
    int[] tops = {2, 1, 2, 4, 2, 2};
    int[] btms = {5, 2, 6, 2, 3, 2};
    int res = target.minDominoRotations(tops, btms);
    Assertions.assertEquals(2, res);
  }

  @Test
  void test2() {
    int[] tops = {3, 5, 1, 2, 3};
    int[] btms = {3, 6, 3, 3, 4};
    int res = target.minDominoRotations(tops, btms);
    Assertions.assertEquals(-1, res);
  }

  @Test
  void test3() {
    int[] tops = {2, 2, 1, 1, 1};
    int[] btms = {2, 1, 2, 2, 2};
    int res = target.minDominoRotations(tops, btms);
    Assertions.assertEquals(1, res);
  }

  @Test
  void test4() {
    int[] tops = {6, 1, 6, 4, 6, 6};
    int[] btms = {5, 6, 2, 6, 3, 6};
    int res = target.minDominoRotations(tops, btms);
    Assertions.assertEquals(2, res);
  }

}