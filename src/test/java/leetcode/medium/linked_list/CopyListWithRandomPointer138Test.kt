package leetcode.medium.linked_list

import leetcode.medium.linked_list.CopyListWithRandomPointer138.Node
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CopyListWithRandomPointer138Test {
    val target = CopyListWithRandomPointer138()

    @Test
    fun test1() {
        val dataArray = arrayOf(
            arrayOf(7, null),
            arrayOf(13, 0),
            arrayOf(11, 4),
            arrayOf(10, 2),
            arrayOf(1, 0)
        )

        val node: Node? = buildNodes(dataArray)
        println(node)

        val cloned = target.copyRandomList(node)
        println(cloned)

        assertEquals(node.toString(), cloned.toString())
    }

    @Test
    fun test2() {
        val dataArray: Array<Array<out Int?>> = arrayOf(
            arrayOf(1, 1),
            arrayOf(2, 1)
        )

        val node: Node? = buildNodes(dataArray)
        println(node)

        val cloned = target.copyRandomList(node)
        println(cloned)

        assertEquals(node.toString(), cloned.toString())
    }

    @Test
    fun test3() {
//        [[3,null],[3,0],[3,null]]
        val dataArray: Array<Array<out Int?>> = arrayOf(
            arrayOf(3, null),
            arrayOf(3, 0),
            arrayOf(3, null)
        )

        val node: Node? = buildNodes(dataArray)
        println(node)

        val cloned = target.copyRandomList(node)
        println(cloned)

        assertEquals(node.toString(), cloned.toString())
    }

    private fun buildNodes(dataArray: Array<Array<out Int?>>): Node? {
        val nodes = arrayOfNulls<Node>(dataArray.size)
        var prev: Node? = null
        for (i in dataArray.size - 1 downTo 0) {
            val n = dataArray[i]
            val node = Node(n[0]!!)
            node.next = prev

            nodes[i] = node
            prev = node
        }

        for (i in dataArray.indices) {
            val r = dataArray[i][1]
            if (r != null) {
                nodes[i]!!.random = nodes[r]
            }
        }
        return prev
    }
}