package leetcode.easy.two_pointers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArray26Test {

  private final RemoveDuplicatesFromSortedArray26 target = new RemoveDuplicatesFromSortedArray26();

  @Test
  public void test1() {
    assertEquals(2, target.removeDuplicates(new int[]{1, 1, 2}));
  }

  @Test
  public void test2() {
    assertEquals(5, target.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
  }

  @Test
  public void test3() {
    assertEquals(2, target.removeDuplicates(new int[]{1, 1, 1, 2}));
  }


  @Test
  public void test4() {
    assertEquals(5, target.removeDuplicates(new int[]{1, 2, 3, 4, 4, 5}));
  }

  @Test
  public void test5() {
    assertEquals(1, target.removeDuplicates(new int[]{1, 1, 1}));
  }
}