package leetcode.easy.bin_search;

public class MinimumAbsoluteDifferenceInBst530 {
//Given the root of a Binary Search Tree (BST), return the minimum
// absolute difference between the values of any two different nodes
// in the tree.

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

  private int res = 100000;
  private Integer prev = null;

  public int getMinimumDifference(TreeNode root) {
    traverseInOrder(root);
    return res;
  }

  private void traverseInOrder(TreeNode node) {
    if (node != null) {
      traverseInOrder(node.left);
      if (prev != null) {
        res = Math.min(res, node.val - prev);
      }
      prev = node.val;
      traverseInOrder(node.right);
    }
  }

//  public int getMinimumDifference(TreeNode root) {
//    List<Integer> nums = new ArrayList<>();
//
//    int res = 100000;
//    Integer prev = null;
//    Stack<TreeNode> stack = new Stack<>();
//    TreeNode current = root;
//    while (current != null || !stack.isEmpty()) {
//      while (current != null) {
//        stack.push(current);
//        current = current.left;
//      }
//      TreeNode top = stack.pop();
//
//      if (prev != null) {
//        res = Math.min(res, top.val - prev);
//      }
//      prev = top.val;
//
//      current = top.right;
//    }
//    return res;
//  }
}
