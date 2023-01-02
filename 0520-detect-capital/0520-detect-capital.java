class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        char first = word.charAt(0);
        char second = word.charAt(1);
        boolean a = first >= 65 && first <= 90;
        boolean b = second >= 65 && second <= 90;
        if (a && b) {
            for (int i = 2; i < word.length(); i++) if (!(word.charAt(i) >= 65 && word.charAt(i) <= 90)) return false;
        } else if (!a) {
            for (int i = 1; i < word.length(); i++) if (!(word.charAt(i) >= 97 && word.charAt(i) <= 122)) return false;
        } else {
            for (int i = 1; i < word.length(); i++) if (!(word.charAt(i) >= 97 && word.charAt(i) <= 122)) return false;
        }

        return true;
    }
}