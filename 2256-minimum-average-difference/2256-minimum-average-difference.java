class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        long sum=0;
        for(int x:nums) sum+=x;
        int res=0;
        long min=Long.MAX_VALUE;
        long curr=0;
        for(int i=0;i<nums.length-1;i++){
            curr+=nums[i];
            sum-=nums[i];
            
            long diff=Math.abs(curr/(i+1)-sum/(nums.length-i-1));
            
            if(diff<min){
                min=diff;
                res=i;
            }
        }
        curr+=nums[nums.length-1];
        if(curr/nums.length<min){
            res=nums.length-1;
        }
        return res;
        
    }
}