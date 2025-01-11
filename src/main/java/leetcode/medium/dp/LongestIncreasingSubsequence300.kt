package leetcode.medium.dp

//Given an integer array nums, return the length of
//the longest strictly increasing
//subsequence
class LongestIncreasingSubsequence300 {


    fun lengthOfLIS(nums: IntArray): Int {
        if (nums.size == 1) return 1
        val dp = IntArray(nums.size) { 1 }
        dp[nums.size - 1] = 1
        var res = 1
        for (i in nums.size - 2 downTo 0) {
            for (j in i + 1 until nums.size) {
                if (nums[i] < nums[j]) {
                    dp[i] = maxOf(dp[i], 1 + dp[j])
                }
                res = maxOf(res, dp[i])
            }
        }
        return res
    }
}