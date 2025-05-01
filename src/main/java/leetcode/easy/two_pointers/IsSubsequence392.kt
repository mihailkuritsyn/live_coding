package leetcode.easy.two_pointers

//Given two strings s and t, return true if s is a subsequence of t,
// or false otherwise.
//
//A subsequence of a string is a new string that is formed from
// the original string by deleting some (can be none) of the
// characters without disturbing the relative positions of the
// remaining characters.
// (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
class IsSubsequence392 {

    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length == 0) return true
        if (s.length == t.length) return s == t
        if (s.length > t.length) return false

        var i = 0
        for (j in t.indices) {
            if (t[j] == s[i]) {
                if (i == s.length - 1) return true
                i++
            }
        }
        return false
    }
}