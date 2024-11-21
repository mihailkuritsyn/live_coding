package leetcode.easy.bin_tree

import kotlin.math.abs

//Given a binary tree, determine if it is height-balanced
class BalancedBinaryTree110 {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        constructor(value: Int, left: TreeNode?, right: TreeNode?) : this(value) {
            this.left = left
            this.right = right
        }
    }

    private var balanced = true

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null || (root.left == null && root.right == null))
            return true
        dfs(root)
        return balanced
    }

    private fun dfs(node: TreeNode?): Int {
        if (node == null) return 0
        val leftH = dfs(node.left)
        val rightH = dfs(node.right)
        if (abs(leftH - rightH) > 1) {
            balanced = false
        }
        return 1 + leftH.coerceAtLeast(rightH)
    }
}