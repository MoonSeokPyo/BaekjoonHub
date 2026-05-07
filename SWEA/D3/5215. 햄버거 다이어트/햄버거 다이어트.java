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
			int[] score = new int[n];
			int[] kcal = new int[n];
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				int t = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				score[j] = t;
				kcal[j] = k;
			}
			sb.append('#').append(i).append(' ').append(func_5215_solve(l, score, kcal, 0, 0, 0)).append('\n');
		}
		bw.write(sb.toString());
	}
	static int func_5215_solve(int l, int[] score, int[] kcal, int depth, int sCnt, int kCnt) {
		if (depth == score.length) {
			return sCnt;
		}
		int max = Integer.MIN_VALUE;
		
		if (kCnt + kcal[depth] <= l)
			max = Math.max(max, func_5215_solve(l, score, kcal, depth + 1, sCnt + score[depth], kCnt + kcal[depth]));
		
		max = Math.max(max, func_5215_solve(l, score, kcal, depth + 1, sCnt, kCnt));
		
		return max;
	}
}