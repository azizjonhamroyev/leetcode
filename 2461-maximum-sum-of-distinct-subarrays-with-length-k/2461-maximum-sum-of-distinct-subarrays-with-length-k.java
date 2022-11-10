class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long res = 0;
        long curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                i = map.get(nums[i]) + 1;
                map.clear();
                map.put(nums[i], i);
                curr = nums[i];
            } else {
                map.put(nums[i], i);
                curr += nums[i];
                if (map.size() == k) {
                    res = Math.max(curr, res);
                    map.remove(nums[i - k + 1]);
                    curr -= nums[i - k + 1];
                }
            }
        }
        return res;
    }
}