import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1979();
		
		br.close();
		bw.close();
	}
	
	static void func_1979() throws Exception {
		StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testcase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[][] board = new int[n][n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++)
					board[i][j] = Integer.parseInt(st.nextToken());
			}
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				int lenRow = 0;
				int lenCol = 0;
				for (int j = 0; j < n; j++) {
					if (board[i][j] == 1) {
						lenRow++;
					} else {
						if (lenRow == k)
							cnt++;
						lenRow = 0;
					}
					if (board[j][i] == 1) {
						lenCol++;
					} else {
						if (lenCol == k)
							cnt++;
						lenCol = 0;
					}
				}
				if (lenRow == k)
					cnt++;
				if (lenCol == k)
					cnt++;
			}
			sb.append('#').append(t).append(' ').append(cnt).append('\n');
		}
		bw.write(sb.toString());
    }
}