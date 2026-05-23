import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            String txt = br.readLine();
            int result = 0;
            
            for (int len = 1; len <= 10; len++) {
                
                String firstWord = txt.substring(0, len);
                String secondWord = txt.substring(len, len + len);
                
                if (firstWord.equals(secondWord)) {
                    result = len;
                    break;
                }
            }
            
            bw.write("#" + (i + 1) + " " + result + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}