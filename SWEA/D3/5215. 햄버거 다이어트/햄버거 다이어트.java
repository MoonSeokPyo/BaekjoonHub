import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_5215();
		
		br.close();
		bw.close();
	}
	
	static void func_5215() throws Exception {
        StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int[] dp = new int[l + 1];
			int[] score = new int[n + 1];
			int[] kcal = new int[n + 1];
			for (int j = 1; j <= n; j++) {
				st = new StringTokenizer(br.readLine());
				int t = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				score[j] = t;
				kcal[j] = k;
			}
			for (int j = 1; j <= n; j++) {
				for (int k = l; k - kcal[j] >= 0; k--) {
					dp[k] = Math.max(dp[k], dp[k - kcal[j]] + score[j]);
				}
			}
			sb.append('#').append(i).append(' ').append(dp[l]).append('\n');
		}
		bw.write(sb.toString());
	}
}