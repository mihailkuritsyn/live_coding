package leetcode.easy.hash

//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//
//Return true if there is a cycle in the linked list. Otherwise, return false.

class LinkedListCycle141 {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun hasCycle(head: ListNode?): Boolean {
        if (head?.next == null) {
            return false
        }
        var first = head
        var second = head
        while (first != null && second != null) {
            first = first.next
            second = second.next?.next
            if (first == second) return true
        }
        return false
    }

}