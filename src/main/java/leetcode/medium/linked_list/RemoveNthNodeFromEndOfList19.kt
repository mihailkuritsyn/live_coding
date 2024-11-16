package leetcode.medium.linked_list

//Given the head of a linked list, remove the nth node from the end of the list and return its head.
class RemoveNthNodeFromEndOfList19 {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "ListNode(val=$`val`, next=${next ?: "null"})"
        }
    }

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head!!.next == null) return null
        val fake = ListNode(0)
        fake.next = head

        var l: ListNode? = fake
        var r: ListNode? = fake
        for (i in 0..n - 1) {
            r = r!!.next
        }
        while (r!!.next != null) {
            l = l!!.next
            r = r.next
        }
        l!!.next = l.next!!.next
        return fake.next
    }

//    todo this solution requires additional memory
//    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
//        if (head!!.next == null) return null
//        val fake = ListNode(0)
//        fake.next = head
//
//        val nodes = mutableListOf(fake)
//        var curr = head
//        while (curr != null) {
//            nodes.add(curr)
//            curr = curr.next
//        }
//
//        val ind = nodes.size - n
//        nodes[ind - 1].next = nodes[ind].next
//
//        return fake.next
//    }
}