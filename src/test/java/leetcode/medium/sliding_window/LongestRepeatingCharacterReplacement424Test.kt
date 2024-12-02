package leetcode.medium.sliding_window

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LongestRepeatingCharacterReplacement424Test {
    val target = LongestRepeatingCharacterReplacement424()

    @Test
    fun test1() {
//        a=2 b=2 k=2
//        abab
//        a         r=0
//        ab        r=1 lc=1
//        aba       l=0 r=2 lc=2
//        abab      l=0 r=3 lc=2
        val res = target.characterReplacement("ABAB", 2)
        assertEquals(4, res)
    }

    @Test
    fun test2() {
        //aababba k=1
        //a        1-1>1 no r=1 res=1
        //ab       2-1>1 no r=2 res=2
        //aab      3-2>1 no r=3 res=3
        //aaba     4-3>1 no r=4 res=4
        //aabab    5-3>1 yes l=1 r=4
        // abab    4-2>1 yes l=2 r=4
        //  bab    3-2>1 no r=5
        //  babb   4-3>1 no r=6
        //  babba  5-3>1 yes l=3
        //   abba  4-2>1 yes l=4
        //    bba  3-2>1 no r=7

        val res = target.characterReplacement("AABABBA", 1)
        assertEquals(4, res)
    }

    @Test
    fun test3() {
        //AA 0 - 2
        //AB 1  -2
        //ABC 1 - 2
        //ABBB 1/2 - 4
        //AABBAAA 2 - 7
        //AABBAAA 1 - 4

//        AABB
//        l r   max=3 AAA
//         lr   ABB
        val res = target.characterReplacement("AABABBA", 1)
        assertEquals(4, res)
    }

    @Test
    fun test4() {
        val res = target.characterReplacement("ABABA", 2)
        assertEquals(5, res)
//        ABABA
//        ABA      let=2 k=0 collect(A)
//        ABAB     let=2 k=0 collect(A,B)
//        ABABA    let=2 k=0 collect(A)
//        k-stat(B)==0

    }

    @Test
    fun test5() {
        val res = target.characterReplacement("DEFBBAAA", 2)
        assertEquals(5, res)
        //DEFBBAAA
        //01234567
        //DEF             let=3 collect(DEF)       3-1=2
        //DEFB            let=4 k=0                4-1>2
        // EFB            let=3 k=0 collect(DEF)   3-1=2
        // EFBB           let=3 k=0 collect(B)     4-2=2
        // EFBBA          let=4 k=0 collect(B)     5-2>2
        //  FBBA          let=3 k=0 collect(B)     4-2=2
        //  FBBAA         let=3 k=0 collect(B,A)   5-2>2
        //   BBAA         let=2 k=0 collect(B,A)   4-2=2
        //   BBAAA        let=2 k=0 collect(B,A)   5-3=2
        //   BBAAAA       let=2 k=0 collect(B,A) max = 5
    }

    @Test
    fun test6() {
        //aa r<2 lc=1
        //a  0-0+1-1>0
        //aa  1-0+1-2>0
        val res = target.characterReplacement("AA", 0)
        assertEquals(2, res)
    }

    @Test
    fun test7() {
        //abab
        //ab    r=1 2-1<=0 no l=1
        // ba   r=2 2-1<=0 no l=2
        //  a   r=3 2-1<=0 no l=3
        //  ab  r=4
        val res = target.characterReplacement("ABAB", 0)
        assertEquals(1, res)
    }
}