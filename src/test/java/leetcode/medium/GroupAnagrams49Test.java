package leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class GroupAnagrams49Test {

  GroupAnagrams49 target = new GroupAnagrams49();

  @Test
  public void test1() {
    String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> anagrams = target.groupAnagrams(strings);
    System.out.println(anagrams);

    List<List<String>> expected = new ArrayList<>();
    expected.add(List.of("bat"));
    expected.add(List.of("nat", "tan"));
    expected.add(List.of("ate", "eat", "tea"));
    assertTrue(areListsEqual(expected, anagrams));
  }

  @Test
  public void test2() {
    String[] strings = new String[]{""};
    List<List<String>> anagrams = target.groupAnagrams(strings);
    System.out.println(anagrams);

    List<List<String>> expected = new ArrayList<>();
    expected.add(List.of(""));
    assertTrue(areListsEqual(expected, anagrams));
  }

  @Test
  public void test3() {
    String[] strings = new String[]{"a"};
    List<List<String>> anagrams = target.groupAnagrams(strings);
    System.out.println(anagrams);

    List<List<String>> expected = new ArrayList<>();
    expected.add(List.of("a"));
    assertTrue(areListsEqual(expected, anagrams));
  }

  @Test
  public void test4() {
    String[] strings = new String[]{"a", "b"};
    List<List<String>> anagrams = target.groupAnagrams(strings);
    System.out.println(anagrams);

    List<List<String>> expected = new ArrayList<>();
    expected.add(List.of("a"));
    expected.add(List.of("b"));
    assertTrue(areListsEqual(expected, anagrams));
  }

  @Test
  public void test5() {
    String[] strings = new String[]{"a", "b", "c", "d", "e"};
    List<List<String>> anagrams = target.groupAnagrams(strings);
    System.out.println(anagrams);

    List<List<String>> expected = new ArrayList<>();
    expected.add(List.of("a"));
    expected.add(List.of("b"));
    expected.add(List.of("c"));
    expected.add(List.of("d"));
    expected.add(List.of("e"));
    assertTrue(areListsEqual(expected, anagrams));
  }


  public static boolean areListsEqual(List<List<String>> list1, List<List<String>> list2) {
    if (list1.size() != list2.size()) {
      return false;
    }

    // Create new lists to sort the sublists
    List<List<String>> sortedList1 = new ArrayList<>();
    List<List<String>> sortedList2 = new ArrayList<>();

    // Sort the sublists within each list
    list1.forEach(sublist -> {
      List<String> sortedSublist = new ArrayList<>(sublist);
      Collections.sort(sortedSublist);
      sortedList1.add(sortedSublist);
    });

    list2.forEach(sublist -> {
      List<String> sortedSublist = new ArrayList<>(sublist);
      Collections.sort(sortedSublist);
      sortedList2.add(sortedSublist);
    });

    // Create sets to compare the lists
    Set<List<String>> set1 = new HashSet<>(sortedList1);
    Set<List<String>> set2 = new HashSet<>(sortedList2);

    // Check if the two sets are equal
    return set1.equals(set2);
  }
}