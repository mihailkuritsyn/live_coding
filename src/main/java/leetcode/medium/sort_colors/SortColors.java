package main.java.leetcode.medium.sort_colors;

import java.util.Arrays;

public class SortColors {

  public static void main(String[] args) {
    int[] nums = new int[]{2, 0, 2, 1, 1, 0};
//    int[] nums = new int[]{2, 0, 1};
//    int[] nums = new int[]{0, 1, 2};
    new SortColors().sortColors(nums);
    System.out.println(Arrays.toString(nums));
  }

  public void sortColors(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return;
    }
    quickSort(nums, 0, nums.length - 1);
  }

  public static void quickSort(int[] nums, int low, int high) {
    if (low < high) {
      int tmp;
      int pivot = nums[high];
      int i = low - 1;
      for (int j = low; j < high; j++) {
        if (nums[j] < pivot) {
          i++;
          if (i != j) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
          }
        }
      }
      tmp = nums[i + 1];
      nums[i + 1] = nums[high];
      nums[high] = tmp;
      int pivotIndex = i + 1;

      quickSort(nums, low, pivotIndex - 1);
      quickSort(nums, pivotIndex + 1, high);
    }
  }

  public static int partition(int[] nums, int low, int high) {
    int pivot = nums[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (nums[j] < pivot) {
        i++;
        swap(nums, i, j);
      }
    }
    swap(nums, i + 1, high);
    return i + 1;
  }

  public static void swap(int[] nums, int i, int j) {
    if (i == j) {
      return;
    }
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
