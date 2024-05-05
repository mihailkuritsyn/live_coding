package leetcode.binary_tree;

public class ConvertSortedArrayToBinarySearchTree {

  public static void main(String[] args) {
//    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//    int[] nums = {-10, -3, 0, 5, 9};
//    int[] nums = {1, 3};
    int[] nums = {1};
    TreeNode treeNode = new Solution().sortedArrayToBST(nums);
    System.out.println(treeNode);
  }

  static class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
      if (nums.length == 1) {
        return new TreeNode(nums[0]);
      }
      int middle = nums.length / 2;

      TreeNode root = new TreeNode(nums[middle]);
      root.left = toBst(root, nums, 0, middle - 1);
      root.right = toBst(root, nums, middle + 1, nums.length);

      return root;
    }

    private TreeNode toBst(TreeNode root, int[] nums, int left, int right) {
      int middle = left + (right - left) / 2;
      if (middle >= nums.length) {
        return null;
      }
      TreeNode node = new TreeNode(nums[middle]);
      if (middle > left) {
        node.left = toBst(root, nums, left, middle - 1);
      }
      if (middle < right) {
        node.right = toBst(root, nums, middle + 1, right);
      }
      return node;
    }
  }

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      System.out.println(val);
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      if (left != null) {
        sb.append("left = ").append(left).append(" ");
      }
      sb.append(val).append(" ");
      if (right != null) {
        sb.append("right = ").append(right).append(" ");
      }
      return sb.toString();
    }
  }
}
