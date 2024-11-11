package leetcode.medium.two_pointers

//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//Your solution must use only constant extra space.
class TwoSumIIInputArrayIsSorted167 {

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var l = 0
        var r = numbers.size - 1
        var sum = numbers[l] + numbers[r]
        while (sum != target) {
            if (sum > target) {
                r--
            } else {
                l++
            }
            sum = numbers[l] + numbers[r]
        }
        return intArrayOf(l + 1, r + 1)
    }
}