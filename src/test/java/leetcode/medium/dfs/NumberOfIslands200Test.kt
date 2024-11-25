package leetcode.medium.dfs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NumberOfIslands200Test {
    val target = NumberOfIslands200()

    @Test
    fun test1() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0'),
        )
        assertEquals(1, target.numIslands(grid))
    }

    @Test
    fun test2() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1'),
        )
        assertEquals(3, target.numIslands(grid))
    }

    @Test
    fun test3() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('1', '1', '1'),
            charArrayOf('0', '1', '0'),
            charArrayOf('1', '1', '1')
        )
        assertEquals(1, target.numIslands(grid))
    }
}