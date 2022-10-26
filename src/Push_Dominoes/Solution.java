package Push_Dominoes;

public class Solution {
    public String pushDominoes(String dominoes) {
        int[] dp = new int[dominoes.length()];

        int strength = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dominoes.charAt(i) == 'R') strength = dp.length;
            else if (dominoes.charAt(i) == 'L') strength = 0;
            else strength = Math.max(strength - 1, 0);
            dp[i] += strength;
        }
        strength = 0;
        for (int i = dp.length - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') strength = dp.length;
            else if (dominoes.charAt(i) == 'R') strength = 0;
            else strength = Math.max(strength - 1, 0);
            dp[i] -= strength;
        }
        StringBuilder res = new StringBuilder();

        for (int j : dp)
            if (j > 0) res.append('R');
            else if (j < 0) res.append('L');
            else res.append('.');

        return res.toString();
    }
}
