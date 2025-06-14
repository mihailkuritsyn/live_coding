package leetcode.easy.two_pointers

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidPalindrome125Test {
    val target = ValidPalindrome125();

    @Test
    fun test1() {
        assertTrue(target.isPalindrome("A man, a plan, a canal: Panama"))
    }

    @Test
    fun test2() {
        assertFalse(target.isPalindrome("race a car"))
    }

    @Test
    fun test3() {
        assertTrue(target.isPalindrome(" "))
    }

    @Test
    fun test4() {
        assertFalse(target.isPalindrome("0P"))
    }
}