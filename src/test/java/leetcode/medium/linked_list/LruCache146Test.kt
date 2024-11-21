package leetcode.medium.linked_list

import leetcode.medium.linked_list.LruCache146.LRUCache
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LruCache146Test {
    var target = LruCache146()

    @Test
    fun test1() {
        val cache = LRUCache(2);
        cache.put(1, 1); // cache is {1=1}
        cache.put(2, 2); // cache is {1=1, 2=2}
        Assertions.assertEquals(1, cache.get(1))

        cache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        Assertions.assertEquals(-1, cache.get(2))

        cache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        cache.get(1);    // return -1 (not found)
        cache.get(3);    // return 3
        Assertions.assertEquals(4, cache.get(4))
    }

    @Test
    fun test2() {
        val cache = LRUCache(2);
        cache.put(2, 1); // cache is {2=1}
        cache.put(2, 2); // cache is {2=2}
        Assertions.assertEquals(2, cache.get(2))

        cache.put(1, 1); // cache is {1=1, 2=1}
        cache.put(4, 2); // cache is {4=2, 1=1}
        Assertions.assertEquals(-1, cache.get(2))
    }

    @Test
    fun test3() {
        val cache = LRUCache(3);
        cache.put(1, 1); // cache is {1=1}
        cache.put(2, 2); // cache is {2=2, 1=1}
        cache.put(3, 3); // cache is {3=3, 2=2, 1=1}
        cache.put(4, 4); // cache is {4=4, 3=3, 2=2}
        Assertions.assertEquals(4, cache.get(4)) //{4=4, 3=3, 2=2}
        Assertions.assertEquals(3, cache.get(3)) //{3=3, 4=4, 2=2}
        Assertions.assertEquals(2, cache.get(2)) //{2=2, 3=3, 4=4}
        Assertions.assertEquals(-1, cache.get(1))

        cache.put(5, 5); // cache is {5=5, 2=2, 3=3}
        Assertions.assertEquals(-1, cache.get(1))
        Assertions.assertEquals(2, cache.get(2))
        Assertions.assertEquals(3, cache.get(3))
        Assertions.assertEquals(-1, cache.get(4))
        Assertions.assertEquals(5, cache.get(5))
    }
}