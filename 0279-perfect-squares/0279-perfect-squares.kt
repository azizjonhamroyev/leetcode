import kotlin.math.sqrt

class Solution {
    fun numSquares(n: Int): Int {
        val dp = arrayListOf<Int>(0)
        while (dp.size <= n) {
            val m = dp.size
            var squares = Int.MAX_VALUE
            for (i in 1..sqrt(m.toDouble()).toInt())
                squares = minOf(squares, dp[m - i * i] + 1)
            dp.add(squares)
        }
        return dp[n]
    }
}