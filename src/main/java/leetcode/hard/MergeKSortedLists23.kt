package leetcode.hard

class MergeKSortedLists23 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "ListNode(val=$`val`, next=${next ?: "null"})"
        }
    }

    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        }
        if (lists.size == 1) {
            return lists[0]
        }
        var res = lists.toList()
        while (res.size != 1) {
            val tmp = mutableListOf<ListNode?>()
            for (i in res.indices step 2) {
                if (i + 1 > res.size - 1) {
                    tmp.add(res[i])
                    continue
                }
                tmp.add(mergeTwoLists(res[i], res[i + 1]))
            }
            res = tmp
        }
        return res[0]
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

//    todo not works for negative numbers, need rework
//    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
//        val arr = IntArray(10000)
//        for (list in lists) {
//            var curr = list
//            while (curr != null) {
//                arr[curr.`val`] += 1
//                curr = curr.next
//            }
//        }
//        var res: ListNode? = null
//        var curr: ListNode? = null
//        for (i in arr.indices) {
//            for (j in 0 until arr[i]) {
//                if (curr == null) {
//                    curr = ListNode(i)
//                    res = curr
//                } else {
//                    val toAdd = ListNode(i)
//                    curr.next = toAdd
//                    curr = toAdd
//                }
//            }
//        }
//        return res
//    }
}