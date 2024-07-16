package leetcode.medium.bin_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import leetcode.medium.bin_tree.BinaryTreeZigzagLevelOrderTraversal103.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeZigzagLevelOrderTraversal103Test {

  BinaryTreeZigzagLevelOrderTraversal103 target = new BinaryTreeZigzagLevelOrderTraversal103();

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
        Arrays.asList(20, 9),
        Arrays.asList(15, 7)
    );
    Assertions.assertEquals(expected, target.zigzagLevelOrder(root));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(3,
        new TreeNode(9,
            new TreeNode(0),
            new TreeNode(1)
        ),
        new TreeNode(20,
            new TreeNode(15),
            new TreeNode(7)
        )
    );
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(3),
        Arrays.asList(20, 9),
        Arrays.asList(0, 1, 15, 7)
    );
    Assertions.assertEquals(expected, target.zigzagLevelOrder(root));
  }

  @Test
  void test3() {
    TreeNode root = new TreeNode(1);
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(1)
    );
    Assertions.assertEquals(expected, target.zigzagLevelOrder(root));
  }

  @Test
  void test4() {
    List<List<Integer>> expected = new ArrayList<>();
    Assertions.assertEquals(expected, target.zigzagLevelOrder(null));
  }
}