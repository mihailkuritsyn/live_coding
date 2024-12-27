package leetcode.medium.bin_tree

//You are given the root of a binary tree containing digits from 0 to 9 only.
//
//Each root-to-leaf path in the tree represents a number.
//
//For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
//Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
//
//A leaf node is a node with no children.
class SumRootToLeafNumbers129 {

    var res = 0

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun sumNumbers(root: TreeNode?): Int {
        if (root!!.left == null && root.right == null) return root!!.`val`

        dfs(root, 0)
        return res
    }

    fun dfs(node: TreeNode?, sum: Int) {
        if (node == null) {
            return
        }
        val ns = sum * 10 + node.`val`
        if (node.left == null && node.right == null) {
            res += ns
        }
        dfs(node.left, ns)
        dfs(node.right, ns)
    }
}