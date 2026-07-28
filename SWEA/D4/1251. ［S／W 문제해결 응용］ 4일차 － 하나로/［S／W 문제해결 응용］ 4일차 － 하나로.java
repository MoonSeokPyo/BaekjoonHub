import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		func_1251();
		
		br.close();
		bw.close();
	}
	
    // 하나로
	static void func_1251() throws Exception {
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			long[][] island = new long[N + 1][2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++)
				island[i][1] = Long.parseLong(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++)
				island[i][0] = Long.parseLong(st.nextToken());
			
			double E = Double.parseDouble(br.readLine());
			boolean[] visited = new boolean[N + 1];
			visited[1] = true;
			long cost = -1;
			cost = func_1251_solve(island, visited, N, E, 0, 0);
			sb.append('#').append(tc).append(' ').append(cost).append('\n');
		}
		bw.write(sb.toString());
	}
	static long func_1251_solve(long[][] island, boolean[] visited, int N, double E, int depth, long total) {
		if (depth == N-1) {
			return (long)Math.round(total * E);
		}
		int idx = 0;
		long min = Long.MAX_VALUE;
		for (int i = 1; i <= N; i++) {
			if (visited[i]) {
				long cy = island[i][0];
				long cx = island[i][1];
				for (int j = 1; j <= N; j++) {
					if (!visited[j]) {
						long ny = island[j][0];
						long nx = island[j][1];
						long dist = Math.abs(cy - ny) * Math.abs(cy - ny) + Math.abs(cx - nx) * Math.abs(cx - nx);
						if (dist < min) {
							min = dist;
							idx = j;
						}
					}
				}
			}
		}
		visited[idx] = true;
		return func_1251_solve(island, visited, N, E, depth + 1, total + min);
	}
}