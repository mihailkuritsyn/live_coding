package leetcode.easy.hash

//Given two strings s and t, return true if t is an anagram
//of s, and false otherwise.

class ValidAnagram242 {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val alph = IntArray(26)
        for (l in s) {
            alph[l.code - 'a'.code]++
        }
        for (l in t) {
            if (alph[l.code - 'a'.code] == 0) return false
            alph[l.code - 'a'.code]--
        }
        return true
    }
}