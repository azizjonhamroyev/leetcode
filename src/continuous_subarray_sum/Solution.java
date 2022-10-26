package continuous_subarray_sum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length == 1) return false;
        int curr = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>(Map.of(curr % k, 0));
        for (int i = 1; i < nums.length; i++) {
            curr += nums[i];
            int mod = curr % k;
            if (mod == 0 || map.containsKey(mod) && i - map.get(mod) > 1) return true;
            if (!map.containsKey(mod)) map.put(mod, i);
        }
        return false;
    }
}
