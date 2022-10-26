package minimize_XOR;

public class Solution {
    public int minimizeXor(int num1, int num2) {
        int bitCount = Integer.bitCount(num2);
        String s = Integer.toBinaryString(num1);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && bitCount > 0) {
                res.append(1);
                bitCount--;
            } else res.append(0);
        }
        int i = res.length() - 1;
        while (bitCount > 0 && i >= 0) {
            if (res.charAt(i) == '0') {
                res.replace(i, i + 1, "1");
                bitCount--;
            }
            i--;
        }
        while (bitCount > 0) {
            res.insert(0, 1);
            bitCount--;
        }
        return Integer.parseInt(res.toString(), 2);
    }
}
