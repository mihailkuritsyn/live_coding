package leetcode.easy.bin_tree

import leetcode.easy.bin_tree.BalancedBinaryTree110.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class BalancedBinaryTree110Test {
    val target = BalancedBinaryTree110()

    @Test
    fun test1() {
        val root = TreeNode(
            3,
            TreeNode(9),
            TreeNode(
                20,
                TreeNode(15),
                TreeNode(7)
            )
        )
        assertTrue(target.isBalanced(root))
    }

    @Test
    fun test2() {
        val root = TreeNode(
            1,
            TreeNode(
                2,
                TreeNode(
                    3,
                    TreeNode(4),
                    TreeNode(4)
                ),
                TreeNode(3)
            ),
            TreeNode(2)
        )
        assertFalse(target.isBalanced(root))
    }

    @Test
    fun test3() {
//        [1,
//        2,       2,
//     3, null,    null,3,
//   4,null,          null,4]
        val root = TreeNode(
            1,
            TreeNode(
                2,
                TreeNode(
                    3,
                    TreeNode(4),
                    null
                ),
                null
            ),
            TreeNode(
                2,
                null,
                TreeNode(
                    3,
                    null,
                    TreeNode(4)
                )
            )
        )
        assertFalse(target.isBalanced(root))
    }

}