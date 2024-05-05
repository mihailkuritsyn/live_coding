package leetcode.hard;

public class BinaryTreeMaximumPathSum124 {
// A path in a binary tree is a sequence of nodes where each pair of adjacent nodes 
// in the sequence has an edge connecting them. 
// A node can only appear in the sequence at most once. 
// Note that the path does not need to pass through the root.
//
// The path sum of a path is the sum of the node's values in the path.
//
// Given the root of a binary tree, return the maximum path sum of any non-empty path.

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

  private int answer = 0;

  public int maxPathSum(TreeNode root) {
    if (root == null) {
      return 0;
    }
    answer = root.val;
    traverse(root);
    return answer;
  }

  public int traverse(TreeNode node) {
    if (node == null) {
      return 0;
    }
    int maxLeftPath = Math.max(traverse(node.left), 0);
    int maxRightPath = Math.max(traverse(node.right), 0);

    answer = Math.max(answer, node.val + maxLeftPath + maxRightPath);

    return node.val + Math.max(maxLeftPath, maxRightPath);
  }
}
