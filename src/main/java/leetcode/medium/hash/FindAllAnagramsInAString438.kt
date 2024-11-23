package leetcode.medium.hash

//Given two strings s and p, return an array of all the start indices of p's
//anagrams
// in s. You may return the answer in any order.
class FindAllAnagramsInAString438 {

    fun findAnagrams(s: String, p: String): List<Int> {
        if (p.length > s.length) return emptyList()
        if (s.length == 1 && p.length == 1) return listOf(0)

        val pMap = IntArray(26)
        for (i in p.indices) {
            pMap[p[i].code - 'a'.code]++
        }

        var left = 0
        var right = p.length - 1
        val currMap = IntArray(26)
        for (i in 0..right) {
            currMap[s[i].code - 'a'.code]++
        }

        val res = mutableListOf<Int>()
        while (right != s.length - 1) {
            if (isAnagram(currMap, pMap)) {
                res.add(left)
            }
            currMap[s[left].code - 'a'.code]--
            left++
            right++
            currMap[s[right].code - 'a'.code]++
        }
        if (isAnagram(currMap, pMap)) {
            res.add(left)
        }
        return res
    }

    fun isAnagram(first: IntArray, second: IntArray): Boolean {
        for (i in first.indices) {
            if (first[i] != second[i]) return false
        }
        return true
    }
}