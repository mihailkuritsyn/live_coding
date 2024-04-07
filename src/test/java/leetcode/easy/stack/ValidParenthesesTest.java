package leetcode.easy.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {

  private final ValidParentheses vp = new ValidParentheses();

  @Test
  public void test1() {
    assertTrue(vp.isValid("()"));
  }

  @Test
  public void test2() {
    assertTrue(vp.isValid("()[]{}"));
  }

  @Test
  public void test3() {
    assertFalse(vp.isValid("(]"));
  }

  @Test
  public void test4() {
    assertTrue(vp.isValid("(({}))[]{}"));
  }
}
