package leetcode.easy.array;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
public class ValidAnagram242 {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    if (s.length() == 1) {
      return s.equals(t);
    }
    int[] alph = new int[26];
    for (int i = 0; i < s.length(); i++) {
      alph[s.charAt(i) - 'a']++;
      alph[t.charAt(i) - 'a']--;
    }
    for (int count : alph) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }
}
