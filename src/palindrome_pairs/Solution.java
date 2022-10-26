package palindrome_pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
//    public List<List<Integer>> palindromePairs(String[] words) {
//        List<List<Integer>> pairs = new ArrayList<>();
//        HashMap<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < words.length; i++) map.put(words[i], i);
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j <= words[i].length(); j++) {
//                String firstPart = words[i].substring(0, j);
//                String secondPart = words[i].substring(j);
//                if (isPalindrome(firstPart)) {
//                    Integer index = map.get(new StringBuilder(secondPart).reverse().toString());
//                    if (index != null && index != i) pairs.add(Arrays.asList(index, i));
//                }
//                if (isPalindrome(secondPart)) {
//                    Integer index = map.get(new StringBuilder(firstPart).reverse().toString());
//                    if (index != null && index != i && secondPart.length() != 0) pairs.add(Arrays.asList(i, index));
//                }
//            }
//        }
//        return pairs;
//    }

//    private boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//        while (left <= right) {
//            if (str.charAt(left++) != str.charAt(right--)) return false;
//        }
//        return true;
//    }

    public static class Trie {
        int pos;
        Trie[] nodes;
        List<Integer> palins;

        public Trie() {
            pos = -1;
            nodes = new Trie[26];
            palins = new ArrayList<>();
        }
    }

    public static void add(Trie root, String word, int pos) {
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            if (isPalindrome(word, 0, i)) {
                root.palins.add(pos);
            }
            if (root.nodes[ch - 'a'] == null) {
                root.nodes[ch - 'a'] = new Trie();
            }
            root = root.nodes[ch - 'a'];
        }
        root.pos = pos;
        root.palins.add(pos);
    }

    public static void search(Trie root, String[] words, int i, List<List<Integer>> ans) {
        int len = words[i].length();
        for (int j = 0; j < len && root != null; j++) {
            if (root.pos >= 0 && i != root.pos && isPalindrome(words[i], j, len - 1)) {
                ans.add(Arrays.asList(i, root.pos));
            }
            char ch = words[i].charAt(j);
            root = root.nodes[ch - 'a'];
        }
        if (root != null && root.palins.size() > 0) {
            for (int j : root.palins) {
                if (j != i) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
    }

    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        Trie trie = new Trie();
        for (int i = 0; i < words.length; i++) {
            add(trie, words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            search(trie, words, i, ans);
        }
        return ans;
    }

    public static boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
