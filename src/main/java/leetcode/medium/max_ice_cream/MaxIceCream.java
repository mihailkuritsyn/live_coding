package main.java.leetcode.medium.max_ice_cream;

import java.util.Arrays;

public class MaxIceCream {

  public static void main(String[] args) {
    MaxIceCream obj = new MaxIceCream();

//    int[] costs = {1, 3, 2, 4, 1};
//    int barCount = obj.maxIceCream(costs, 7);

//    int[] costs = {10,6,8,7,7,8};
//    int barCount = obj.maxIceCream(costs, 5);

    int[] costs = {1, 6, 3, 1, 2, 5};
    int barCount = obj.maxIceCream(costs, 20);
    System.out.println("res = " + barCount);
  }

  public int maxIceCream(int[] costs, int coins) {
    Arrays.sort(costs);
    int barCount = 0;
    int totalSum = 0;
    for (int cost : costs) {
      totalSum += cost;
      if (totalSum > coins) {
        return barCount;
      }
      barCount++;
    }
    return barCount;
  }
}
