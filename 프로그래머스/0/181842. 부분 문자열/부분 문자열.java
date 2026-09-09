import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        if (str2.contains(str1)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("test", "test2"));
    }
}