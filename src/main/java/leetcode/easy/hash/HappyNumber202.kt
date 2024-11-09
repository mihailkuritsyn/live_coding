package leetcode.easy.hash

import kotlin.math.pow


//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
class HappyNumber202 {
    fun isHappy(n: Int): Boolean {
        val past = HashSet<Int>()
        past.add(n)

        var sum = calculateSquareSum(n)
        while (sum != 1) {
            past.add(sum)
            sum = calculateSquareSum(sum)
            if (past.contains(sum)) return false
        }
        return true
    }

    private fun calculateSquareSum(n: Int): Int {
        var nn = n
        var sum = 0
        do {
            sum += (nn % 10).toDouble().pow(2).toInt()
            nn /= 10
        } while (nn != 0)
        return sum
    }
}