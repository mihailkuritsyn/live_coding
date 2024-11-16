package leetcode.medium.linked_list

//Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
class RemoveDuplicatesFromSortedListII82 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "ListNode(val=$`val`, next=${next ?: "null"})"
        }
    }

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        val fake = ListNode(-101)
        fake.next = head

        var l: ListNode? = fake
        var r: ListNode? = head
        while (r != null && r.next != null) {
            if (l!!.`val` < r.`val` && r.`val` < r.next!!.`val`) {
                l = r
                r = r.next
            } else {
                val v = r.`val`
                var newR = r.next
                while (newR != null && newR.`val` == v) {
                    newR = newR.next
                }
                l.next = newR
                r = newR
            }
        }
        return fake.next
    }
}