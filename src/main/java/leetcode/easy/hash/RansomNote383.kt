package leetcode.easy.hash

// Given two strings ransomNote and magazine, return true if
// ransomNote can be constructed by using the letters from magazine
// and false otherwise.
//
// Each letter in magazine can only be used once in ransomNote.
class RansomNote383 {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var magArr = Array<Int>(26) { 0 }
        for (l in magazine) {
            magArr[l.code - 'a'.code]++
        }

        for (l in ransomNote) {
            if (magArr[l.code - 'a'.code] == 0)
                return false
            magArr[l.code - 'a'.code]--
        }
        return true;
    }
}