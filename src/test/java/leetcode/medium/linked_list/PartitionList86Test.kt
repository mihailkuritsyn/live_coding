package leetcode.medium.linked_list

import leetcode.medium.linked_list.PartitionList86.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PartitionList86Test {
    val target = PartitionList86()

    @Test
    fun test1() {
        val head = buildNodes(arrayOf(1, 4, 3, 2, 5, 2))
        val expected = buildNodes(arrayOf(1, 2, 2, 4, 3, 5))
        val res = target.partition(head, 3)
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test2() {
        val head = buildNodes(arrayOf(2, 1))
        val expected = buildNodes(arrayOf(1, 2))
        val res = target.partition(head, 2)
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