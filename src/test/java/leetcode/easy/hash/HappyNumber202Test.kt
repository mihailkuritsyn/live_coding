package leetcode.easy.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class HappyNumber202Test {
    val target = HappyNumber202()

    @Test
    fun test1() {
        assertTrue(target.isHappy(19))
    }

    @Test
    fun test2() {
        assertFalse(target.isHappy(2))
    }
}