package leetcode.medium.reorganize_string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReorganizeString {

//  It's easy to realise what we need to do here, alternatively put characters with maximum frequency. The problem lies in implementing this.
//  Even if you get the intuition of using Heaps, it's still a tricky one to implement.
//  So, the trick is to store pair of {frequency,char} in a Heap. Then while Heap.size()>1 , at every iteration, take out the top two elements, append them to the ans string, decrease their frequency by 1 and push them again in the Heap.
//  When the loop will break, either the Heap became empty or of 1 size.
//  If it's empty, return the ans string.
//  if it has size == 1, check the remaining frequency of the top/last element, if its 1, append it and return ans.
//  Otherwise, return ""

  public static void main(String[] args) {
    String s = "aab";
    String s0 = "";
    String s2 = "a";
    String s4 = "aaab";
    String s1 = "aaabbcccccc";
    String s8 = "aaabbcccccc";
    String s7 = "cacbcacbcac";
    String s3 = "cbcbcacacac";
    String s5 = "aabbccb";
    String s6 = "acabcbb";
    String result = new ReorganizeString().reorganizeString(s2);
    System.out.println(result);
  }

  public String reorganizeString(String s) {
    List<Character> chars = s.chars().mapToObj(c -> (char) c).toList();

    // freq map
    Map<Character, Long> freqMap = chars.stream()
        .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

    // pair heap
    List<Pair> pairs = freqMap.keySet().stream()
        .map(character -> new Pair(character, freqMap.get(character))).toList();

    PriorityQueue<Pair> pQueue = new PriorityQueue<>();
    pQueue.addAll(pairs);

    StringBuilder sb = new StringBuilder();
    while (pQueue.size() >= 2) {
      Pair p1 = pQueue.poll();
      System.out.println(p1.character);
      Pair p2 = pQueue.poll();
      System.out.println(p2.character);

      sb.append(p1.character);
      sb.append(p2.character);

      p1.frequency = p1.frequency - 1;
      if (p1.frequency > 0) {
        pQueue.add(p1);
      }

      p2.frequency = p2.frequency - 1;
      if (p2.frequency > 0) {
        pQueue.add(p2);
      }
//      System.out.println("updated: " + pQueue);
    }

    if (pQueue.size() == 1) {
      Pair last = pQueue.poll();
      if (last.frequency == 1) {
        sb.append(last.character);
      } else {
        return "";
      }
    }
    return sb.toString();
  }

  public static class Pair implements Comparable<Pair> {

    public Character character;

    public Long frequency;

    public Pair(Character character, Long frequency) {
      this.character = character;
      this.frequency = frequency;
    }

    @Override
    public int compareTo(Pair o) {
      return o.frequency.compareTo(this.frequency);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder().append(character).append(":").append(frequency);
      return sb.toString();
    }
  }

}
