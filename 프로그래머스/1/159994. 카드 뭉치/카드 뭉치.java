import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < goal.length; i++) {
            String currentWord = goal[i];

            if (idx1 < cards1.length && cards1[idx1].equals(currentWord)) {
                idx1++;
            }
            else if (idx2 < cards2.length && cards2[idx2].equals(currentWord)) {
                idx2++;
            }
            else {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution s = new Solution();
        String[] arr1 = {"i", "drink", "water"};
        String[] arr2 = {"want", "to"};
        String[] arr3 = {"i", "want", "to", "drink", "water"};

        bw.write(s.solution(arr1, arr2, arr3) + "\n"); // Yes 출력

        bw.flush();
        bw.close();
    }
}