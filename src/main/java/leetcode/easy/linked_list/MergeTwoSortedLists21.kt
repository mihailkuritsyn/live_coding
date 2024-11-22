package leetcode.easy.linked_list

//You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.
class MergeTwoSortedLists21 {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "ListNode(val=$`val`, next=${next ?: "null"})"
        }
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val fake = ListNode(-101)
        var curr = fake
        var l1 = list1
        var l2 = list2
        while (l1 != null && l2 != null) {
            if (l1.`val` <= l2.`val`) {
                curr.next = l1
                l1 = l1.next
            } else {
                curr.next = l2
                l2 = l2.next
            }
            curr = curr.next!!
        }
        if (l1 == null) {
            curr.next = l2
        } else {
            curr.next = l1
        }
        return fake.next
    }
}