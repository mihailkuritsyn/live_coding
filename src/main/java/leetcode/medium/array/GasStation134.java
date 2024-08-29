package leetcode.medium.array;

//There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
//
//You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
//
//Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.
public class GasStation134 {

  public int canCompleteCircuit(int[] gas, int[] cost) {
    if (gas.length == 1) {
      return gas[0] >= cost[0] ? 0 : -1;
    }
    int sum = 0;
    for (int i = 0; i < gas.length; i++) {
      gas[i] -= cost[i];
      sum += gas[i];
    }
    if (sum < 0) {
      return -1;
    }
    int start = 0;
    sum = 0;
    for (int i = 0; i < gas.length; i++) {
      sum += gas[i];
      if (sum < 0) {
        sum = 0;
        start = i + 1;
      }
    }
    return start;
  }

//  extra CPU solution
//  public int canCompleteCircuit(int[] gas, int[] cost) {
//    if (gas.length == 1) {
//      return gas[0] >= cost[0] ? 0 : -1;
//    }
//    int sum = 0;
//    int startIdx = -1;
//    for (int i = 0; i < gas.length; i++) {
//      gas[i] -= cost[i];
//      if (gas[i] > 0 && startIdx == -1) {
//        startIdx = i;
//      }
//      sum += gas[i];
//    }
//    if (sum < 0) {
//      return -1;
//    }
//    int curSum = gas[startIdx];
//    int i = (startIdx + 1) % gas.length;
//    boolean startDefined = true;
//    while (i != startIdx) {
//      if (startDefined) {
//        curSum += gas[i];
//        if (curSum < 0) {
//          startDefined = false;
//        }
//      } else if (gas[i] > 0) {
//        startIdx = i;
//        curSum = gas[startIdx];
//        startDefined = true;
//      }
//      i = (i + 1) % gas.length;
//    }
//    return startIdx;
//  }
}
