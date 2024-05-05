package leetcode.easy.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

class Solution {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    handleNode(root, result);
    return result;
  }

  private void handleNode(TreeNode node, List<Integer> values) {
    if (node != null) {
      handleNode(node.left, values);
      values.add(node.val);
      handleNode(node.right, values);
    }
  }

  public static void main(String[] args) {
    TreeNode right = new TreeNode(2, new TreeNode(3), null);
    TreeNode root = new TreeNode(1, null, right);
    Solution solution = new Solution();
    List<Integer> result = solution.inorderTraversal(root);
    System.out.println(result);
  }
}