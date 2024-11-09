package leetcode.easy.hash

//Given a pattern and a string s, find if s follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
//
//Each letter in pattern maps to exactly one unique word in s.
//Each unique word in s maps to exactly one letter in pattern.
//No two letters map to the same word, and no two words map to the same letter.
class WordPattern290 {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(' ')
        if (pattern.length != words.size) return false

        val map = HashMap<String, Char>()
        val pSet = HashSet<Char>()
        for (i in pattern.indices) {
            if (map.containsKey(words[i])) {
                if (map[words[i]] != pattern[i]) return false
            } else {
                if (pSet.contains(pattern[i])) return false
                map[words[i]] = pattern[i]
            }
            pSet.add(pattern[i])
        }
        return true
    }
}