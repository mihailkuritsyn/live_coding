package leetcode.medium.bin_tree

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.util.*

class SumRootToLeafNumbers129Test {
    val target = SumRootToLeafNumbers129()

    @Test
    fun test1() {
//        0
//        1
//        12
//        res =12
//13
        val tree = buildTree(listOf(1, 2, 3))
        assertEquals(25, target.sumNumbers(tree))
    }

    @Test
    fun test2() {
        //0
        //4
//        49   40
        val tree = buildTree(listOf(4, 9, 0, 5, 1))
        assertEquals(1026, target.sumNumbers(tree))
    }

    fun buildTree(values: List<Int?>): SumRootToLeafNumbers129.TreeNode? {
        if (values.isEmpty() || values[0] == null) return null

        val root = SumRootToLeafNumbers129.TreeNode(values[0]!!)
        val queue: Queue<SumRootToLeafNumbers129.TreeNode> = LinkedList()
        queue.add(root)

        var i = 1
        while (i < values.size) {
            val current = queue.poll()

            // Process left child
            if (values[i] != null) {
                current.left = SumRootToLeafNumbers129.TreeNode(values[i]!!)
                queue.add(current.left)
            }
            i++

            // Process right child
            if (i < values.size && values[i] != null) {
                current.right = SumRootToLeafNumbers129.TreeNode(values[i]!!)
                queue.add(current.right)
            }
            i++
        }
        return root
    }
}