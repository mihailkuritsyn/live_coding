package leetcode.medium.backtracking

//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//
//A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
class LetterCombinationsOfAPhoneNumber17 {

    private val dict = mapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz",
    )

    private var res = mutableListOf<String>()

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return res
        backtrack(digits, 0, "")
        return res
    }

    fun backtrack(digits: String, pos: Int, currStr: String) {
        if (pos == digits.length) {
            res.add(currStr)
            return
        }
        val letters = dict[digits[pos]]
        for (i in letters!!.indices) {
            backtrack(digits, pos + 1, currStr + letters[i])
        }
    }
}