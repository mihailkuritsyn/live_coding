package leetcode.easy.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class IsomorphicStrings205Test {
    val target = IsomorphicStrings205()

    @Test
    fun test1() {
        //egg
        //1
        //add
        //1 2
        assertTrue(target.isIsomorphic("egg", "add"))
    }

    @Test
    fun test2() {
        //foo
        //1 2
        //bar
        //1 1 1
        assertFalse(target.isIsomorphic("foo", "bar"))
    }

    @Test
    fun test3() {
        //paper
        //2 1 1 1
        //title
        //2 1 1 1
        assertTrue(target.isIsomorphic("paper", "title"))
    }

    @Test
    fun test4() {
//        bbbaaaba
//        11122212
//        aaabbbba
//        11122221
        assertFalse(target.isIsomorphic("bbbaaaba", "aaabbbba"))
    }

    @Test
    fun test5() {
        assertFalse(target.isIsomorphic("ab", "aa"))
    }
}