import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Solution {
    public long solution(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        long[] dp = new long[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution s = new Solution();

        bw.write(s.solution(4) + "\n");
        bw.write(s.solution(3) + "\n");

        bw.flush();
        bw.close();
    }
}