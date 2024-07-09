package leetcode.easy.bin_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree637 {
  // Given the root of a binary tree, return the average value
  // of the nodes on each level in the form of an array.
  // Answers within 10-5 of the actual answer will be accepted.


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

  // best perf/memory
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> res = new ArrayList<>();
    Queue<TreeNode> layer = new LinkedList<>();
    layer.add(root);
    while (!layer.isEmpty()) {
      double currSum = 0D;

      int size = layer.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = layer.poll();
        currSum += node.val;
        if (node.left != null) {
          layer.add(node.left);
        }
        if (node.right != null) {
          layer.add(node.right);
        }
      }
      res.add(currSum / size);
    }
    return res;
  }

  // best memory
//  public List<Double> averageOfLevels(TreeNode root) {
//    List<Double> res = new ArrayList<>();
//    List<TreeNode> layer = new ArrayList<>();
//    layer.add(root);
//    while (!layer.isEmpty()) {
//      double currSum = 0D;
//
//      int size = layer.size();
//      for (int i = 0; i < size; i++) {
//        TreeNode node = layer.get(0);
//        currSum += node.val;
//        layer.remove(0);
//        if (node.left != null) {
//          layer.add(node.left);
//        }
//        if (node.right != null) {
//          layer.add(node.right);
//        }
//      }
//      res.add(currSum / size);
//    }
//    return res;
//  }
}
