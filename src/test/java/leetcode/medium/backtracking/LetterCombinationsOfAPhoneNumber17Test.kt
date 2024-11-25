package leetcode.medium.backtracking

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LetterCombinationsOfAPhoneNumber17Test {
    val target = LetterCombinationsOfAPhoneNumber17()

    @Test
    fun test1() {
        val exp = listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        val res = target.letterCombinations("23")
        assertEquals(exp, res)
    }

    @Test
    fun test2() {
        val res = target.letterCombinations("")
        assertEquals(emptyList(), res)
    }

    @Test
    fun test3() {
        val exp = listOf("a", "b", "c")
        val res = target.letterCombinations("2")
        assertEquals(exp, res)
    }
}