package youtube;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class MergeSetsTest {

  private final MergeSets mergeSets = new MergeSets();

  @Test
  public void test1() throws Exception {
    int[][] sets = {{1, 2}, {2, 3}}; // intersect {1, 3}
    List<int[]> res = MergeSets.doMerge(sets);

    List<int[]> expected = List.of(new int[]{1, 3});

    assertTrue(listsEquals(res, expected));
  }

  @Test
  public void test2() throws Exception {
    int[][] sets = {{1, 2}, {1, 1}}; // 1 contains 2  {1, 2}
    List<int[]> res = MergeSets.doMerge(sets);

    List<int[]> expected = List.of(new int[]{1, 2});

    assertTrue(listsEquals(res, expected));
  }

  @Test
  public void test3() throws Exception {
    int[][] sets = {{1, 1}, {1, 2}}; // 2 contains 1  {1, 2}
    List<int[]> res = MergeSets.doMerge(sets);

    List<int[]> expected = List.of(new int[]{1, 2});

    assertTrue(listsEquals(res, expected));
  }

  @Test
  public void test4() throws Exception {
    int[][] sets = {{1, 2}, {2, 3}, {3, 4}}; // intersect all
    List<int[]> res = MergeSets.doMerge(sets);

    List<int[]> expected = List.of(new int[]{1, 4});

    assertTrue(listsEquals(res, expected));
  }

  @Test
  public void test5() throws Exception {
    int[][] sets = {{1, 2}, {3, 4}, {5, 6}}; // all not intersect {1, 3}
    List<int[]> res = MergeSets.doMerge(sets);

    List<int[]> expected = List.of(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});

    assertTrue(listsEquals(res, expected));
  }

  public static boolean listsEquals(List<int[]> actual, List<int[]> expected) {
    // Check if the two lists are equal
    boolean isEqual = true;
    if (actual.size() != expected.size()) {
      isEqual = false;
    } else {
      for (int i = 0; i < actual.size(); i++) {
        if (!Arrays.equals(actual.get(i), expected.get(i))) {
          isEqual = false;
          break;
        }
      }
    }
    return isEqual;
  }


}
