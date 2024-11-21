package leetcode.medium.linked_list

// Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
//
//Implement the LRUCache class:
//
//LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
//int get(int key) Return the value of the key if the key exists, otherwise return -1.
//void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
//The functions get and put must each run in O(1) average time complexity.
class LruCache146 {

    class LRUCache(val capacity: Int) {

        class ListNode(var key: Int, var value: Int) {
            var next: ListNode? = null
            var prev: ListNode? = null

            override fun toString(): String {
                return "ListNode(key=$key ,value=$value)"
            }
        }

        var left: ListNode? = null
        var right: ListNode? = null
        val hMap = HashMap<Int, ListNode>(capacity)

        fun get(key: Int): Int {
            val existed: ListNode = hMap[key] ?: return -1
            if (left != existed) {
                setMostRecent(existed)
            }
            return existed.value
        }

        fun put(key: Int, value: Int) {
            if (hMap.containsKey(key)) {
                val existed: ListNode = hMap[key]!!
                if (left != existed) {
                    setMostRecent(existed)
                }
                existed.value = value
            } else {
                val newLeft = ListNode(key, value)
                newLeft.next = left
                left?.prev = newLeft
                left = newLeft
                if (hMap.size == capacity) {
                    evictLru()
                } else if (hMap.size == 0) {
                    right = left
                }
                hMap.put(key, newLeft)
            }
        }

        private fun evictLru() {
            hMap.remove(right!!.key)
            val beforeRight = right!!.prev
            right!!.prev = null
            right = beforeRight
            right!!.next = null
        }

        private fun setMostRecent(existed: ListNode) {
            if (existed.next == null) {
                right = existed.prev
            }
            existed.next?.prev = existed.prev
            existed.prev?.next = existed.next

            existed.next = left
            left!!.prev = existed
            existed.prev = null

            left = existed
        }
    }
}