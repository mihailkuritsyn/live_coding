package leetcode.medium.bin_search;

public class KthSmallestElementInaBST230 {

  // Given the root of a binary search tree, and an integer k, return the kth smallest
// value (1-indexed) of all the values of the nodes in the tree.
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

  private int counter;
  private int res;

  public int kthSmallest(TreeNode root, int k) {
    counter = k;
    traverseInOrder(root);
    return res;
  }

  private void traverseInOrder(TreeNode node) {
    if (node != null) {
      traverseInOrder(node.left);
      counter--;
      if (counter == 0) {
        res = node.val;
        return;
      }
      traverseInOrder(node.right);
    }
  }
}
