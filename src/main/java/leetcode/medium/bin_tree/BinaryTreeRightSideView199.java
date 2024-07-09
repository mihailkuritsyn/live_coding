package leetcode.medium.bin_tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView199 {
// Given the root of a binary tree, imagine yourself standing
// on the right side of it, return the values of the nodes you
// can see ordered from top to bottom.

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

  // -------Solution3 with queue------
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (i == 0) {
          res.add(node.val);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
        if (node.left != null) {
          queue.add(node.left);
        }
      }
    }
    return res;
  }

  // -------Solution2 with recursion------
//  public List<Integer> rightSideView(TreeNode root) {
//    List<Integer> res = new ArrayList<>();
//    if (root == null) {
//      return res;
//    }
//    int depth = 0;
//    processLayer(root, res, depth);
//    return res;
//  }

//  private void processLayer(TreeNode node, List<Integer> res, int depth) {
//    if (node == null) {
//      return;
//    }
//    if (res.size() == depth) {
//      res.add(node.val);
//    }
//    processLayer(node.right, res, depth + 1);
//    processLayer(node.left, res, depth + 1);
//  }

  // -------Solution1 without recursion------
//  public List<Integer> rightSideView(TreeNode root) {
//    List<Integer> res = new ArrayList<>();
//    if (root == null) {
//      return res;
//    }
//    List<TreeNode> layer = new ArrayList<>();
//    layer.add(root);
//
//    while (!layer.isEmpty()) {
//      int size = layer.size();
//      res.add(layer.get(size - 1).val);
//
//      List<TreeNode> nextLayer = new ArrayList<>();
//      for (TreeNode node : layer) {
//        if (node.left != null) {
//          nextLayer.add(node.left);
//        }
//        if (node.right != null) {
//          nextLayer.add(node.right);
//        }
//      }
//      layer = nextLayer;
//    }
//    return res;
//  }
}
