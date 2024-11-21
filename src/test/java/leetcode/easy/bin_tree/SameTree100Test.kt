package leetcode.easy.bin_tree

import leetcode.easy.bin_tree.SameTree100.TreeNode
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SameTree100Test {

    val target = SameTree100()

    @Test
    fun test1() {
        assertTrue(
            target.isSameTree(
                buildTree(arrayListOf(1, 2, 3)),
                buildTree(arrayListOf(1, 2, 3))
            )
        )
    }

    @Test
    fun test2() {
        assertFalse(
            target.isSameTree(
                buildTree(arrayListOf(1, 2)),
                buildTree(arrayListOf(1, null, 2))
            )
        )
    }

    @Test
    fun test3() {
        assertFalse(
            target.isSameTree(
                buildTree(arrayListOf(1, 2, 1)),
                buildTree(arrayListOf(1, 1, 2))
            )
        )
    }

    fun buildTree(values: List<Int?>): TreeNode? {
        if (values.isEmpty() || values[0] == null) return null

        val root = TreeNode(values[0]!!)
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

        var i = 1
        while (i < values.size) {
            val current = queue.poll()

            // Process left child
            if (values[i] != null) {
                current.left = TreeNode(values[i]!!)
                queue.add(current.left)
            }
            i++

            // Process right child
            if (i < values.size && values[i] != null) {
                current.right = TreeNode(values[i]!!)
                queue.add(current.right)
            }
            i++
        }
        return root
    }

}