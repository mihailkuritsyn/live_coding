package leetcode.medium.linked_list

class ReverseLinkedListII92 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
        override fun toString(): String {
            return "ListNode(val=$`val`, next=${next ?: "null"})"
        }
    }

    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (head!!.next == null || left == right) {
            return head
        }
        val dummy = ListNode(0)
        dummy.next = head

        var curr: ListNode? = dummy
        for (i in 1..left - 1) {
            curr = curr!!.next!!
        }
        val leftEnd = curr
        curr = curr!!.next!!

        var prev: ListNode? = null
        var tmp: ListNode?
        for (i in 0..right - left) {
            tmp = curr?.next
            curr!!.next = prev
            prev = curr
            curr = tmp
        }
        val rightEnd = leftEnd!!.next

        leftEnd.next = prev
        rightEnd!!.next = curr

        return dummy.next
    }

//    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
//        if (head!!.next == null || left == right) {
//            return head
//        }
//        val nodes = mutableListOf<ListNode>()
//        var curr = head
//        while (curr != null) {
//            nodes.add(curr)
//            curr = curr.next
//        }
//        var l = left - 1
//        var r = right - 1
//        while (l < r) {
//            if (l - 1 >= 0) {
//                nodes[l - 1].next = nodes[r]
//            }
//            nodes[l].next = nodes[r].next
//
//            if (l + 1 == r) {
//                nodes[r].next = nodes[l]
//            } else {
//                nodes[r - 1].next = nodes[l]
//                nodes[r].next = nodes[l + 1]
//            }
//            val tmp = nodes[l]
//            nodes[l] = nodes[r]
//            nodes[r] = tmp
//            l++
//            r--
//        }
//        return nodes[0]
//    }
}