package leetcode.easy.greedy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SplitAStringInBalancedStrings1221Test {
    val target = SplitAStringInBalancedStrings1221()

    @Test
    fun test1() {
//        RLRRLLRLRL
//        rl rrll rl rl
        val count = target.balancedStringSplit("RLRRLLRLRL")
        assertEquals(4, count)
    }

    @Test
    fun test2() {
//        RLRRRLLRLL
//        rl rrrllrll
        val count = target.balancedStringSplit("RLRRRLLRLL")
        assertEquals(2, count)
    }
}