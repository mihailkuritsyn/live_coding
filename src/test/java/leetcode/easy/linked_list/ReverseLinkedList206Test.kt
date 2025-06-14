package leetcode.easy.linked_list

import leetcode.easy.linked_list.ReverseLinkedList206.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class ReverseLinkedList206Test {
    val target = ReverseLinkedList206()

    @Test
    fun test1() {
        val l = buildNodes(arrayOf(1, 2, 3, 4, 5))
        assertEquals(
            target.reverseList(l).toString(),
            buildNodes(arrayOf(5, 4, 3, 2, 1)).toString()
        )
    }

    @Test
    fun test2() {
        val l = buildNodes(arrayOf(1, 2))
        assertEquals(
            target.reverseList(l).toString(),
            buildNodes(arrayOf(2, 1)).toString()
        )
    }

    @Test
    fun test3() {
        assertNull(target.reverseList(null))
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