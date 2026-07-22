import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		func_2105();
		
		br.close();
		bw.close();
	}
	
	// 디저트 카페
	static void func_2105() throws Exception {
		Context_2105 ct = new Context_2105();
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			int N = ct.N = Integer.parseInt(br.readLine());
			int[][] square = ct.square = new int[N][N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					square[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			boolean[] visited = new boolean[100 + 1];
			int max = -1;
			for (int i = 0; i < N - 2; i++) {
				for (int j = 1; j < N - 1; j++) {
					ct.startY = i;	ct.startX = j;
					int dessert = square[i][j];
					visited[dessert] = true;
					max = Math.max(max, func_2105_solve(ct, visited, 0, 1, i + 1, j + 1));
					visited[dessert] = false;
				}
			}
			
			sb.append('#').append(tc).append(' ').append(max).append('\n');
		}
		bw.write(sb.toString());
	}
	static int func_2105_solve(Context_2105 ct, boolean[] visited, int dir, int eat, int y, int x) {
		if (dir == 3 && y == ct.startY && x == ct.startX) {
			return eat;
		}
		int dessert = ct.square[y][x];
		if (visited[dessert])
			return -1;
		visited[dessert] = true;
		
		int max = -1;
		int ny = y + ct.dy[dir];
		int nx = x + ct.dx[dir];
		if (0 <= ny && ny < ct.N && 0 <= nx && nx < ct.N)
			max = Math.max(max, func_2105_solve(ct, visited, dir, eat + 1, ny, nx));
		
		if (dir < 3) {
			dir++;
			ny = y + ct.dy[dir];
			nx = x + ct.dx[dir];
			if (0 <= ny && ny < ct.N && 0 <= nx && nx < ct.N)
				max = Math.max(max, func_2105_solve(ct, visited, dir, eat + 1, ny, nx));
		}
		
		visited[dessert] = false;
		
		return max;
	}
	static class Context_2105{
		final int[] dy = {1, 1, -1, -1};
		final int[] dx = {1, -1, -1, 1};
		int N;
		int[][] square;
		int startY;
		int startX;
	}
}