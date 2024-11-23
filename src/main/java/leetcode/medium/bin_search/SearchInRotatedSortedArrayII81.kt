package leetcode.medium.bin_search

//There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
//
//Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
//
//Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
//
//You must decrease the overall operation steps as much as possible.
class SearchInRotatedSortedArrayII81 {

    fun search(nums: IntArray, target: Int): Boolean {
        if (nums.size == 1) return nums[0] == target
        var l = 0
        var r = nums.size - 1
        var m: Int

        while (nums[l] == nums[r] && l < r) {
            if (nums[l] == target) return true
            l++
            r--
        }

        while (l <= r) {
            m = l + (r - l) / 2
            if (nums[m] == target) {
                return true
            }
            if (nums[l] <= nums[m]) { // in left sorted part
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
        return false
    }

//    fun search(nums: IntArray, target: Int): Boolean {
//        if (nums.size == 1) return nums[0] == target
//        var l = 0
//        var r = nums.size - 1
//        while (nums[l] == nums[r] && l < r) {
//            if (nums[l] == target) return true
//            l++
//            r--
//        }
//
//        if (nums[l] > nums[r]) {
//            val k = searchK(nums, l, r)
//            if (target > nums[k] || target < nums[k + 1]) {
//                return false
//            }
//            if (target >= nums[0]) {
//                r = k
//            } else {
//                l = k + 1
//            }
//        }
//        return binSearch(l, r, nums, target)
//    }
//
//    private fun binSearch(l: Int, r: Int, nums: IntArray, target: Int): Boolean {
//        var l1 = l
//        var r1 = r
//        while (l1 <= r1) {
//            val m: Int = l1 + (r1 - l1) / 2
//            if (nums[m] == target) {
//                return true
//            } else if (nums[m] < target) {
//                l1 = m + 1
//            } else {
//                r1 = m - 1
//            }
//        }
//        return false
//    }
//
//    fun searchK(nums: IntArray, l: Int, r: Int): Int {
//        var l = l
//        var r = r
//        while (l <= r) {
//            val m: Int = l + (r - l) / 2
//            val rNum = nums[m + 1]
//            if (nums[m] > rNum) {
//                return m
//            } else if (nums[m] < nums[l]) {
//                r = m - 1 // move left
//            } else {
//                l = m + 1 // move right
//            }
//        }
//        return -1
//    }
}