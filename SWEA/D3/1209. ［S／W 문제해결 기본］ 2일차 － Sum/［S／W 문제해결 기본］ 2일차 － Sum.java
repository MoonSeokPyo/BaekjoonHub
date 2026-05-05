import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1209();
        
		br.close();
		bw.close();
	}
	
	static void func_1209() throws Exception {
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= 10; t++) {
            br.readLine();
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}
			int max = 0;
			
			for (int i = 0; i < 100; i++) {
				int cntRow = 0, cntCol = 0;
				for (int j = 0; j < 100; j++) {
					cntRow += arr[i][j];
					cntCol += arr[j][i];
				}
				max = Math.max(max, cntRow);
				max = Math.max(max, cntCol);
			}
			int cnt1 = 0, cnt2 = 0;
			for (int i = 0; i < 100; i++) {
				cnt1 += arr[i][i];
				cnt2 += arr[i][99 - i]; 
			}
			max = Math.max(max, cnt1);
			max = Math.max(max, cnt2);
			sb.append('#').append(t).append(' ').append(max).append('\n');
		}
		bw.write(sb.toString());
	}
}