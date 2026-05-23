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
        	char[] arr = new char[txt.length()];
        	int result = 0;
        	
        	for (int j = 0; j < txt.length(); j++) {
        		arr[j] = txt.charAt(j);
        		int start = 0;
        		int end = txt.length() - 1;
        		
        		if (arr[start] == arr[end]) {
        			result = 1;
        		} else {
        			result = 0;
        		}
        		
        		start++;
        		end--;
        	}
        	bw.write("#" + (i + 1) + " " + result + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}