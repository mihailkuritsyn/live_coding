package leetcode.easy.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class RansomNote383Test {
    val target = RansomNote383()

    @Test
    fun test1() {
        assertFalse(target.canConstruct("a", "b"))
    }

    @Test
    fun test2() {
        assertFalse(target.canConstruct("aa", "ab"))
    }

    @Test
    fun test3() {
        assertTrue(target.canConstruct("aa", "aab"))
    }
}