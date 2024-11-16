package leetcode.medium.two_pointers

//You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
//
//Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
//
//Return a list of integers representing the size of these parts.
class PartitionLabels763 {

    fun partitionLabels(s: String): List<Int> {
        if (s.length == 1) {
            return listOf(1)
        }
        val segmentMap = HashMap<Char, Pair<Int, Int>>()
        for (i in s.indices) {
            val letter = s[i]
            if (segmentMap.containsKey(letter)) {
                segmentMap.put(letter, segmentMap.get(letter)!!.copy(second = i))
            } else {
                segmentMap.put(letter, Pair(i, i))
            }
        }

        val res = mutableListOf<Int>()
        var prew = s[0]
        var l = segmentMap.get(prew)!!.first
        var r = segmentMap.get(prew)!!.second
        segmentMap.remove(prew)
        for (i in 1..s.length - 1) {
            val curr = s[i]
            if (!segmentMap.containsKey(curr)) {
                continue
            }

            val ll = segmentMap.get(curr)!!.first
            val rr = segmentMap.get(curr)!!.second
            if (ll > r) { // no intersection
                res.add(r - l + 1)
                l = ll
                r = rr
            } else if (rr > r) { // intersection
                r = rr
            }
            segmentMap.remove(curr)
        }
        res.add(r - l + 1)
        return res;
    }
}