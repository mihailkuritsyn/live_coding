package leetcode.medium.two_pointers

class ThreeSum15 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        if (nums.size == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                return listOf(listOf(nums[0], nums[1], nums[2]))
            } else {
                return res
            }
        }
        nums.sort()
        for (i in 0..nums.size - 3) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue
            }
            var l = i + 1
            var r = nums.size - 1
            val obj = -nums[i]
            while (l < r) {
                val sum = nums[l] + nums[r]
                if (sum == obj) {
                    res.add(listOf(nums[i], nums[l], nums[r]))
                    do {
                        l++
                    } while (nums[l - 1] == nums[l] && l <= nums.size - 3)
                    r--
                } else if (sum < obj) {
                    l++
                } else {
                    r--
                }
            }
        }
        return res
    }
}