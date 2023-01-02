class Solution {
    public int countDigits(int num) {
        int n = num;
        int res = 0;
        while (n > 0) {
            int i = n % 10;
            if (num % i == 0) res++;
            n /= 10;
        }
        return res;
    }
}