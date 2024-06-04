package leetcode.medium.two_pointers;

public class ContainerWithMostWater11 {
//You are given an integer array height of length n.
//There are n vertical lines drawn such that the two
//endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form
//a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.

  public int maxArea(int[] height) {
    if (height.length == 2) {
      return Math.min(height[0], height[1]);
    }
    int l = 0;
    int r = height.length - 1;
    int res = 0;
    while (l != r) {
      int h = Math.min(height[l], height[r]);
      int area = (r - l) * h;
      res = Math.max(area, res);
      if (height[l] == h) {
        l++;
      } else {
        r--;
      }
    }
    return res;
  }
}
