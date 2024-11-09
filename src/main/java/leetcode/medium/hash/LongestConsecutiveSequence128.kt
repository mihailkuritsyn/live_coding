package leetcode.medium.hash

import kotlin.math.max


class LongestConsecutiveSequence128 {

//    Given an unsorted array of integers nums,
//    return the length of the longest consecutive elements sequence.
//    You must write an algorithm that runs in O(n) time.


    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0;
        if (nums.size == 1) return 1;
        val numsSet = nums.toHashSet();
        var maxLen = 0;
        for (num in nums) {
            if (!numsSet.contains(num - 1)) {
                var currLen = 1;
                var nextInd = num + 1;
                while (numsSet.contains(nextInd)) {
                    currLen++
                    nextInd++
                }
                maxLen = max(maxLen, currLen)
            }
        }
        return maxLen;
    }

//    fun longestConsecutive(nums: IntArray): Int {
//        val visitMap = nums.associateBy({ num -> num }, { false }).toMutableMap()
//        var maxLen = 0;
//        for (num in nums) {
//            if (visitMap[num] == false) {
//                visitMap[num] = true
//                var currLen = 1;
//                var nextInd = num + 1;
//                while (visitMap.containsKey(nextInd)) {
//                    visitMap[nextInd] = true
//                    currLen++
//                    nextInd++
//                }
//                nextInd = num - 1;
//                while (visitMap.containsKey(nextInd)) {
//                    visitMap[nextInd] = true
//                    currLen++
//                    nextInd--
//                }
//                maxLen = max(maxLen, currLen)
//            }
//        }
//        return maxLen;
//    }
}