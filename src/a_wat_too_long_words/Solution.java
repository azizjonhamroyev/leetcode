package a_wat_too_long_words;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] longWords = new String[n];
        for (int i = 0; i < n; i++) longWords[i] = in.next();
        for (String word : longWords)
            if (word.length() > 10)
                System.out.println(String.valueOf(word.charAt(0)) + (word.length() - 2) + word.charAt(word.length() - 1));
            else System.out.println(word);
    }
}
