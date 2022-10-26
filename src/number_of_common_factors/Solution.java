package number_of_common_factors;

public class Solution {
    public int commonFactors(int a, int b) {
        int res = 1;

        for (int i = 2; i <= Math.min(a, b); i++) {
            if (b % i == 0 && a % i == 0) res++;
        }
        return res;
    }
}
