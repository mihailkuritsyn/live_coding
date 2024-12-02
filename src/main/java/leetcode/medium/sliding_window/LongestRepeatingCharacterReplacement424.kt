package leetcode.medium.sliding_window

//You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
//
//Return the length of the longest substring containing the same letter you can get after performing the above operations.
class LongestRepeatingCharacterReplacement424 {

    val stat = IntArray(26)

    fun characterReplacement(s: String, k: Int): Int {
        if (s.length == 1) return 1
        var l = 0
        var r = 0
        stat[s[l].code - 'A'.code] = 1

        var res = 1
        var leadCount: Int
        while (r < s.length - 1) {
            r++
            stat[s[r].code - 'A'.code] += 1
            leadCount = getLeadCount()
            while (((r - l + 1) - leadCount) > k) {
                stat[s[l].code - 'A'.code] -= 1
                l++
            }
            res = maxOf(res, r - l + 1)
        }
        return res
    }

    private fun getLeadCount(): Int {
        var leadCount = 0;
        for (count in stat) {
            leadCount = maxOf(leadCount, count)
        }
        return leadCount
    }
}