class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        
        int res = 0;
        
        for(int i = 0;i < costs.length; i++, res++) 
            if(coins - costs[i] >= 0) 
                coins -= costs[i];
             else 
                 break;
        
        return res;
    }
}