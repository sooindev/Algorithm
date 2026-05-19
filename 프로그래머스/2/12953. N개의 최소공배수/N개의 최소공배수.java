import java.io.*;

public class Solution {

    private int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }

    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int gcd = getGCD(answer, arr[i]);

            answer = (answer * arr[i]) / gcd;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        int[] arr1 = {2, 6, 8, 14};
        int[] arr2 = {1, 2, 3};

        System.out.println(s.solution(arr1));
        System.out.println(s.solution(arr2));
    }
}