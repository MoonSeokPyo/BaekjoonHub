import java.util.*;
import java.io.*;
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_2805();
		
		br.close();
		bw.close();
	}
	
	static void func_2805() throws Exception {
		StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testcase; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] map = new int[n][n];
			for (int j = 0; j < n; j++) {
				String values = br.readLine();
				for (int k = 0; k < n; k++)
					map[j][k] = Character.getNumericValue(values.charAt(k));
			}
			
			int cnt = 0;
			for (int j = 0; j < n; j++)
				cnt += map[n / 2][j];
			for (int j = 1; j <= n / 2; j++) {
				for (int k = j; k < n - j; k++) {
					cnt += map[n / 2 + j][k];
					cnt += map[n / 2 - j][k];
				}
			}
			sb.append('#').append(i).append(' ').append(cnt).append('\n');
		}
		bw.write(sb.toString());
	}
}