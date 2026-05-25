import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution s = new Solution();
        String[] arr1 = {"leo", "kiki", "eden"};
        String[] arr2 = {"eden", "kiki"};

        bw.write(s.solution(arr1, arr2) + "\n");

        bw.flush();
        bw.close();
    }
}