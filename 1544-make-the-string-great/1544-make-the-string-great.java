public class Solution {
    public String makeGood(String s) {
        int i = 0;
        StringBuilder res = new StringBuilder(s);
        while (i < res.length() - 1) {
            if (Math.abs(res.charAt(i) - res.charAt(i + 1)) == 32) {
                res.delete(i, i + 2);
                if (i > 0) i--;
            } else i++;
        }
        return res.toString();
    }
}