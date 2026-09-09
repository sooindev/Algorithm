import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }
        
        return answer;
    }
}

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        // System.out.println(s.solution(arr, 3));

        int[] answer = s.solution(arr, 3);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(answer[i]);
        }
    }
}