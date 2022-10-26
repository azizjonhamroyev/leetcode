package Find_Subarrays_With_Equal_Sum;

import java.util.HashSet;

public class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (set.contains(nums[i] + nums[i + 1])) return true;
            else set.add(nums[i] + nums[i + 1]);
        }
        return false;
    }
}
