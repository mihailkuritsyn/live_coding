package leetcode.hard.array

//There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
//
//You are giving candies to these children subjected to the following requirements:
//
//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//Return the minimum number of candies you need to have to distribute the candies to the children.
class Candy135 {

//    fun candy(rate: IntArray): Int {
//        if (rate.size == 1) return 1
//        var res = rate.size
//
//        var l = 0
//        var r = 1
//        while (r < rate.size) {
//            if (rate[l] == rate[r]) {
//                r++
//                l++
//            } else if (rate[l] < rate[r]) {
//                while (r < rate.size && rate[r - 1] < rate[r]) {
//                    println("up ${r-l}")
//                    res += r - l
//                    r++
//                }
//                l = r
//                r++
//            } else {
//                while (r < rate.size && rate[r - 1] > rate[r]) {
//                    println("down ${r-l}")
//                    res += r - l
//                    r++
//                }
//                l = r
//                r++
//            }
//        }
//        if (l < rate.size && rate[l] > rate[l - 1])
//            res++
//        return res
//    }

    fun candy(rate: IntArray): Int {
        if (rate.size == 1) return 1
        var res = IntArray(rate.size) { 1 }

        for (i in 1..<rate.size) {
            if (rate[i] > rate[i - 1] && res[i] <= res[i - 1]) {
                res[i] = res[i - 1] + 1
            }
        }
        for (i in rate.size - 2 downTo 0) {
            if (rate[i] > rate[i + 1] && res[i] <= res[i + 1]) {
                res[i] = res[i + 1] + 1
            }
        }
        return res.sum()
    }
}