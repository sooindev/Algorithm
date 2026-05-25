import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int time = 0;

            for (int j = i + 1; j < n; j++) {
                time++;

                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = time;
        }

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution s = new Solution();
        int[] arr = {1, 2, 3, 2, 3};

        bw.write(Arrays.toString(s.solution(arr)) + "\n");

        bw.flush();
        bw.close();
    }
}