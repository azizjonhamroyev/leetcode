package kokteyl;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = in.nextInt();
        int MOD = 1_000_000_007;
        if (N == 1) {
            out.println(0);
            out.flush();
        } else {
            int[] dp = new int[N + 1];
            int[] factorial = new int[N + 1];
            factorial[2] = 2;
            dp[2] = 2;
            for (int i = 3; i <= N; i++) {
                factorial[i] = (i * factorial[i - 1]) % MOD;
                dp[i] = (factorial[i] + i * dp[i - 1]) % MOD;
            }
            out.println(dp[N]);
            out.flush();
        }
    }
}
