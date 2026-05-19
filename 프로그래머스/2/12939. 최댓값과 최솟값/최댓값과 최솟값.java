import java.io.*;

public class Solution {
    public String solution(String s) throws IOException {
        String[] temp = s.split(" ");
        int[] arr = new int[temp.length];

        int min = Integer.parseInt(temp[0]);
        int max = Integer.parseInt(temp[0]);

        for (int i = 1; i < temp.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return min + " " + max;
    }

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        System.out.println(s.solution("1 2 3 4"));
    }
}