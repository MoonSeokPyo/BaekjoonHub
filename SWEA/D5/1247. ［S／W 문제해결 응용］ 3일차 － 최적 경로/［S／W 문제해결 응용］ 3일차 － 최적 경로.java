import java.io.*;
import java.util.*;

public class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String args[]) throws Exception {
		func_1247();
		
		bw.close();
		br.close();
	}
	
	// 최적 경로
	static void func_1247() throws Exception {
		Context_1247 ct = new Context_1247();
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			ct.min = Integer.MAX_VALUE;
			int N = ct.N = Integer.parseInt(br.readLine());
			int[][] pos = new int[2 + N + 1][2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= 2 + N; i++) {
				pos[i][0] = Integer.parseInt(st.nextToken());
				pos[i][1] = Integer.parseInt(st.nextToken());
			}
			int[][] dist = ct.dist = new int[2 + N + 1][2 + N + 1];
			for (int i = 1; i <= 2 + N; i++) {
				for (int j = 1; j <= 2 + N; j++) {
					dist[i][j] = Math.abs(pos[i][0] - pos[j][0]) + Math.abs(pos[i][1] - pos[j][1]);
				}
			}
			
			func_1247_dfs(ct, new boolean[2 + N + 1], 1, 0, 0);
			int cnt = ct.min;
			
			
			sb.append('#').append(tc).append(' ').append(cnt).append('\n');
		}
		bw.write(sb.toString());
	}
	static void func_1247_dfs(Context_1247 ct, boolean[] visited, int cur, int depth, int cnt) {
		if (cnt >= ct.min)
			return;
		int N = ct.N;
		int[][] dist = ct.dist;
		if (depth == N) {
			ct.min = Math.min(ct.min, cnt + dist[cur][2]);
			return;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 3; i <= 2 + N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				func_1247_dfs(ct, visited, i, depth + 1, cnt + dist[cur][i]);
				visited[i] = false;
			}
		}
	}
	static class Context_1247 {
		int min;
		int N;
		int[][] dist;
	}
}