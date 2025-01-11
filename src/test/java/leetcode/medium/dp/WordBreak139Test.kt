package leetcode.medium.dp

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class WordBreak139Test {
    val target = WordBreak139()

    @Test
    fun test1() {
//        l
//        le
//        lee
//        leet - true
//        leetc
//        leetco
//        leetcod
//        leetcode = leet
        assertTrue(target.wordBreak("leetcode", listOf("leet", "code")))
    }

    @Test
    fun test2() {
        assertTrue(target.wordBreak("applepenapple", listOf("apple", "pen")))
    }

    @Test
    fun test3() {
//        dp[0]=true
//        0, 4, 3  - len set
//        c   dp[1]=false
//        ca  dp[2]=false
//        cat - dp[3]=true
//        cats - dp[4]=true
//        catsa - 5-3=2 dp[2]=false 5-4=1 dp[1]=false
//        catsan dp[]
//        catsand - 7-3=4 dp[4]=true and contains  dp[7] =true
        val list = listOf("cats", "dog", "sand", "and", "cat")
        assertFalse(target.wordBreak("catsandog", list))
    }

    @Test
    fun test4() {
        val list = listOf("a", "b", "bold")
        assertTrue(target.wordBreak("bold", list))
    }

    @Test
    fun test5() {
        //a true
        //ab true
        //abc a+bc true
        val list = listOf("a", "ab", "bc")
        assertTrue(target.wordBreak("abc", list))
    }
}