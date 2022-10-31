class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long temp = n,degree = 1;
        while(sum(n)>target) {
            n=n/10+1;
            degree*=10;
        }
        return n*degree-temp;
    }
    
    public long sum(long n) {
        long sum = 0;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    
}