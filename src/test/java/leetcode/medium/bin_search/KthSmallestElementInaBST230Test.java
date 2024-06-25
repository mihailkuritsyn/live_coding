package leetcode.medium.bin_search;

import leetcode.medium.bin_search.KthSmallestElementInaBST230.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthSmallestElementInaBST230Test {

  private KthSmallestElementInaBST230 target = new KthSmallestElementInaBST230();

  @Test
  void test1() {
    TreeNode root = new TreeNode(3,
        new TreeNode(1,
            null,
            new TreeNode(2)
        ),
        new TreeNode(4)
    );
    Assertions.assertEquals(1, target.kthSmallest(root, 1));
  }

  @Test
  void test3() {
    TreeNode root = new TreeNode(5,
        new TreeNode(3,
            new TreeNode(2,
                new TreeNode(1),
                null
            ),
            new TreeNode(4)
        ),
        new TreeNode(6)
    );
    Assertions.assertEquals(3, target.kthSmallest(root, 3));
  }
}