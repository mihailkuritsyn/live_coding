package leetcode.easy.hash

//Given two strings s and t, return true if t is an anagram
//of s, and false otherwise.

class ValidAnagram242 {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val alph = IntArray(26)
        for (i in s.indices) {
            alph[s[i].code - 'a'.code]++
        }
        for (i in t.indices) {
            if (alph[t[i].code - 'a'.code] == 0) return false
            alph[t[i].code - 'a'.code]--
        }
        return true
    }
}