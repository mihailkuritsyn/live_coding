package leetcode.medium.bin_search

//You are given an m x n integer matrix matrix with the following two properties:
//
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//
//You must write a solution in O(log(m * n)) time complexity.
class Search2DMatrix74 {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var rowInd: Int
        if (matrix.size == 1) {
            rowInd = 0
        } else {
            rowInd = findRowInd(matrix, target)
            if (rowInd == -1) return false
        }
        val row = matrix[rowInd]
        var l = 0
        var r = row.size - 1
        var m: Int
        while (l <= r) {
            m = l + (r - l) / 2
            if (row[m] == target) return true
            if (target < row[m]) {
                r = m - 1
            } else {
                l = m + 1
            }
        }
        return false
    }

    private fun findRowInd(matrix: Array<IntArray>, target: Int): Int {
        var l = 0
        var r = matrix.size - 1
        var m: Int
        while (l <= r) {
            m = l + (r - l) / 2
            val mRow = matrix[m]
            if (mRow[0] <= target && target <= mRow[mRow.size - 1]) {
                return m
            }
            if (target < mRow[0]) {
                r = m - 1
            } else {
                l = m + 1
            }
        }
        return -1
    }
}