package leetcode.easy.bit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddBinaryTest {

  private final AddBinary addBinary = new AddBinary();

  @Test
  public void test1() {
    String s = addBinary.addBinary("11", "1");
    assertEquals("100", s);
  }

  @Test
  public void test2() {
    String s = addBinary.addBinary("1010", "1011");
    assertEquals("10101", s);
  }
}
