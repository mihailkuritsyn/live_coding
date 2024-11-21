package leetcode.easy.bin_tree

import leetcode.easy.bin_tree.SymmetricTree101.TreeNode
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SymmetricTree101Test {

    val target = SymmetricTree101()

    @Test
    fun test1() {
//        1
//     2      2
//    3  4   4  3
        val values: List<Int?> = arrayListOf(1, 2, 2, 3, 4, 4, 3)
        val root = buildTree(values)
        assertTrue(target.isSymmetric(root))
    }

    @Test
    fun test2() {
//        1
//     2      2
//       3      3
        val values: List<Int?> = arrayListOf(1, 2, 2, null, 3, null, 3)
        val root = buildTree(values)
        assertFalse(target.isSymmetric(root))
    }

    @Test
    fun test3() {
//             3
//           4      4
//          5  n    n  5
//        6  n        n  6
        val values: List<Int?> = arrayListOf(3, 4, 4, 5, null, null, 5, 6, null, null, 6)
        val root = buildTree(values)
        assertTrue(target.isSymmetric(root))
    }

    @Test
    fun test4() {
//              1
//           2       2
//         2  n    2
        val values: List<Int?> = arrayListOf(1, 2, 2, 2, null, 2, null)
        val root = buildTree(values)
        assertFalse(target.isSymmetric(root))
    }

    @Test
    fun test5() {
        val values: List<Int?> = arrayListOf(1, 0)
        val root = buildTree(values)
        assertFalse(target.isSymmetric(root))
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