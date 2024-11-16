package leetcode.medium.linked_list

//Given the head of a linked list, rotate the list to the right by k places.
class RotateList61 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "ListNode(val=$`val`, next=${next ?: "null"})"
        }
    }

    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head?.next == null || k == 0) {
            return head
        }
        val fake = ListNode(-101)
        fake.next = head

        var kk = 0
        var right = head

        while (kk < k && right != null) {
            right = right.next
            kk++
        }

        // if k > length then re-init pointers and k
        if (right == null) {
            right = head
            kk = k % kk
            if (kk == 0) return head
            for (i in 0 until kk) {
                right = right!!.next
            }
        }

        var left = head
        while (right!!.next != null) {
            left = left!!.next
            right = right.next
        }

        val tmp = fake.next
        fake.next = left!!.next
        left.next = null
        right.next = tmp

        return fake.next
    }
}