package leetcode.medium.two_pointers

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class PartitionLabels763Test {
    val target = PartitionLabels763()

    @Test
    fun test1() {
//        ababcbaca defegdehijhklij
//      a 012345678
//      b  12345
//      c     4567
//-     d           9   14
//      e            10   15
//      f             11
//      g               13
//-     h                  16   19
//      i                   17     22
//      j                    18     23
//      k                        20
//      l                          21

        val res = target.partitionLabels("ababcbacadefegdehijhklij")
        assertContentEquals(listOf(9, 7, 8), res)
    }

    @Test
    fun test2() {
        val res = target.partitionLabels("eccbbbbdec")
        assertContentEquals(listOf(10), res)
    }
}