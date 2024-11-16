package leetcode.medium.linked_list

import leetcode.medium.linked_list.RotateList61.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RotateList61Test {
    val target = RotateList61()

    @Test
    fun test1() {
//        0 1, 2, 3, 4, 5
//        | |
//        |       |
//        0 4 5
        val head = buildNodes(arrayOf(1, 2, 3, 4, 5))
        val expected = buildNodes(arrayOf(4, 5, 1, 2, 3))
        val res = target.rotateRight(head, 2)
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test2() {
        val head = buildNodes(arrayOf(0, 1, 2))
        val expected = buildNodes(arrayOf(2, 0, 1))
        val res = target.rotateRight(head, 4)
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test3() {
        val head = buildNodes(arrayOf(1, 2))
        val expected = buildNodes(arrayOf(1, 2))
        val res = target.rotateRight(head, 0)
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test4() {
        val head = buildNodes(arrayOf(1, 2))
        val expected = buildNodes(arrayOf(1, 2))
        val res = target.rotateRight(head, 2)
        assertEquals(expected.toString(), res.toString())
    }

    private fun buildNodes(dataArray: Array<Int>): ListNode? {
        var prev: ListNode? = null
        for (i in dataArray.size - 1 downTo 0) {
            val node = ListNode(dataArray[i])
            node.next = prev
            prev = node
        }
        return prev
    }
}