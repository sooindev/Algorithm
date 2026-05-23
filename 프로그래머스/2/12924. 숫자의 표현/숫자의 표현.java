import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;

            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution s = new Solution();
        bw.write(s.solution(15) + "\n");

        bw.flush();
        bw.close();
    }
}