package leetcode.easy.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidAnagram242Test {

  private final ValidAnagram242 target = new ValidAnagram242();

  @Test
  public void test1() {
    assertTrue(target.isAnagram("anagram", "nagaram"));
  }

  @Test
  public void test2() {
    assertFalse(target.isAnagram("rat", "car"));
  }
}