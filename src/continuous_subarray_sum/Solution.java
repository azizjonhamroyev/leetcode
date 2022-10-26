package continuous_subarray_sum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length == 1) return false;
        int sum = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>(Map.of(sum % k, 0));
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;
            if (mod == 0 || map.containsKey(mod) && i - map.get(mod) > 1) return true;
            if (!map.containsKey(mod)) map.put(mod, i);
        }
        return false;
    }
}
