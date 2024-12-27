package leetcode.medium.bin_tree

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.util.*

class FlattenBinaryTreeToLinkedList114Test {

    val target = FlattenBinaryTreeToLinkedList114()

    @Test
    fun test1() {
//        1
//       2 5
//      3 4 6
        val tree = buildTree(listOf(1, 2, 5, 3, 4, null, 6))
        val exp = buildTree(listOf(1, null, 2, null, 3, null, 4, null, 5, null, 6))
        assertEquals(exp, target.flatten(tree))
    }

    @Test
    fun test2() {
        val tree = buildTree(listOf(4, 9, 0, 5, 1))
        assertEquals(1026, target.flatten(tree))
    }

    fun buildTree(values: List<Int?>): FlattenBinaryTreeToLinkedList114.TreeNode? {
        if (values.isEmpty() || values[0] == null) return null

        val root = FlattenBinaryTreeToLinkedList114.TreeNode(values[0]!!)
        val queue: Queue<FlattenBinaryTreeToLinkedList114.TreeNode> = LinkedList()
        queue.add(root)

        var i = 1
        while (i < values.size) {
            val current = queue.poll()

            // Process left child
            if (values[i] != null) {
                current.left = FlattenBinaryTreeToLinkedList114.TreeNode(values[i]!!)
                queue.add(current.left)
            }
            i++

            // Process right child
            if (i < values.size && values[i] != null) {
                current.right = FlattenBinaryTreeToLinkedList114.TreeNode(values[i]!!)
                queue.add(current.right)
            }
            i++
        }
        return root
    }
}