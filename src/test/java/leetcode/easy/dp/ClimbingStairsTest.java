package leetcode.easy.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbingStairsTest {

  private ClimbingStairs cs = new ClimbingStairs();

  @Test
  public void testTwoStepStairs() {
    // 1 1
    // 2

    // 1 + 1
    int stepsCount = cs.climbStairs(2);
    assertEquals(2, stepsCount);
  }

  @Test
  public void testThreeStepStairs() {
    // 1 1 1
    // 1 2
    // 2 1

    // 1 + 2
    int stepsCount = cs.climbStairs(3);
    assertEquals(3, stepsCount);
  }

  @Test
  public void testFourStepStairs() {
    // 1 1 1 1
    // 1 2 1
    // 1 1 2
    // 2 1 1
    // 2 2

    //3 + 2
    int stepsCount = cs.climbStairs(4);
    assertEquals(5, stepsCount);
  }

  @Test
  public void testFiveStepStairs() {
    // 1 1 1 1 1
    // 1 2 1 1
    // 1 1 2 1
    // 1 1 1 2
    // 1 2 2
    // 2 1 1 1
    // 2 1 2
    // 2 2 1

    // 1 + 4 + 3
    // 5 + 3
    int stepsCount = cs.climbStairs(5);
    assertEquals(8, stepsCount);
  }

  @Test
  public void testSixStepStairs() {
    // 1 1 1 1 1 1
    // 2 1 1 1 1
    // 1 2 1 1 1
    // 1 1 2 1 1
    // 1 1 1 2 1
    // 1 1 1 1 2
    // 2 2 1 1
    // 2 1 2 1
    // 2 1 1 2
    // 1 2 2 1
    // 1 1 2 2
    // 2 2 2

    //1 + 5 + 5 + 1
    //8 + 5
    int stepsCount = cs.climbStairs(6);
    assertEquals(13, stepsCount);
  }

  @Test
  public void test7StepStairs() {
    int stepsCount = cs.climbStairs(7);
    // 13 + 8
    assertEquals(21, stepsCount);
  }

  @Test
  public void test45StepStairs() {
    int stepsCount = cs.climbStairs(45);
    assertEquals(1836311903, stepsCount);
  }
}
