package leetcode.medium.bin_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal103 {
// Given the root of a binary tree, return the zigzag level order
// traversal of its nodes' values.
// (i.e., from left to right, then right to left for
// the next level and alternate between).

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

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    boolean isLeftToRight = true;
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      int[] layer = new int[size];
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (isLeftToRight) {
          layer[i] = node.val;
        } else {
          layer[size - i - 1] = node.val;
        }
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      ArrayList<Integer> tmp = new ArrayList<>(size);
      for (Integer item : layer) {
        tmp.add(item);
      }
      res.add(tmp);
      isLeftToRight = !isLeftToRight;
    }
    return res;
  }

}
