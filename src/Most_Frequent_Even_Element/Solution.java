package Most_Frequent_Even_Element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        int res = -1, max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                if (max < entry.getValue()) {
                    max = entry.getValue();
                    res = entry.getKey();
                }
                if (max == entry.getValue()) {
                    res = Math.min(entry.getKey(), res);
                }
            }
        }
        return res;
    }
}
