package leetcode.easy.bin_tree;

import java.util.Arrays;
import leetcode.easy.bin_tree.AverageOfLevelsInBinaryTree637.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AverageOfLevelsInBinaryTree637Test {

  private AverageOfLevelsInBinaryTree637 target = new AverageOfLevelsInBinaryTree637();

  @Test
  void test1() {
    TreeNode root = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20,
            new TreeNode(15),
            new TreeNode(7)
        )
    );
    Assertions.assertEquals(Arrays.asList(3D, 14.5D, 11D), target.averageOfLevels(root));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(3,
        new TreeNode(9,
            new TreeNode(15),
            new TreeNode(7)
        ),
        new TreeNode(20)
    );
    Assertions.assertEquals(Arrays.asList(3D, 14.5D, 11D), target.averageOfLevels(root));
  }

  @Test
  void test3() {
    TreeNode root = new TreeNode(3);
    Assertions.assertEquals(Arrays.asList(3D), target.averageOfLevels(root));
  }

  @Test
  void test4() {
    TreeNode root = new TreeNode(3,
        new TreeNode(3),
        null
    );
    Assertions.assertEquals(Arrays.asList(3D, 3D), target.averageOfLevels(root));
  }
}