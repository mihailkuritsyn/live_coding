package leetcode.medium.dfs

//Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
class NumberOfIslands200 {

    private var num = 0
    private var m = 0
    private var n = 0

    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.size == 1 && grid[0].size == 1) return if (grid[0][0] == '1') 1 else 0
        m = grid.size
        n = grid[0].size

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == '1') {
                    num++
                    dfs(grid, i, j)
                }
            }
        }
        return num
    }

    fun dfs(grid: Array<CharArray>, row: Int, col: Int) {
        if (grid[row][col] == '0') return
        grid[row][col] = '0'

        if (row + 1 < m) {
            dfs(grid, row + 1, col)
        }
        if (row - 1 >= 0) {
            dfs(grid, row - 1, col)
        }
        if (col + 1 < n) {
            dfs(grid, row, col + 1)
        }
        if (col - 1 >= 0) {
            dfs(grid, row, col - 1)
        }
    }
}