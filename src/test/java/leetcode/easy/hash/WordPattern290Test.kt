package leetcode.easy.hash


import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class WordPattern290Test {

    val target = WordPattern290()

    @Test
    fun test1() {
        //dog cat cat dog
        //a   b   b=ok a=ok
        assertTrue(target.wordPattern("abba", "dog cat cat dog"))
    }

    @Test
    fun test2() {
        //dog cat cat fish
        //a   b   b=ok a
        assertFalse(target.wordPattern("abba", "dog cat cat fish"))
    }

    @Test
    fun test3() {
        //dog cat cat dog
        //a   a
        assertFalse(target.wordPattern("aaaa", "dog cat cat dog"))
    }
}