package leetcode.medium.heap

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class TopKFrequentWords692Test {
    var target = TopKFrequentWords692()

    @Test
    fun test1() {
        val words = arrayOf("i", "love", "leetcode", "i", "love", "coding")
        val res = target.topKFrequent(words, 2)
        assertContentEquals(listOf("i", "love"), res)
    }

    @Test
    fun test2() {
        val words = arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is")
        val res = target.topKFrequent(words, 4)
        assertContentEquals(listOf("the", "is", "sunny", "day"), res)
    }
}