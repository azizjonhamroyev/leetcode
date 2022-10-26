package concatenation_of_consecutive_binary_numbers;

public class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1000000007;
        long res = 0;
        for (int i = 1; i <= n; i++) {
            res = (res * (int) Math.pow(2, Integer.toBinaryString(i).length()) + i) % mod;
        }
        return (int)res;
    }
}
