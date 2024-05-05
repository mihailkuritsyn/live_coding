package leetcode.hard;

import leetcode.hard.BinaryTreeMaximumPathSum124.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeMaximumPathSum124Test {

  private final BinaryTreeMaximumPathSum124 target = new BinaryTreeMaximumPathSum124();

  @Test
  void test1() {
    TreeNode root = new TreeNode(-10,
        new TreeNode(9),
        new TreeNode(20,
            new TreeNode(-3,
                new TreeNode(5,
                    new TreeNode(-2),
                    null),
                new TreeNode(-4)),
            new TreeNode(8,
                null,
                new TreeNode(-2))));

    // 5 - 3 + 20 + 8 = 30
    Assertions.assertEquals(30, target.maxPathSum(root));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(1,
        new TreeNode(2),
        new TreeNode(3));

    Assertions.assertEquals(6, target.maxPathSum(root));
  }

  @Test
  void test3() {
    TreeNode root = new TreeNode(-10,
        new TreeNode(9),
        new TreeNode(20,
            new TreeNode(15),
            new TreeNode(7)));
    //Output: 42
    //Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
    Assertions.assertEquals(42, target.maxPathSum(root));
  }

  @Test
  void test4() {
    TreeNode root = new TreeNode(-3);

    Assertions.assertEquals(-3, target.maxPathSum(root));
  }

  @Test
  void test5() {
    TreeNode root = new TreeNode(-2, new TreeNode(-1), null);

    Assertions.assertEquals(-1, target.maxPathSum(root));
  }
}