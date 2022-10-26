package find_the_original_array_of_prefix_xor;

public class Solution {
    public int[] findArray(int[] pref) {
        int curr = pref[0];
        for (int i = 1; i < pref.length; i++) {
            pref[i] ^= curr;
            curr ^= pref[i];
        }
        return pref;
    }
}
