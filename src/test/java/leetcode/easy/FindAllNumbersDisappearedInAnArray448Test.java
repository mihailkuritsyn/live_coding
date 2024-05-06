package leetcode.easy;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindAllNumbersDisappearedInAnArray448Test {

  FindAllNumbersDisappearedInAnArray448 target = new FindAllNumbersDisappearedInAnArray448();

  @Test
  void test1() {
    List<Integer> res = target.findDisappearedNumbers(
        new int[]{4, 3, 2, 7, 8, 2, 3, 1});

    Assertions.assertArrayEquals(new Integer[]{5, 6}, res.toArray());
  }

  @Test
  void test2() {
    List<Integer> res = target.findDisappearedNumbers(
        new int[]{1, 1});

    Assertions.assertArrayEquals(new Integer[]{2}, res.toArray());
  }
}