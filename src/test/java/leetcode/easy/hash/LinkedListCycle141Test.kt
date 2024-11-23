package leetcode.easy.hash

import leetcode.easy.hash.LinkedListCycle141.ListNode
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class LinkedListCycle141Test {

    val target = LinkedListCycle141()

    @Test
    fun test1() {
        val head = buildNodes(arrayOf(3, 2, 0, -4))
        head!!.next!!.next!!.next!!.next = head.next
        assertTrue(target.hasCycle(head))
    }

    @Test
    fun test2() {
        val head = buildNodes(arrayOf(1, 2))
        head!!.next = head
        assertTrue(target.hasCycle(head))
    }

    @Test
    fun test3() {
        val head = buildNodes(arrayOf(1))
        assertFalse(target.hasCycle(head))
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