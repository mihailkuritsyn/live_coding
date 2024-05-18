package leetcode.medium;

public class MaximizeDistanceToClosestPerson849 {
// You are given an array representing a row of seats
// where seats[i] = 1 represents a person sitting in the ith seat,
// and seats[i] = 0 represents that the ith seat is empty (0-indexed).
//
// There is at least one empty seat, and at least one person sitting.
//
// Alex wants to sit in the seat such that the distance
// between him and the closest person to him is maximized.
//
// Return that maximum distance to the closest person.

  public int maxDistToClosest(int[] seats) {
    int l = 0, r = 0;
    int maxDist = 0;
    while (r < seats.length) {
      if (seats[l] == 1) {
        l++;
        r++;
      } else {
        if (r == seats.length - 1 && seats[r] == 0) {
          maxDist = Math.max(maxDist, r - l +1);
        }
        if (seats[r] == 1) {
          if (l == 0) {
            maxDist = Math.max(maxDist, r - l);
          } else {
            maxDist = Math.max(maxDist, ((r-1) - l) / 2 + 1);
          }
          r++;
          l = r;
        }
        r++;
      }
    }
    return maxDist;
  }
}
