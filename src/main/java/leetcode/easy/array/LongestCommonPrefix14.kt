package leetcode.easy.array

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
class LongestCommonPrefix14 {
//    fun longestCommonPrefix(strings: Array<String>): String {
//        if (strings.size == 1) return strings[0]
//
//        val first = strings[0]
//        var ind = -1
//        var sameLetter = true
//        while (sameLetter) {
//            ind++
//            for (i in 1..<strings.size) {
//                if (ind >= first.length ||
//                    ind >= strings[i].length ||
//                    strings[i][ind] != first[ind]
//                ) {
//                    sameLetter = false
//                    break
//                }
//            }
//
//        }
//        return first.substring(0, ind)
//    }

    fun longestCommonPrefix(strings: Array<String>): String {
        if (strings.size == 1) return strings[0]
        for (i in strings[0].indices) {
            for (j in 1..<strings.size) {
                if (i >= strings[j].length || strings[0][i] != strings[j][i]) {
                    return strings[0].substring(0, i)
                }
            }
        }
        return strings[0]
    }
}