package leetcode.easy.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ValidAnagram242Test {
    val target = ValidAnagram242()

    @Test
    fun test1() {
        assertTrue(target.isAnagram("anagram", "nagaram"))
    }

    @Test
    fun test2() {
        assertFalse(target.isAnagram("rat", "car"))
    }
}