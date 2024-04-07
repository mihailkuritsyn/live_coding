package leetcode.easy.bin_search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertPositionTest {

  private final SearchInsertPosition sip = new SearchInsertPosition();

  @Test
  public void test1() {
    int[] nums = new int[]{1, 3, 5, 6};
    int index = sip.searchInsert(nums, 5);
    assertEquals(2, index);
  }

  @Test
  public void test2() {
    int[] nums = new int[]{1, 3, 5};
    int index = sip.searchInsert(nums, 1);
    assertEquals(0, index);
  }

  @Test
  public void test3() {
    int[] nums = new int[]{1, 3, 4, 6};
    int index = sip.searchInsert(nums, 5);
    assertEquals(3, index);
  }

  @Test
  public void test4() {
    int[] nums = new int[]{1, 3, 5, 6};
    int index = sip.searchInsert(nums, 2);
    assertEquals(1, index);
  }

  @Test
  public void test5() {
    int[] nums = new int[]{1, 3, 5, 6};
    int index = sip.searchInsert(nums, 7);
    assertEquals(4, index);
  }
}
