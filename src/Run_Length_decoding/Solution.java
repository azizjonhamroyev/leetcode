package Run_Length_decoding;

class Solution {
    public String solve(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count = count * 10 + s.charAt(i) - '0';
            } else {
                res.append(String.valueOf(s.charAt(i)).repeat(count));
                count = 0;
            }
        }
        return res.toString();
    }
}
