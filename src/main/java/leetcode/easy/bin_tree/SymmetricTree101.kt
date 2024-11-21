package leetcode.easy.bin_tree

// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
class SymmetricTree101 {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        constructor(value: Int, left: TreeNode?, right: TreeNode?) : this(value) {
            this.left = left
            this.right = right
        }
    }

    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true
        return dfs(root.left, root.right)
    }

    fun dfs(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left == null || right == null) return false

        return (left.`val` == right.`val` &&
                dfs(left.left, right.right) &&
                dfs(left.right, right.left))
    }

//    fun isSymmetric(root: TreeNode?): Boolean {
//        if (root == null) return true
//
//        val leftList = ArrayList<Int?>();
//        bfsL(root.left, leftList)
//
//        val rightList = ArrayList<Int?>();
//        bfsR(root.right, rightList)
//
//        return leftList == rightList;
//    }
//
//    fun bfsL(node: TreeNode?, list: ArrayList<Int?>) {
//        val queue = LinkedList<TreeNode?>()
//        queue.add(node)
//        while (!queue.isEmpty()) {
//            val curr = queue.poll()
//            list.add(curr?.`val`)
//            if (curr == null) {
//                continue
//            }
//            queue.add(curr.left)
//            queue.add(curr.right)
//        }
//    }
//
//    fun bfsR(node: TreeNode?, list: ArrayList<Int?>) {
//        val queue = LinkedList<TreeNode?>()
//        queue.add(node)
//        while (!queue.isEmpty()) {
//            val curr = queue.poll()
//            list.add(curr?.`val`)
//            if (curr == null) {
//                continue
//            }
//            queue.add(curr.right)
//            queue.add(curr.left)
//        }
//    }

//    fun isSymmetric(root: TreeNode?): Boolean {
//        if (root == null) return true
//        var layerSize = 1
//        var qSize = 1
//        val queue = LinkedList<TreeNode>()
//        queue.add(root)
//        while (!queue.isEmpty()) {
//            layerSize *= 2
//            val layer = arrayOfNulls<TreeNode?>(layerSize)
//            var j = 0
//            for (i in 0 until qSize) {
//                val curr = queue.poll()
//                layer[j] = curr.left
//                j++
//                layer[j] = curr.right
//                j++
//                if (curr.left != null) {
//                    queue.add(curr.left!!)
//                }
//                if (curr.right != null) {
//                    queue.add(curr.right!!)
//                }
//            }
//            for (i in layer.indices) {
//                if (layer[i]?.`val` != layer[layerSize - 1 - i]?.`val`) {
//                    return false
//                }
//            }
//            qSize = queue.size
//        }
//        return true
//    }
}