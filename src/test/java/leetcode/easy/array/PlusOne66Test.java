package leetcode.easy.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PlusOne66Test {

  private final PlusOne66 target = new PlusOne66();

  @Test
  public void test1() {
    assertArrayEquals(new int[]{1, 2, 4}, target.plusOne(new int[]{1, 2, 3}));
  }

  @Test
  public void test2() {
    assertArrayEquals(new int[]{4, 3, 2, 2}, target.plusOne(new int[]{4, 3, 2, 1}));
  }

  @Test
  public void test3() {
    assertArrayEquals(new int[]{1, 0}, target.plusOne(new int[]{9}));
  }

  @Test
  public void test4() {
    assertArrayEquals(new int[]{1, 0, 0, 0, 0}, target.plusOne(new int[]{9, 9, 9, 9}));
  }

}