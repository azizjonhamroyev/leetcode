package Count_Number_of_Distinct_Integers_After_Reverse_Operations;

import java.util.HashSet;

public class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            int res = 0;
            while (nums[i] > 0) {
                res = res * 10 + nums[i] % 10;
                nums[i] /= 10;
            }
            set.add(res);
        }
        return set.size();
    }
}
