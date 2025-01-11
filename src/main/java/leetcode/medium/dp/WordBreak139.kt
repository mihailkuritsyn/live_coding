package leetcode.medium.dp

// Given a string s and a dictionary of strings wordDict,
// return true if s can be segmented into a space-separated
// sequence of one or more dictionary words.
//
// Note that the same word in the dictionary may be reused
// multiple times in the segmentation.
class WordBreak139 {

    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val dict: HashSet<String> = HashSet(wordDict)
        if (s.length == 1) return dict.contains(s)
        val dp = BooleanArray(s.length + 1)
        dp[0] = true
        for (i in 1..s.length) {
            for (word in wordDict) {
                val leftLen = i - word.length
                if (leftLen >= 0 && dp[leftLen] && dict.contains(s.substring(leftLen, i))) {
                    dp[i] = true
                    break
                }
            }
        }
        return dp[s.length]
    }
}