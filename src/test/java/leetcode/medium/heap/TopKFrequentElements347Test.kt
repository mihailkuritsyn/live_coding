package leetcode.medium.heap

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class TopKFrequentElements347Test {
    val target = TopKFrequentElements347()

    @Test
    fun test1() {
        val res = target.topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2)
        assertContentEquals(intArrayOf(1, 2), res)
    }

    @Test
    fun test2() {
        val res = target.topKFrequent(intArrayOf(1), 1)
        assertContentEquals(intArrayOf(1), res)
    }
}