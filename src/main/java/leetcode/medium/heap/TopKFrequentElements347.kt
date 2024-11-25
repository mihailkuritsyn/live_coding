package leetcode.medium.heap

import java.util.*
import kotlin.collections.Map.Entry

//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
class TopKFrequentElements347 {

    // todo - rework to bucket sort approach
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        if (nums.size == 1) return intArrayOf(nums[0])

        val stat = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            stat.merge(nums[i], 1) { old, _ -> old + 1 }
        }

        val q = PriorityQueue<Entry<Int, Int>>(compareByDescending { it.value })
        q.addAll(stat.entries)

        val res = IntArray(k)
        for (i in 0 until k) {
            res[i] = q.poll().key
        }
        return res
    }
}