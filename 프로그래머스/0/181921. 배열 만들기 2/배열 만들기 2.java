import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            int temp = i;
            boolean isValid = true;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit != 0 && digit != 5) {
                    isValid = false;
                    break;
                }
                temp /= 10;
            }

            if (isValid) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Solution s = new Solution();

        bw.write(Arrays.toString(s.solution(5, 555)) + "\n");
        bw.write(Arrays.toString(s.solution(10, 40)) + "\n");

        bw.flush();
        bw.close();
    }
}