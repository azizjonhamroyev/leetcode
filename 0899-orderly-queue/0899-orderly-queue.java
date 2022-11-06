class Solution {
    public String orderlyQueue(String s, int k) {
        if (k != 1) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
        String res = s;
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);
            if (res.compareTo(str) > 0) res = str;
        }
        return res;
    }
}