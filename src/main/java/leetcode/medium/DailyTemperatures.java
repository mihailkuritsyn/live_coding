package leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
//  Given an array of integers temperatures represents the daily temperatures,
//  return an array answer such that answer[i] is the number of days you have to wait
//  after the ith day to get a warmer temperature.
//  If there is no future day for which this is possible, keep answer[i] == 0 instead.

  public static void main(String[] args) {
    int[] t = new int[]{13, 12, 15, 11, 9, 12, 16};

//    13, 12, 15, 11, 9, 12, 16
//    0,  1,  2,  3,  4, 5,  6
//    2,  1,  4,  2,  1, 1,  0
    int[] nextHotDay = new DailyTemperatures().dailyTemperatures(t);
    System.out.println(Arrays.toString(nextHotDay));
  }

  public int[] dailyTemperatures(int[] temperatures) {
    int[] answer = new int[temperatures.length];
    int hot = Integer.MIN_VALUE;
    for (int i = temperatures.length - 1; i >= 0; --i) {
      if (hot > temperatures[i]) {
        int days = 1;
        while (temperatures[i + days] <= temperatures[i]) {
          days += answer[i + days];
        }
        answer[i] = days;
      } else {
        hot = temperatures[i];
      }
    }

    return answer;
  }

//  public int[] dailyTemperatures(int[] t) {
//    int[] res = new int[t.length];
//    if (res.length == 1) {
//      return res;
//    }
//
//    Stack<Pair> stack = new Stack<>();
//    for (int i = t.length - 1; i >= 0; i--) {
//      while (!stack.isEmpty() && stack.peek().temp <= t[i]) {
//        stack.pop();
//      }
//      if (!stack.isEmpty()) {
//        res[i] = stack.peek().index - i;
//      }
//      stack.push(new Pair(i, t[i]));
//    }
//    return res;
//  }

  public class Pair {

    int index;
    int temp;

    public Pair(int index, int temp) {
      this.index = index;
      this.temp = temp;
    }
  }

}
