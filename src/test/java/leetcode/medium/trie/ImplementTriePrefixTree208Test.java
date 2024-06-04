package leetcode.medium.trie;

import leetcode.medium.trie.ImplementTriePrefixTree208.Trie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplementTriePrefixTree208Test {

  @Test
  public void test1() {
    Trie trie = new Trie();
    trie.insert("apple");
    Assertions.assertTrue(trie.search("apple"));
    Assertions.assertFalse(trie.search("app"));
    Assertions.assertTrue(trie.startsWith("app"));

    trie.insert("app");
    Assertions.assertTrue(trie.search("app"));
  }
}