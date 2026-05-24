import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[index] = arr[i];
            index++;
        }

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution s = new Solution();
        int[] arr1 = {4, 3, 2, 1};
        int[] arr2 = {10};
        int[] arr3 = {4, 1, 2, 3};

        bw.write(Arrays.toString(s.solution(arr1)) + "\n");
        bw.write(Arrays.toString(s.solution(arr2)) + "\n");
        bw.write(Arrays.toString(s.solution(arr3)) + "\n");

        
        bw.flush();
        bw.close();
    }
}