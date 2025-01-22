package leetcode.medium.heap

import java.util.*
import kotlin.collections.Map.Entry

//Given an array of strings words and an integer k, return the k most frequent strings.
//
//Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
class TopKFrequentWords692 {

    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val stat = mutableMapOf<String, Int>()
        for (word in words) {
            stat.merge(word, 1) { old, _ -> old + 1 }
        }
        val comparator = compareByDescending<Entry<String, Int>> { it.value }
            .then(compareBy { it.key })
        val q = PriorityQueue(comparator)
        q.addAll(stat.entries)

        var res = mutableListOf<String>()
        for (i in 0 until k) {
            res += q.poll().key
        }
        return res
    }
}