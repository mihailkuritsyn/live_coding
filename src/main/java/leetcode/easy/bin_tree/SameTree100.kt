package leetcode.easy.bin_tree

//Given the roots of two binary trees p and q, write a function to check if they are the same or not.
//
//Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
class SameTree100 {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        constructor(value: Int, left: TreeNode?, right: TreeNode?) : this(value) {
            this.left = left
            this.right = right
        }
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return dfs(p, q)
    }

    fun dfs(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left == null || right == null) return false
        return (left.`val` == right.`val` &&
                dfs(left.left, right.left) &&
                dfs(left.right, right.right))
    }
}