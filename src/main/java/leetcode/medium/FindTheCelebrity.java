package leetcode.medium;

//The Celebrity Problem
//MediumAccuracy: 38.33%Submissions: 228K+Points: 4

// A celebrity is a person who is known to all but does not know anyone at a party.
// If you go to a party of N people, find if there is a celebrity in the party or not.
// A square NxN matrix M[][] is used to represent people at the party
// such that if an element of row i and column j  is set to 1 it means ith person knows jth person.
// Here M[i][i] will always be 0.
// Return the index of the celebrity, if there is no celebrity return -1.
// Note: Follow 0 based indexing.
// Follow Up: Can you optimize it to O(N)
//
// Example 1:
//
// Input:
// N = 3
// M[][] = {{0 1 0},
//          {0 0 0},
//          {0 1 0}}
// Output: 1
// Explanation: 0th and 2nd person both
// know 1. Therefore, 1 is the celebrity.
//
// Example 2:
//
// Input:
// N = 2
// M[][] = {{0 1},
//          {1 0}}
// Output: -1
// Explanation: The two people at the party both
// know each other. None of them is a celebrity.
//
// Expected Time Complexity: O(N^2)
// Expected Auxiliary Space: O(1)
//
// Constraints:
// 1 <= N <= 3000
// 0 <= M[][] <= 1

public class FindTheCelebrity {

  int celebrity(int[][] m, int n) {
    int l = 0;
    int r = n - 1;
    while (l != r) {
      if (m[l][r] == 1) {
        l++;
      } else {
        r--;
      }
    }

    for (int i = 0; i < n; i++) {
      if (i != l && m[i][l] == 0 || m[l][i] == 1) {
        return -1;
      }
    }
    return l;
  }
}
