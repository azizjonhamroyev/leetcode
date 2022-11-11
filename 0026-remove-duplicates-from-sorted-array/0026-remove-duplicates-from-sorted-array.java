public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0, length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            int k = i;
            while (i < length - 1 && nums[i] == nums[i + 1]) i++;
            count += i - k;
            System.arraycopy(nums, i + 1, nums, k + 1, length - i - 1);
            length -= i - k;
            i = k;
        }
        return nums.length - count;
    }
}