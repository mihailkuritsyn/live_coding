package leetcode.easy.linked_list

import leetcode.easy.linked_list.MergeTwoSortedLists21.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class MergeTwoSortedLists21Test {

    val target = MergeTwoSortedLists21()

    @Test
    fun test1() {
        val l1 = buildNodes(arrayOf(1, 2, 4))
        val l2 = buildNodes(arrayOf(1, 3, 4))
        val res = target.mergeTwoLists(l1, l2)
        val exp = buildNodes(arrayOf(1, 1, 2, 3, 4, 4))
        assertEquals(exp.toString(), res.toString())
    }

    @Test
    fun test2() {
        val res = target.mergeTwoLists(null, null)
        assertNull(res)
    }

    @Test
    fun test3() {
        val list2 = ListNode(0)
        val res = target.mergeTwoLists(null, list2)
        assertEquals(ListNode(0).toString(), res.toString())
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