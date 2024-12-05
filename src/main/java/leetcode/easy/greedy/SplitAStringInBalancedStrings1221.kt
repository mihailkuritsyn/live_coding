package leetcode.easy.greedy

class SplitAStringInBalancedStrings1221 {

    fun balancedStringSplit(s: String): Int {
        if (s.length == 2) return 1
        var l = 0
        var r = 0
        var res = 0
        for (i in 0..s.length - 1 step 2) {
            if (s[i] == 'L') l++
            if (s[i + 1] == 'R') r++
            if (r == l) {
                res++
            }
        }
        return res
    }
}