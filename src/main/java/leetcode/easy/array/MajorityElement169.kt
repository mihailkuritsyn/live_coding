package leetcode.easy.array

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.
class MajorityElement169 {

    fun majorityElement(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        var res = nums[0]
        var count = 1;
        for (i in 1 until nums.size) {
            if (nums[i] == res) {
                count++
            } else if (count != 0) {
                count--
            } else {
                res = nums[i]
                count = 1
            }
        }
        return res
    }

//    fun majorityElement(nums: IntArray): Int {
//        if (nums.size == 1) return nums[0]
//        val mid: Int = (nums.size / 2)
//        for (i in 0 until mid) {
//            if (nums[i] == nums[nums.size - i - 1]) {
//                var count = 0
//                for (j in nums.indices) {
//                    if (nums[j] == nums[i]) count++
//                }
//                if (count > (nums.size / 2)) {
//                    return nums[i]
//                }
//            }
//        }
//        return nums[mid]
//    }
}