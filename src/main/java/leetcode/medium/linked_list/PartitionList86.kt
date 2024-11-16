package leetcode.medium.linked_list

//Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.
class PartitionList86 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "ListNode(val=$`val`, next=${next ?: "null"})"
        }
    }

    fun partition(head: ListNode?, x: Int): ListNode? {
        var leftHead: ListNode? = null
        var rightHead: ListNode? = null
        var left: ListNode? = null
        var rigth: ListNode? = null
        var curr = head
        while (curr != null) {
            if (curr.`val` < x) {
                if (left == null) {
                    left = curr
                    leftHead = left
                } else {
                    left.next = curr
                    left = left.next
                }
            } else {
                if (rigth == null) {
                    rigth = curr
                    rightHead = rigth
                } else {
                    rigth.next = curr
                    rigth = rigth.next
                }
            }
            curr = curr.next
        }
        rigth?.next = null
        return if (left != null) {
            left.next = rightHead
            leftHead
        } else {
            rightHead
        }
    }
}