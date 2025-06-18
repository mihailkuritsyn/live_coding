package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MergeIntervals56Test {

  private final MergeIntervals56 target = new MergeIntervals56();

  @Test
  public void test1() {
    int[][] intervals = {{1, 3}, {2, 6}, {15, 18}, {8, 10}};
    int[][] merged = {{1, 6}, {8, 10}, {15, 18}};
    assertArrayEquals(merged, target.merge(intervals));
  }

  @Test
  public void test2() {
    int[][] intervals = {{1, 4}, {4, 5}};
    int[][] merged = {{1, 5}};
    assertArrayEquals(merged, target.merge(intervals));
  }

  @Test
  public void test3() {
    int[][] intervals = {{1, 9}, {2, 3}, {4, 5}};
    int[][] merged = {{1, 9}};
    assertArrayEquals(merged, target.merge(intervals));
  }

}