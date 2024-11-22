package leetcode.medium.linked_list

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
class AddTwoNumbers2Kotlin {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "ListNode(val=$`val`, next=${next ?: "null"})"
        }
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) return null
        var first = l1
        var second = l2
        val fake = ListNode(0)
        var curr = fake

        var remember = 0
        while (first != null || second != null) {
            val fistVal = if (first == null) 0 else first.`val`
            val secondVal = if (second == null) 0 else second.`val`

            val sum = fistVal + secondVal + remember
            val newOne = ListNode(sum % 10)
            remember = if (sum >= 10) 1 else 0
            curr.next = newOne

            curr = newOne
            first = first?.next
            second = second?.next
        }

        if (remember != 0) {
            curr.next = ListNode(remember)
        }
        return fake.next
    }
}