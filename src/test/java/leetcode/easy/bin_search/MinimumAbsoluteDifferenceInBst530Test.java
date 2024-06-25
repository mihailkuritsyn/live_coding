package leetcode.easy.bin_search;

import leetcode.easy.bin_search.MinimumAbsoluteDifferenceInBst530.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumAbsoluteDifferenceInBst530Test {

  private MinimumAbsoluteDifferenceInBst530 target = new MinimumAbsoluteDifferenceInBst530();

  @Test
  void test1() {
    TreeNode root = new TreeNode(4,
        new TreeNode(2,
            new TreeNode(1),
            new TreeNode(3)
        ),
        new TreeNode(6)
    );
    Assertions.assertEquals(1, target.getMinimumDifference(root));
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(1,
        new TreeNode(0),
        new TreeNode(48,
            new TreeNode(12),
            new TreeNode(49)
        )
    );
    Assertions.assertEquals(1, target.getMinimumDifference(root));
  }

  @Test
  void test3() {
    TreeNode root = new TreeNode(236,
        new TreeNode(104,
            null,
            new TreeNode(227)
        ),
        new TreeNode(701,
            null,
            new TreeNode(911)
        )
    );
    Assertions.assertEquals(9, target.getMinimumDifference(root));
  }

  @Test
  void test4() {
    TreeNode root = new TreeNode(0,
        null,
        new TreeNode(100000)
    );
    Assertions.assertEquals(100000, target.getMinimumDifference(root));
  }
}