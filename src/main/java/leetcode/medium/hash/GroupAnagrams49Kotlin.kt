package leetcode.medium.hash

class GroupAnagrams49Kotlin {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.size == 1) {
            return listOf(listOf(strs[0]))
        }
        val resMap = HashMap<String, MutableList<String>>()
        for (str in strs) {
            val alph = CharArray(26)
            for (l in str) {
                alph[l.code - 'a'.code]++
            }
            val sig = String(alph)

            if (resMap.containsKey(sig)) {
                resMap[sig]!!.add(str)
            } else {
                resMap[sig] = mutableListOf(str)
            }
        }
        return resMap.values.map { it.toList() }
    }
}