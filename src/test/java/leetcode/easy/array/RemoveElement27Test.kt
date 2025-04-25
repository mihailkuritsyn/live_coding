package leetcode.easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals


class RemoveElement27Test {
    val target = RemoveElement27()

    @Test
    fun test1() {
//     3, 2, 2, 3
//     l        r
//        l     r
//     3, 3, 2, 2
//           lr   if (n[l]==2) return l else return l+1

        val nums: IntArray = intArrayOf(3, 2, 2, 3)
        val expectedNums: IntArray = intArrayOf(3, 3)
        val v = 2

        val k = target.removeElement(nums, v);

        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums, nums.take(k).toIntArray())
    }

    @Test
    fun test2() {
//     0, 1, 2, 2, 3, 0, 4, 2
//     l                    r
//        l                 r
//           l           r
//     0, 1, 4, 2, 3, 0, 2, 2
//              l     r
//     0, 1, 4, 0, 3, 2, 2, 2
//                 lr
        val nums: IntArray = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val expectedNums: IntArray = intArrayOf(0, 1, 3, 0, 4)
        val v = 2

        val k = target.removeElement(nums, v);

        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums, nums.take(k).toIntArray())
    }

    @Test
    fun test3() {
        val nums: IntArray = intArrayOf(1)
        val expectedNums: IntArray = intArrayOf(1)
        val v = 2

        val k = target.removeElement(nums, v);

        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums, nums.take(k).toIntArray())
    }

    @Test
    fun test4() {
//     1 2
//     l r
//       lr
        val nums: IntArray = intArrayOf(1, 2)
        val expectedNums: IntArray = intArrayOf(1)
        val v = 2

        val k = target.removeElement(nums, v);

        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums, nums.take(k).toIntArray())
    }

    @Test
    fun test5() {
//     2 2 2
//     l   r
//     l r
//     lr
        val nums: IntArray = intArrayOf(2, 2, 2)
        val expectedNums: IntArray = intArrayOf()
        val v = 2

        val k = target.removeElement(nums, v);

        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums, nums.take(k).toIntArray())
    }

    @Test
    fun test6() {
//     2 5
//     l r
//     5 5
//     r l
        val nums: IntArray = intArrayOf(2, 5)
        val expectedNums: IntArray = intArrayOf(5)
        val v = 2

        val k = target.removeElement(nums, v);

        assertEquals(expectedNums.size, k)
        assertContentEquals(expectedNums, nums.take(k).toIntArray())
    }
}