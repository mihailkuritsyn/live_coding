package leetcode.easy.array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringCompression443Test {
    val target = StringCompression443()

    @Test
    fun test1() {
        assertEquals(6, target.compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')))
    }

    @Test
    fun test2() {
        assertEquals(1, target.compress(charArrayOf('a')))
    }

    @Test
    fun test3() {
        assertEquals(
            4,
            target.compress(
                charArrayOf(
                    'a',
                    'b',
                    'b',
                    'b',
                    'b',
                    'b',
                    'b',
                    'b',
                    'b',
                    'b',
                    'b',
                    'b',
                    'b'
                )
            )
        )
    }
}