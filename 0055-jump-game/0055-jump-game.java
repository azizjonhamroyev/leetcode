public class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max >= nums.length - 1) return true;

            max = Math.max(max, i + nums[i]);
            if(nums[i] == 0&&max==i) return false;
        }
        
    
        return false;
    }
}