package leetcode.medium.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Triangle120Test {

  Triangle120 target = new Triangle120();

  @Test
  void test1() {
//     [[2],[3,4],[6,5,7],[4,1,8,3]]
//     [[2],       00
//     [3,4],      10 11
//     [6,5,7],    20 21 22
//     [4,1,8,3]]

    List<List<Integer>> triangle = new ArrayList<>();
    triangle.add(Arrays.asList(2));
    triangle.add(Arrays.asList(3, 4));
    triangle.add(Arrays.asList(6, 5, 7));
    triangle.add(Arrays.asList(4, 1, 8, 3));
    assertEquals(11, target.minimumTotal(triangle));
  }

  @Test
  void test2() {
    List<List<Integer>> triangle = new ArrayList<>();
    triangle.add(Arrays.asList(-11));
    assertEquals(-11, target.minimumTotal(triangle));
  }
}