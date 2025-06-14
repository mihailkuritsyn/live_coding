package leetcode.easy.linked_list

class ReverseLinkedList206 {
    class ListNode(var v: Int) {
        var next: ListNode? = null
        override fun toString(): String {
            return "ListNode(val=$v, next=${next ?: "null"})"
        }
    }

    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null
        if (head.next == null) return head

        var prev: ListNode? = null
        var curr = head
        var tmp: ListNode?
        while (curr?.next != null) {
            tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
        }
        curr?.next = prev
        return curr
    }
}