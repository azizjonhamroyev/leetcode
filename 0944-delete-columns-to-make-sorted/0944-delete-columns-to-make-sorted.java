class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length, m = strs[0].length(), res = 0;

        for (int i = 0; i < m; i++)
            for (int j = 1; j < n; j++)
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    res++;
                    break;
                }

        return res;
    }
}