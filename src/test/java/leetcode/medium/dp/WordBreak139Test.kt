package leetcode.medium.dp

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class WordBreak139Test {
    val target = WordBreak139()

    @Test
    fun test1() {
        assertTrue(target.wordBreak("leetcode", listOf("leet", "code")))
    }

    @Test
    fun test2() {
        assertTrue(target.wordBreak("applepenapple", listOf("apple", "pen")))
    }

    @Test
    fun test3() {
        val list = listOf("cats", "dog", "sand", "and", "cat")
        assertFalse(target.wordBreak("catsandog", list))
    }

    @Test
    fun test4() {
        val list = listOf("a", "b", "bold")
        assertFalse(target.wordBreak("bold", list))
    }

    @Test
    fun test5() {
        //a
        //ab
        val list = listOf("a", "ab", "bc")
        assertTrue(target.wordBreak("abc", list))
    }
}