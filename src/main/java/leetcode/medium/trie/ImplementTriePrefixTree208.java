package leetcode.medium.trie;

public class ImplementTriePrefixTree208 {
//A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
//
//Implement the Trie class:
//
//Trie() Initializes the trie object.
//void insert(String word) Inserts the string word into the trie.
//boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
//boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.

  static class Trie {

    class Node {

      boolean isWord;
      Node[] children = new Node[26];
    }

    private Node root = new Node();

    public Trie() {
    }

    public void insert(String word) {
      Node[] curr = root.children;
      char[] charArray = word.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
        int c = charArray[i] - 'a';
        if (curr[c] == null) {
          curr[c] = new Node();
        }
        if (i == charArray.length - 1) {
          curr[c].isWord = true;
        }
        curr = curr[c].children;
      }
    }

    public boolean search(String word) {
      Node[] curr = root.children;
      char[] charArray = word.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
        int c = charArray[i] - 'a';
        if (curr[c] == null) {
          return false;
        }
        if (i == charArray.length - 1) {
          return curr[c].isWord;
        }
        curr = curr[c].children;
      }
      return false;
    }

    public boolean startsWith(String prefix) {
      Node[] curr = root.children;
      char[] charArray = prefix.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
        int c = charArray[i] - 'a';
        if (curr[c] == null) {
          return false;
        }
        curr = curr[c].children;
      }
      return true;
    }
  }
}
