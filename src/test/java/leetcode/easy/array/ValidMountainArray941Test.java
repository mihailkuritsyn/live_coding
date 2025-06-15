package leetcode.easy.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidMountainArray941Test {

  private ValidMountainArray941 target = new ValidMountainArray941();

  @Test
  public void test1() {
    assertTrue(target.validMountainArray(new int[]{0, 2, 3, 4, 5, 2, 1, 0}));
  }

  @Test
  public void test2() {
    assertFalse(target.validMountainArray(new int[]{0, 2, 3, 3, 5, 2, 1, 0}));
  }

  @Test
  public void test3() {
    assertFalse(target.validMountainArray(new int[]{2, 1}));
  }

  @Test
  public void test4() {
    assertFalse(target.validMountainArray(new int[]{3, 5, 5}));
  }

  @Test
  public void test5() {
    assertTrue(target.validMountainArray(new int[]{0, 3, 2, 1}));
  }

  @Test
  public void test6() {
    assertFalse(target.validMountainArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
  }
}