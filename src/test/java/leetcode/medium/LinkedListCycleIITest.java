package leetcode.medium;

import leetcode.medium.LinkedListCycleII.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleIITest {

  private final LinkedListCycleII target = new LinkedListCycleII();

  @Test
  void test1() {
    ListNode list = createList(new int[]{3, 2, 0, -4});
    ListNode last = list.next.next.next;
    last.next = list.next;

    ListNode listNode = target.detectCycle(list);
    Assertions.assertEquals(2, listNode.val);
  }

  @Test
  void test2() {
    ListNode list = createList(new int[]{1, 2});
    ListNode last = list.next;
    last.next = list;

    ListNode listNode = target.detectCycle(list);
    Assertions.assertEquals(1, listNode.val);
  }

  @Test
  void test3() {
    ListNode list = new ListNode(1);
    Assertions.assertNull(target.detectCycle(list));
  }

  @Test
  void test4() {
    ListNode list = createList(new int[]{1, 2, 3, 4, 5});
    ListNode last = list.next.next.next.next;
    last.next = list.next.next.next;

    ListNode listNode = target.detectCycle(list);
    Assertions.assertEquals(4, listNode.val);
  }

  @Test
  void test5() {
    Assertions.assertNull(target.detectCycle(null));
  }

  @Test
  void test6() {
    ListNode list = createList(new int[]{-1, -7, 7, -4, 19, 6, -9, -5, -2, -5});
    ListNode last = list.next.next.next.next.next.next.next.next.next;
    last.next = list.next.next.next.next.next.next;

    ListNode listNode = target.detectCycle(list);
    Assertions.assertEquals(-9, listNode.val);
  }

  private static ListNode createList(int[] a) {
    ListNode last = new ListNode(a[a.length - 1]);
    for (int i = a.length - 2; i >= 0; i--) {
      ListNode curr = new ListNode(a[i]);
      curr.next = last;
      last = curr;
    }
    return last;
  }
}