package Minimize_Maximum_of_Array;

public class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max((int) Math.ceil((double) sum / (i + 1)), max);
        }
        return (int) max;
    }
}
