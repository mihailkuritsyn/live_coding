package leetcode.easy.array

//Given a string s consisting of words and spaces,
// return the length of the last word in the string.
//
//A word is a maximal substring consisting of non-space characters only.
class LengthOfLastWord58 {

    fun lengthOfLastWord(s: String): Int {
        val letters = s.toCharArray()
        if (letters.size == 0) return 0

        var ind = letters.size - 1
        var res = 0
        while (ind >= 0 && s[ind] == ' ') ind--
        while (ind >= 0 && s[ind] != ' ') {
            ind--
            res++
        }
        return res
    }
}