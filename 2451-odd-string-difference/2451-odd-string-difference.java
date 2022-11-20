public class Solution {
    public String oddString(String[] words) {
        HashSet<String> set = new HashSet<>();
        String convert1 = convert(words[0]);
        String convert2 = convert(words[1]);
        String convert3 = convert(words[2]);
        if (convert2.equals(convert3) && !convert1.equals(convert3)) return words[0];
        set.add(convert1);
        for (int i = 1; i < words.length; i++) {
            String convert = convert(words[i]);
            if (!set.contains(convert)) return words[i];
            set.add(convert);
        }
        return "";
    }

    public String convert(String word) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < word.length(); i++) {
            builder.append((char) ('a' + word.charAt(i) - word.charAt(i - 1)));
        }
        return builder.toString();
    }
}