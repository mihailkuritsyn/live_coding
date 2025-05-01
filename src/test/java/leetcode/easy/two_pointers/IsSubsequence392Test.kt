package leetcode.easy.two_pointers

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IsSubsequence392Test {
    val target = IsSubsequence392()

    @Test
    fun test1() {
        assertTrue(target.isSubsequence("abc", "ahbgdc"))
    }

    @Test
    fun test2() {
        assertFalse(target.isSubsequence("axc", "ahbgdc"))
    }

    @Test
    fun test3() {
        assertFalse(target.isSubsequence("a", "bb"))
    }

    @Test
    fun test4() {
        assertTrue(target.isSubsequence("", "bb"))
    }
}