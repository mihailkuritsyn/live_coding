package leetcode.medium.bin_search;

public class ValidateBinarySearchTree98 {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left,
        TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  private boolean res = true;
  private long prev = Long.MIN_VALUE;

  public boolean isValidBST(TreeNode root) {
    traverseInOrder(root);
    return res;
  }

  private void traverseInOrder(TreeNode node) {
    if (node != null && res) {
      traverseInOrder(node.left);
      if (prev >= node.val) {
        res = false;
        return;
      }
      prev = node.val;
      traverseInOrder(node.right);
    }
  }
}
