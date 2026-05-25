import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Solution {
    public String solution(String n_str) {
        int temp = Integer.parseInt(n_str);
        String answer = String.valueOf(temp);

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution s = new Solution();

        bw.write(s.solution("0010") + "\n");

        bw.flush();
        bw.close();
    }
}