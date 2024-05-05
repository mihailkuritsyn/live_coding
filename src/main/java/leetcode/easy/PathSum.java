package leetcode.easy;

public class PathSum {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    targetSum -= root.val;
    if (targetSum == 0 && root.left == null && root.right == null) {
      return true;
    }
    return root.left != null && traverse(root.left, targetSum) ||
        root.right != null && traverse(root.right, targetSum);
  }

  public boolean traverse(TreeNode node, int targetSum) {
    targetSum -= node.val;
    if (node.left == null && node.right == null) {
      return targetSum == 0;
    }
    if (node.left != null && node.right != null) {
      return traverse(node.left, targetSum) || traverse(node.right, targetSum);
    }
    if (node.left != null) {
      return traverse(node.left, targetSum);
    }
    return traverse(node.right, targetSum);
  }
}
