package leetcode.medium.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelf238Test {

  private ProductOfArrayExceptSelf238 target = new ProductOfArrayExceptSelf238();

  @Test
  void test1() {
//    1, 2, 3, 4
//    1  1  2  6
//    1  1  2  6 p=1 res=1*6=6 p=1*4=4
//    1  1  8  6 res=2*p=8 p=4*3=12
//    1  12 8  6 res=1*12=12 p=12*2
//    1  12 8  6 res=1*24=24
    assertArrayEquals(new int[]{24, 12, 8, 6},
        target.productExceptSelf(new int[]{1, 2, 3, 4}));
  }

  @Test
  void test2() {
    assertArrayEquals(new int[]{6, 4, 6},
        target.productExceptSelf(new int[]{2, 3, 2}));
  }

  @Test
  void test3() {
    assertArrayEquals(new int[]{0, 0, 9, 0, 0},
        target.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
  }

  @Test
  void test4() {
    assertArrayEquals(new int[]{1, 0},
        target.productExceptSelf(new int[]{0, 1}));
  }
}