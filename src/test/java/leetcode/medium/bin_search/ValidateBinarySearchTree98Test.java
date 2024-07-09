package leetcode.medium.bin_search;

import leetcode.medium.bin_search.ValidateBinarySearchTree98.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTree98Test {

  private ValidateBinarySearchTree98 target = new ValidateBinarySearchTree98();

  @Test
  void test1() {
    TreeNode root = new TreeNode(2,
        new TreeNode(1),
        new TreeNode(3)
    );
    Assertions.assertTrue(target.isValidBST(root));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(5,
        new TreeNode(1),
        new TreeNode(4,
            new TreeNode(3),
            new TreeNode(6))
    );
    Assertions.assertFalse(target.isValidBST(root));
  }

  @Test
  void test3() {
    TreeNode root = new TreeNode(2,
        new TreeNode(2),
        new TreeNode(2)
    );
    Assertions.assertFalse(target.isValidBST(root));
  }

  @Test
  void test4() {
    TreeNode root = new TreeNode(-2147483648);
    Assertions.assertTrue(target.isValidBST(root));
  }

  @Test
  void test5() {
    TreeNode root = new TreeNode(1,
        new TreeNode(-2147483648),
        new TreeNode(2)
    );
    Assertions.assertTrue(target.isValidBST(root));
  }
}