import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution s = new Solution();
        int[] arr1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] arr2 = {5, 8, 4, 0, 6, 7, 9};

        bw.write(s.solution(arr1) + "\n");
        bw.write(s.solution(arr2) + "\n");

        bw.flush();
        bw.close();
    }
}