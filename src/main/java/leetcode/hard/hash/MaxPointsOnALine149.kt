package leetcode.hard.hash

//Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.
class MaxPointsOnALine149 {

    fun maxPoints(points: Array<IntArray>): Int {
        if (points.size <= 2) return points.size

        var max = 1
        for (i in points.indices) {
            val slopeMap = HashMap<Double, Int>()
            val x1 = points[i][0]
            val y1 = points[i][1]
            for (j in i + 1 until points.size) {
                val x2 = points[j][0]
                val y2 = points[j][1]
                var slope: Double = if (x2 - x1 == 0) {
                    Double.MAX_VALUE
                } else {
                    (y2 - y1) / (x2 - x1).toDouble()
                }
                if (slope == -0.0) slope = 0.0
                if (slopeMap.containsKey(slope)) {
                    val incVal = slopeMap[slope]!! + 1
                    slopeMap[slope] = incVal
                    max = maxOf(max, incVal)
                } else {
                    slopeMap[slope] = 2
                    if (max == 1) max = 2
                }
            }
        }
        return max
    }
}