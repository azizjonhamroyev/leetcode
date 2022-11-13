class Solution {
    fun reverseWords(s: String): String {
        var reverseWord = ""
        val s1 = removeEnd(removeBegin(s))
        var word = ""
        for (i in s1.length - 1 downTo 0) {
            if (s1[i] == ' ' && word != "") {
                reverseWord += "$word "
                word = ""
            } else if (s1[i] != ' ') {
                word = s1[i] + word
            }
        }
        return reverseWord.substring(
            0,
            if (reverseWord.length > 0) reverseWord.length - 1 else 0
        ) + if (reverseWord != "") " $word" else word
    }

    fun removeBegin(s: String): String = if (s.first() == ' ') removeBegin(s.substring(1)) else s

    fun removeEnd(s: String): String = if (s.last() == ' ') removeEnd(s.substring(0, s.length - 1)) else s
}