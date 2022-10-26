package count_and_say;

public class Solution {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < res.length(); j++) {
                int temp = j;
                char a = res.charAt(j);
                while (j + 1 < res.length() && res.charAt(j) == res.charAt(j + 1)) j++;
                stringBuilder.append(j - temp + 1).append(a);
            }
            res = stringBuilder;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(3));
    }
}
