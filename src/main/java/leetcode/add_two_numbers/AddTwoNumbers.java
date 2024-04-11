package leetcode.add_two_numbers;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class AddTwoNumbers {

  public static void main(String[] args) {
    AddTwoNumbers obj = new AddTwoNumbers();

    //    l1 = [2,4,3], l2 = [5,6,4]
//    ListNode three = new ListNode(3);
//    ListNode four = new ListNode(4, three);
//    ListNode l1 = new ListNode(2, four);
//    int[] l1arr = new int[]{2, 4, 3};
    int[] l1arr = new int[]{9};
    ListNode l1 = obj.createList(l1arr);

//    ListNode four2 = new ListNode(4);
//    ListNode six = new ListNode(6, four2);
//    ListNode l2 = new ListNode(5, six);
    int[] l2arr = new int[]{9, 9};
//    int[] l2arr = new int[]{5, 6, 4};
    ListNode l2 = obj.createList(l2arr);

    ListNode twoSum = obj.addTwoNumbers(l1, l2);
    System.out.println(twoSum);
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int twoSum = l1.val + l2.val;
    int remember = twoSum >= 10 ? 1 : 0;
    if (l1.next == null && l2.next == null) {
      if (twoSum >= 10) {
        return new ListNode(twoSum % 10, new ListNode(1));
      } else {
        return new ListNode(twoSum);
      }
    } else if (l1.next == null) {
      return new ListNode(twoSum % 10, addTwoNumbers(new ListNode(remember), l2.next));
    } else if (l2.next == null) {
      return new ListNode(twoSum % 10, addTwoNumbers(l1.next, new ListNode(remember)));
    }
    l1.next.val += remember;
    return new ListNode(twoSum % 10, addTwoNumbers(l1.next, l2.next));
  }

  public ListNode createList(int[] listArray) {
    int lastIndex = listArray.length - 1;
    ListNode result = new ListNode(listArray[lastIndex]);
    for (int i = listArray.length - 2; i >= 0; i--) {
      result = new ListNode(listArray[i], result);
    }
    return result;
  }

//  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    int twoSum = l1.val + l2.val;
//    if (l1.next == null && l2.next == null) {
//      if (twoSum >= 10) {
//        return new ListNode(twoSum % 10, new ListNode(1));
//      } else {
//        return new ListNode(twoSum);
//      }
//    }
//    ListNode l1NextVal = l1.next == null ? new ListNode(0) : l1.next;
//    ListNode l2NextVal = l2.next == null ? new ListNode(0) : l2.next;
//    if (twoSum >= 10) {
//      l1NextVal.val = l1NextVal.val + 1;
//    }
//    return new ListNode(twoSum % 10, addTwoNumbers(l1NextVal, l2NextVal));
//  }

}
