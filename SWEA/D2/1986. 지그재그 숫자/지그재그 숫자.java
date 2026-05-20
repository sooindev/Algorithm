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
            int n = Integer.parseInt(br.readLine());
            int result = 0;
           
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 1) { 
                    result += j;
                } else {
                    result -= j;
                }
            }
            
            bw.write("#" + (i + 1) + " " + result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}