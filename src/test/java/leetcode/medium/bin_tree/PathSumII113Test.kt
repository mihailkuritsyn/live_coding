package leetcode.medium.bin_tree

import org.junit.jupiter.api.Test
import java.util.*

internal class PathSumII113Test {
    val target = PathSumII113()

    @Test
    fun test1() {
        val pathSum = target.pathSum(
            buildTree(arrayListOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1)),
            22
        )
        println(pathSum)
        val exp = listOf(listOf(5, 4, 11, 2), listOf(5, 8, 4, 5))
        kotlin.test.assertContentEquals(exp, pathSum)
    }

    @Test
    fun test2() {
        val pathSum = target.pathSum(buildTree(arrayListOf(1, 2, 3)), 5)
        println(pathSum)
        val exp = emptyList<List<Int>>()
        kotlin.test.assertContentEquals(exp, pathSum)
    }

    @Test
    fun test3() {
        val pathSum = target.pathSum(buildTree(arrayListOf(1, 2)), 5)
        println(pathSum)
        val exp = emptyList<List<Int>>()
        kotlin.test.assertContentEquals(exp, pathSum)
    }

    fun buildTree(values: List<Int?>): PathSumII113.TreeNode? {
        if (values.isEmpty() || values[0] == null) return null

        val root = PathSumII113.TreeNode(values[0]!!)
        val queue: Queue<PathSumII113.TreeNode> = LinkedList()
        queue.add(root)

        var i = 1
        while (i < values.size) {
            val current = queue.poll()

            // Process left child
            if (values[i] != null) {
                current.left = PathSumII113.TreeNode(values[i]!!)
                queue.add(current.left)
            }
            i++

            // Process right child
            if (i < values.size && values[i] != null) {
                current.right = PathSumII113.TreeNode(values[i]!!)
                queue.add(current.right)
            }
            i++
        }
        return root
    }
}