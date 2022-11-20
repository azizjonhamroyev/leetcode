class Solution {

    fun calculate(s: String): Int {
        val stack = Stack<Int>()
        var num = 0
        var res = 0
        var sign = 1
        for (c in s) {
            if (Character.isDigit(c)) num = num * 10 + (c - '0')
            else when (c) {
                '+' -> {
                    res += sign * num;
                    num = 0
                    sign = 1
                }

                '-' -> {
                    res += sign * num
                    num = 0
                    sign = -1
                }

                '(' -> {
                    stack.push(res)
                    stack.push(sign)
                    res = 0
                    sign = 1
                }

                ')' -> {
                    res += sign * num;
                    res *= stack.pop()
                    res += stack.pop()
                    num = 0;
                }
            }
        }
        return if (num == 0) res else res + sign * num;
    }
}