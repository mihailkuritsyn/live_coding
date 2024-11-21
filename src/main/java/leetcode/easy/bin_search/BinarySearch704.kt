package leetcode.easy.bin_search

//Given an array of integers nums which is sorted in ascending order,
// and an integer target, write a function to search target in nums.
// If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.
class BinarySearch704 {

    fun search(nums: IntArray, target: Int): Int {
        if (nums.size == 1) return if (nums[0] == target) 0 else -1
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val m: Int = l + (r - l) / 2
            if (nums[m] == target) {
                return m
            } else if (nums[m] < target) {
                l = m + 1
            } else {
                r = m - 1
            }
        }
        return -1
    }
}