import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int max = 0;
        	int min = 10000;
        	int sum = 0;
        	
        	for (int j = 0; j < 10; j++) {
        		int num = Integer.parseInt(st.nextToken());
        		
        		if (max < num) {
        			max = num;
        		}
        		
        		if (min > num) {
        			min = num;
        		}
            	sum += num;
        	}

    		sum = sum - (min + max);
    		float temp = (float) sum / 8;
    		int avg = Math.round(temp);
        	
        	bw.write("#" + (i + 1) + " " + avg + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}