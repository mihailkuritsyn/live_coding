package youtube.lukin;

public class MaxPathSum {

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

  //---------------- lukin solution-----------
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    int maxPath = traverse(root);
    return targetSum == maxPath;
  }

  public int traverse(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return node.val + Math.max(traverse(node.left), traverse(node.right));
  }
}
