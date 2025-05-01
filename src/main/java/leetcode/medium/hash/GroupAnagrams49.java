package leetcode.medium.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {

  public List<List<String>> groupAnagrams(String[] strs) {
    if (strs.length == 1) {
      ArrayList<List<String>> res = new ArrayList<>();
      res.add(Collections.singletonList(strs[0]));
      return res;
    }
    Map<String, List<String>> resMap = new HashMap<>();
    for (String str : strs) {
      char[] charCount = new char[26];
      char[] chars = str.toCharArray();
      for (char aChar : chars) {
        charCount[aChar - 'a']++;
      }
      String key = String.valueOf(charCount);
      if (resMap.containsKey(key)) {
        resMap.get(key).add(str);
      } else {
        ArrayList<String> value = new ArrayList<>();
        value.add(str);
        resMap.put(key, value);
      }
    }
    return new ArrayList<>(resMap.values());
  }
}
