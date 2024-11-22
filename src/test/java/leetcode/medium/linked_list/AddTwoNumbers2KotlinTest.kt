package leetcode.medium.linked_list

import leetcode.medium.linked_list.AddTwoNumbers2Kotlin.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AddTwoNumbers2KotlinTest {
    val target = AddTwoNumbers2Kotlin()

    @Test
    fun test1() {
        val res = target.addTwoNumbers(
            buildNodes(arrayOf(2, 4, 3)),
            buildNodes(arrayOf(5, 6, 4)),
        )
        val expected = buildNodes(arrayOf(7, 0, 8))
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test2() {
        val res = target.addTwoNumbers(
            buildNodes(arrayOf(5)),
            buildNodes(arrayOf(5)),
        )
        val expected = buildNodes(arrayOf(0, 1))
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test3() {
        val res = target.addTwoNumbers(
            buildNodes(arrayOf(0)),
            buildNodes(arrayOf(0)),
        )
        val expected = buildNodes(arrayOf(0))
        assertEquals(expected.toString(), res.toString())
    }

    @Test
    fun test4() {
        val res = target.addTwoNumbers(
            buildNodes(arrayOf(9, 9, 9, 9, 9, 9, 9)),
            buildNodes(arrayOf(9, 9, 9, 9)),
        )
        val expected = buildNodes(arrayOf(8, 9, 9, 9, 0, 0, 0, 1))
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