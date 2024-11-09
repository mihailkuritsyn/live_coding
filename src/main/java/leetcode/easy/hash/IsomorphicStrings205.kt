package leetcode.easy.hash

//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can
// be replaced to get t.
//
//All occurrences of a character must be replaced with
// another character while preserving the order of characters.
// No two characters may map to the same character,
// but a character may map to itself.
class IsomorphicStrings205 {

//    fun isIsomorphic(s: String, t: String): Boolean {
//        if (s.length != t.length) return false
//        val counter1 = IntArray(128)
//        val counter2 = IntArray(128)
//        for (i in s.indices) {
//            if (counter1[s[i].code] != counter2[t[i].code])
//                return false
//            counter1[s[i].code] = i + 1
//            counter2[t[i].code] = i + 1
//        }
//        return true;
//    }

    fun isIsomorphic(s: String, t: String): Boolean {
        return signature(s) == signature(t)
    }

    private fun signature(s: String): String {
        println(s[0].code)
        val sMap = HashMap<Char, Int>()
        var counter = 1;
        val sig = StringBuilder()
        for (l in s) {
            if (!sMap.containsKey(l)) {
                sMap[l] = counter
                counter++
            }
            sig.append(sMap[l])
        }
        return sig.toString()
    }
}