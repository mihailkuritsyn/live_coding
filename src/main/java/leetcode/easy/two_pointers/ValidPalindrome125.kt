package leetcode.easy.two_pointers

//A phrase is a palindrome if, after converting all uppercase letters into
// lowercase letters and removing all non-alphanumeric characters, it reads
// the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
class ValidPalindrome125 {

    fun isPalindrome(s: String): Boolean {
        if (s.length == 1) return true
        val builder = StringBuilder()
        for (i in s.indices) {
            val lowercaseChar = s[i].lowercaseChar()
            if (lowercaseChar.code >= 97 && lowercaseChar.code <= 122 ||
                lowercaseChar.code >= 48 && lowercaseChar.code <= 57
            ) {
                builder.append(lowercaseChar)
            }
        }
        val converted = builder.toString()
        var l = 0
        var r = converted.length - 1
        while (l < r) {
            if (converted[l] != converted[r]) {
                return false
            }
            l++
            r--
        }
        return true
    }
}