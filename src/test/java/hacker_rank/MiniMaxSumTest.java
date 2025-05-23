package hacker_rank;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class MiniMaxSumTest {

  @Test
  public void test1() {
    MiniMaxSum.miniMaxSum(Arrays.asList(1, 3, 5, 7, 9));
  }

  @Test
  public void test2() {
    MiniMaxSum.miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
  }

}