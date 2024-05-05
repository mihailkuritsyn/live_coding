package leetcode.easy;

import leetcode.easy.PathSum.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PathSumTest {

  private final PathSum target = new PathSum();

  @Test
  void test1() {
    TreeNode left = new TreeNode(4,
        new TreeNode(11,
            new TreeNode(7), new TreeNode(2)),
        null);

    TreeNode right = new TreeNode(8,
        new TreeNode(13),
        new TreeNode(4,
            null,
            new TreeNode(1)));

    TreeNode root = new TreeNode(5, left, right);
    Assertions.assertTrue(target.hasPathSum(root, 22));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    Assertions.assertFalse(target.hasPathSum(root, 5));
  }

  @Test
  void test3() {
    TreeNode root = new TreeNode(1, new TreeNode(2), null);
    Assertions.assertFalse(target.hasPathSum(root, 1));
  }

  @Test
  void test4() {
    TreeNode root = new TreeNode(1);
    Assertions.assertTrue(target.hasPathSum(root, 1));
  }

  @Test
  void test5() {
    TreeNode left = new TreeNode(2,
        new TreeNode(3,
            new TreeNode(4,
                new TreeNode(5),
                null),
            null),
        null);

    TreeNode right = new TreeNode(8,
        new TreeNode(13),
        new TreeNode(4,
            null,
            new TreeNode(1)));

    TreeNode root = new TreeNode(1, left, null);
    Assertions.assertFalse(target.hasPathSum(root, 22));
  }
}