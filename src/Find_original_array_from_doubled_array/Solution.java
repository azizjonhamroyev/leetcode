package Find_original_array_from_doubled_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 == 1) return new int[0];
        Arrays.sort(changed);
        int n = changed.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int j : changed) {
            Integer val = map.get(j);
            if (val != null && val > 0) {
                res.add(j / 2);
                map.put(j, val - 1);
            } else map.put(j * 2, map.getOrDefault(j * 2, 0) + 1);
        }
        if (res.size() != n / 2) return new int[0];
        int[] resArray = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }
}
