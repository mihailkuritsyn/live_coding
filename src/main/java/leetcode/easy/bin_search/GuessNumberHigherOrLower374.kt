package leetcode.easy.bin_search

class GuessNumberHigherOrLower374 {

    fun guess(num: Int): Int {
        return 0
    }

    fun guessNumber(n: Int): Int {
        if (n == 1) return 1
        var l = 1
        var r = n
        while (l <= r) {
            val m: Int = l + (r - l) / 2
            val res = guess(m)
            if (res == 0) {
                return m
            } else if (res == 1) {
                l = m + 1
            } else {
                r = m - 1
            }
        }
        return -1
    }

    fun search(nums: IntArray, target: Int): Int {
        if (nums.size == 1) return if (nums[0] == target) 0 else -1
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val m: Int = l + (r - l) / 2
            if (nums[m] == target) {
                return m
            } else if (nums[m] < target) {
                l = m + 1
            } else {
                r = m - 1
            }
        }
        return -1
    }
}