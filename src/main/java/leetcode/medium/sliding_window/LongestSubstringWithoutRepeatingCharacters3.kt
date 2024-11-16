package leetcode.medium.sliding_window

//Given a string s, find the length of the longest
//substring
// without repeating characters.
class LongestSubstringWithoutRepeatingCharacters3 {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length <= 1) return s.length

        var l = 0;
        var r = 1;
        val letToIndMap = HashMap<Char, Int>()
        letToIndMap[s[l]] = 0

        var max = 0
        while (r != s.length) {
            if (letToIndMap.containsKey(s[r])) {
                val oldInd = letToIndMap[s[r]]!!
                for (i in l..oldInd) {
                    letToIndMap.remove(s[i])
                }
                l = oldInd + 1
            }
            letToIndMap.put(s[r], r)
            max = Math.max(max, r - l + 1)
            r++
        }
        return max
    }
}