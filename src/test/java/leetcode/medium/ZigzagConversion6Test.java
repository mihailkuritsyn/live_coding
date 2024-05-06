package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZigzagConversion6Test {

  private final ZigzagConversion6 target = new ZigzagConversion6();

  @Test
  void test1() {
    //    PAYPALISHIRING

//    P   A   H   N
//    A P L S I I G
//    Y   I   R

//    PAHNAPLSIIGYIR
//    PAHN APLSIIG YIR

//    p-0-0
//    a-1-1
//    y-2-2
//    p-3-1
//    a-4-0
//    l-5-1
//    i-6-2
//    s-7-1
//    h-8-0
//    0-1-2-1
    Assertions.assertEquals("PAHNAPLSIIGYIR",
        target.convert("PAYPALISHIRING", 3));
  }

  @Test
  void test2() {
    //    PAYPALISHIRING

//    P     I    N
//    A   L S  I G
//    Y A   H R
//    P     I

//    PINALSIGYAHRPI
//    PIN ALSIG YAHR PI

//    p-0--0
//    a-1--1
//    y-2--2
//    p-3--3
//    a-4--2
//    l-5--1

//    i-6--0
//    s-7--1
//    h-8--2
//    i-9--3
//    r-10-2
//    i-11-1
//    n-12-0
//    g-13-1
//    0-1-2-3-2-1
    Assertions.assertEquals("PINALSIGYAHRPI",
        target.convert("PAYPALISHIRING", 4));
  }

  @Test
  void test3() {
    //    PAYPALISHIRING

//    P       H
//    A     S I
//    Y   I   R
//    P L     I G
//    A       N

//    PINALSIGYAHRPI
//    PHASIYIRPLIGAN
//    PH ASI YIR PLIG AN

//    p-0--0
//    a-1--1
//    y-2--2
//    p-3--3
//    a-4--4

//    l-5--3
//    i-6--2
//    s-7--1

//    h-8--0
//    i-9--1
//    r-10-2
//    i-11-3
//    n-12-4
//    g-13-1

//    0-1-2-3-4-3-2-1
//    0-1-2-3-4-5-4-3-2-1
    Assertions.assertEquals("PHASIYIRPLIGAN",
        target.convert("PAYPALISHIRING", 5));
  }

  @Test
  void test4() {
    Assertions.assertEquals("A", target.convert("A", 1));
  }
}