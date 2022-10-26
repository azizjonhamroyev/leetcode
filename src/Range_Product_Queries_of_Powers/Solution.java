package Range_Product_Queries_of_Powers;

import java.util.ArrayList;

public class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> powers = new ArrayList<>();

        int[] res = new int[queries.length];
        int mod = 1_000_000_007;
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) Math.pow(2, (queries[i][0] + queries[i][1]) * (queries[i][1] - queries[i][0] + 1.0) / 2) % mod;
        }
        return res;
    }
}
