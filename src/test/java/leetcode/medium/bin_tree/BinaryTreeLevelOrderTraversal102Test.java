package leetcode.medium.bin_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import leetcode.medium.bin_tree.BinaryTreeLevelOrderTraversal102.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeLevelOrderTraversal102Test {

  BinaryTreeLevelOrderTraversal102 target = new BinaryTreeLevelOrderTraversal102();

  @Test
  void test1() {
    TreeNode root = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20,
            new TreeNode(15),
            new TreeNode(7)
        )
    );
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(3),
        Arrays.asList(9, 20),
        Arrays.asList(15, 7)
    );
    Assertions.assertEquals(expected, target.levelOrder(root));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(1);
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(1)
    );
    Assertions.assertEquals(expected, target.levelOrder(root));
  }

  @Test
  void test3() {
    TreeNode root = null;
    List<List<Integer>> expected = new ArrayList<>();
    Assertions.assertEquals(expected, target.levelOrder(root));
  }
}