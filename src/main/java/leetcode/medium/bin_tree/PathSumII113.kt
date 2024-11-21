package leetcode.medium.bin_tree

import java.util.*

//Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
//
//A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
class PathSumII113 {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        constructor(value: Int, left: TreeNode?, right: TreeNode?) : this(value) {
            this.left = left
            this.right = right
        }
    }

    private var res = mutableListOf<List<Int>>()

    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        val path = LinkedList<Int>()
        dfs(root, path, 0, targetSum)
        return res
    }

    fun dfs(node: TreeNode?, path: LinkedList<Int>, curSum: Int, targetSum: Int) {
        if (node == null) {
            return
        }
        path.add(node.`val`)
        val changedSum = curSum + node.`val`

        if (node.left == null && node.right == null) {
            if (changedSum == targetSum) {
                res.add(path.toList())
            }
        }

        dfs(node.left, path, changedSum, targetSum)
        dfs(node.right, path, changedSum, targetSum)
        path.removeLast()
    }
}