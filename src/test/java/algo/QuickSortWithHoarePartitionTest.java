package algo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class QuickSortWithHoarePartitionTest {

  @Test
  void test1() {
    int[] array = {2, 8, 7, 1, 3, 5, 6, 4};
    int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8};
    QuickSortWithHoarePartition.sort(array);
    assertArrayEquals(sorted, array);
  }

  @Test
  void test2() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8};
    QuickSortWithHoarePartition.sort(array);
    assertArrayEquals(sorted, array);
  }

  @Test
  void test3() {
    int[] array = {8, 7, 6, 5, 4, 3, 2, 1};
    int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8};
    QuickSortWithHoarePartition.sort(array);
    assertArrayEquals(sorted, array);
  }
}