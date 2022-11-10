class Solution {
    fun removeDuplicates(s: String): String {
        var i = 1
        var word = s
        var length = word.length
        while (i < length) {
            if (word[i] == word[i - 1]) {
                word = word.substring(0, i - 1) + word.substring(i + 1, word.length)
                length -= 2
                if (i != 1) i--
            } else i++
        }
        return word
    }
}