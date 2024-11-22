package leetcode.hard

import leetcode.hard.MergeKSortedLists23.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertNull

internal class MergeKSortedLists23Test {
    val target = MergeKSortedLists23()

    @Test
    fun test1() {
        val res = target.mergeKLists(
            arrayOf(
                buildNodes(arrayOf(1, 4, 5)),
                buildNodes(arrayOf(1, 3, 4)),
                buildNodes(arrayOf(2, 6))
            )
        )
        val expected = buildNodes(arrayOf(1, 1, 2, 3, 4, 4, 5, 6))
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test2() {
        val res = target.mergeKLists(arrayOf())
        assertNull(res)
    }

    @Test
    fun test3() {
        val lists = arrayOf<ListNode?>(null)
        val res = target.mergeKLists(lists)
        assertNull(res)
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