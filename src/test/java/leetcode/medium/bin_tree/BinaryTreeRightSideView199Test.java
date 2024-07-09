package leetcode.medium.bin_tree;

import java.util.ArrayList;
import java.util.Arrays;
import leetcode.medium.bin_tree.BinaryTreeRightSideView199.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeRightSideView199Test {

  private BinaryTreeRightSideView199 target = new BinaryTreeRightSideView199();

  @Test
  void test1() {
    TreeNode root = new TreeNode(1,
        new TreeNode(2,
            null,
            new TreeNode(5)
        ),
        new TreeNode(3,
            null,
            new TreeNode(4)
        )
    );
    Assertions.assertEquals(Arrays.asList(1, 3, 4), target.rightSideView(root));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(1,
        null,
        new TreeNode(3)
    );
    Assertions.assertEquals(Arrays.asList(1, 3), target.rightSideView(root));
  }

  @Test
  void test3() {
    TreeNode root = null;
    Assertions.assertEquals(new ArrayList<>(), target.rightSideView(root));
  }
}