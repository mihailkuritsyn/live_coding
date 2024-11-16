package leetcode.medium.linked_list

import leetcode.medium.linked_list.RemoveDuplicatesFromSortedListII82.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertNull

internal class RemoveDuplicatesFromSortedListII82Test {
    val target = RemoveDuplicatesFromSortedListII82()

    @Test
    fun test1() {
//        0 1, 2, 3, 3, 4, 4, 5
//        0 1
//          1  2
//             2  3 -   4
//             2  4
//             2  5
        val head = buildNodes(arrayOf(1, 2, 3, 3, 4, 4, 5))
        val expected = buildNodes(arrayOf(1, 2, 5))
        val res = target.deleteDuplicates(head)
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test2() {
//      0  1, 1, 1, 2, 3
//      0  2
        val head = buildNodes(arrayOf(1, 1, 1, 2, 3))
        val expected = buildNodes(arrayOf(2, 3))
        val res = target.deleteDuplicates(head)
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test3() {
//      0  1, 1, 1
//      0  1
        val head = buildNodes(arrayOf(1, 1, 1))
        val res = target.deleteDuplicates(head)
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