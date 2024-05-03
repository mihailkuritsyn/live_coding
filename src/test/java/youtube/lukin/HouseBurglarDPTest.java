package youtube.lukin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseBurglarDPTest {

  private final HouseBurglarDP target = new HouseBurglarDP();

  @Test
  void test1() {
    Assertions.assertEquals(4, target.cashAmount(new int[]{1, 2, 3, 1}));
  }

  @Test
  void test2() {
    Assertions.assertEquals(11, target.cashAmount(new int[]{5, 2, 4, 6}));
  }

  @Test
  void test3() {
    Assertions.assertEquals(17, target.cashAmount(new int[]{2, 7, 9, 3, 1, 6}));
  }

  @Test
  void test4() {
    Assertions.assertEquals(3, target.cashAmount(new int[]{3, 2}));
  }
}