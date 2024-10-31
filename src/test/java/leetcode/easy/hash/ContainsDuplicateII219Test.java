package leetcode.easy.hash;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContainsDuplicateII219Test {

  private final ContainsDuplicateII219 cd = new ContainsDuplicateII219();

  @Test
  public void test1() {
    int[] arr = new int[]{1, 2, 3, 1};
    assertTrue(cd.containsNearbyDuplicate(arr, 3));
  }

  @Test
  public void test2() {
    int[] arr = new int[]{1, 0, 1, 1};
    assertTrue(cd.containsNearbyDuplicate(arr, 1));
  }

  @Test
  public void test3() {
    int[] arr = new int[]{1, 2, 3, 1, 2, 3};
    assertFalse(cd.containsNearbyDuplicate(arr, 2));
  }

  @Test
  public void test4() {
    int[] arr = new int[]{-1, -1};
    assertTrue(cd.containsNearbyDuplicate(arr, 1));
  }

}
