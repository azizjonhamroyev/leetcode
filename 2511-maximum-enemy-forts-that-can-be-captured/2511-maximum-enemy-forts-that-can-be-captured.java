public class Solution {
    public int captureForts(int[] forts) {


        int max = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 0) {
                int k = i;
                while (i + 1 < forts.length && forts[i + 1] == 0) {
                    i++;
                }
                if (k != 0 && forts[k - 1] == 1 && i != forts.length - 1 && forts[i + 1] == -1)
                    max = Math.max(i - k + 1, max);
                if (k != 0 && forts[k - 1] == -1 && i != forts.length - 1 && forts[i + 1] == 1)
                    max = Math.max(i - k + 1, max);
            }
        }
        return max;
    }
}
