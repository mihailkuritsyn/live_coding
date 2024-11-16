package leetcode.medium.linked_list

import leetcode.medium.linked_list.RemoveNthNodeFromEndOfList19.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class RemoveNthNodeFromEndOfList19Test {
    val target = RemoveNthNodeFromEndOfList19()

    @Test
    fun test1() {
//       0, 1, 2, 3, 4, 5
//       -  -
//       |     |
//          |     |
//             |     |
//                |     | r.next=null
//
        val head = buildNodes(arrayOf(1, 2, 3, 4, 5))
        val expected = buildNodes(arrayOf(1, 2, 3, 5))
        val res = target.removeNthFromEnd(head, 2)
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test4() {
//       0, 1, 2, 3, 4, 5
//       -  -
//       |           |
//          |           | r.next=null
//
        val head = buildNodes(arrayOf(1, 2, 3, 4, 5))
        val expected = buildNodes(arrayOf(2, 3, 4, 5))
        val res = target.removeNthFromEnd(head, 5)
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test2() {
//        0 1
//        ind = 2-1=1
//        arr[1]=1
//        arr[1-1].next = arr[1].next
        val head = buildNodes(arrayOf(1))
        val res: ListNode? = target.removeNthFromEnd(head, 1)
        assertEquals(null, res)
    }

    @Test
    fun test3() {
//        0 1 2
//        | |
        val head = buildNodes(arrayOf(1, 2))
        val expected = buildNodes(arrayOf(1))
        val res = target.removeNthFromEnd(head, 1)
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