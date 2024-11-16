package leetcode.medium.linked_list

import leetcode.medium.linked_list.ReverseLinkedListII92.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ReverseLinkedListII92Test {
    val target = ReverseLinkedListII92()

    @Test
    fun test1() {
        val dataArray = arrayOf(1, 2, 3, 4, 5)
        val head = buildNodes(dataArray)
        val reversed = target.reverseBetween(head, 2, 4)
        println(head)
        println(reversed)
        assertEquals(head.toString(), reversed.toString())
    }

    @Test
    fun test2() {
        val dataArray = arrayOf(5)
        val head = buildNodes(dataArray)
        val reversed = target.reverseBetween(head, 1, 1)
        assertEquals(head.toString(), reversed.toString())
    }

    @Test
    fun test3() {
//        3-5-null
//        3-null 5-null
//        5-3-null
        val dataArray = arrayOf(3, 5)
        val head = buildNodes(dataArray)
        val reversed = target.reverseBetween(head, 1, 2)
        println("$reversed")
        assertEquals(buildNodes(arrayOf(5, 3)).toString(), reversed.toString())
    }

    @Test
    fun test4() {
        val dataArray = arrayOf(3, 5)
        val head = buildNodes(dataArray)
        val reversed = target.reverseBetween(head, 2, 2)
        println("$reversed")
        assertEquals(head.toString(), reversed.toString())
    }

    @Test
    fun test5() {
//        1-2-3-null
//        1-3 2-3-null
//        2-1-3-null
        val dataArray = arrayOf(1, 2, 3)
        val head = buildNodes(dataArray)
        val reversed = target.reverseBetween(head, 1, 2)
        println("$reversed")
        assertEquals(buildNodes(arrayOf(2, 1, 3)).toString(), reversed.toString())
    }

    @Test
    fun test6() {
//        1-2-3-4-null l=0 r=3 - nodes
//        1-null 2-3-4-null
//        2-3-1-null 4-null
//        4-2-3-1-null l=1 r=2 - nodes
//        4-3-1-null 2-3-1-null
//        4-3-1-null 2-1-null
//        4-3-2-1-null - nodes
        val dataArray = arrayOf(1, 2, 3, 4)
        val head = buildNodes(dataArray)
        val reversed = target.reverseBetween(head, 1, 4)
        println("$reversed")
        assertEquals(buildNodes(arrayOf(4, 3, 2, 1)).toString(), reversed.toString())
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