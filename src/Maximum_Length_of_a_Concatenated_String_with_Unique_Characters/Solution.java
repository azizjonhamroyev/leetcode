package Maximum_Length_of_a_Concatenated_String_with_Unique_Characters;

import java.util.ArrayList;
import java.util.List;

class Solution {
    int max = 0;

    public int maxLength(List<String> arr) {

        ArrayList<boolean[]> bits = new ArrayList<>();
        for (String s : arr) {
            boolean[] b = new boolean[26];
            boolean isHave = false;
            for (char c : s.toCharArray()) {
                if (!b[c - 'a']) b[c - 'a'] = true;
                else {
                    isHave = true;
                    break;
                }
            }
            if (!isHave) bits.add(b);
        }

        for (int i = 0; i < bits.size(); i++) {
            backtrack(i, bits, new boolean[26]);
        }
        return max;
    }

    private void backtrack(int index, ArrayList<boolean[]> bits, boolean[] b) {
        int count = 0;
        for (boolean b1 : b) if (b1) count++;
        max = Math.max(max, count);
        for (int j = index; j < bits.size(); j++) {
            boolean[] curr = bits.get(j);
            boolean[] next = new boolean[26];
            boolean isHave = false;

            for (int l = 0; l < b.length; l++) {
                if (!(curr[l] && b[l]) && (curr[l] || b[l])) next[l] = true;
                else if (curr[l] && b[l]) {
                    isHave = true;
                    break;
                }
            }
            if (!isHave) backtrack(j + 1, bits, next);
        }
    }
}
