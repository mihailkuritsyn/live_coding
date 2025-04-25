package leetcode.easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLastWord58Test {
    val target = LengthOfLastWord58()

    @Test
    fun test1() {
        assertEquals(0, target.lengthOfLastWord(""))
    }

    @Test
    fun test2() {
        assertEquals(0, target.lengthOfLastWord(" "))
    }

    @Test
    fun test3() {
        assertEquals(1, target.lengthOfLastWord(" a"))
    }

    @Test
    fun test4() {
//      _a_
//      012
//      01
//      0
        assertEquals(1, target.lengthOfLastWord(" a "))
    }

    @Test
    fun test5() {
        assertEquals(4, target.lengthOfLastWord("   fly me   to   the moon  "))
    }

}