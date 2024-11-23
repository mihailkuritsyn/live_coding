package leetcode.medium.bin_search

//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
class SearchInRotatedSortedArray33 {

    fun search(nums: IntArray, target: Int): Int {
        if (nums.size == 1) return if (nums[0] == target) 0 else -1
        var l = 0
        var r = nums.size - 1
        var m: Int
        while (l <= r) {
            m = l + (r - l) / 2
            if (nums[m] == target) {
                return m
            }
            if (nums[m] >= nums[l]) { // in left sorted part
                if (nums[l] <= target && target < nums[m]) {
                    r = m - 1
                } else {
                    l = m + 1
                }
            } else { // in right sorted part
                if (nums[m] < target && target <= nums[r]) {
                    l = m + 1
                } else {
                    r = m - 1
                }
            }
        }
        return -1
    }
}