import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		func_1767();
		
		br.close();
		bw.close();
	}
	
	// 프로세서 연결하기
	static void func_1767() throws Exception {
		StringBuilder sb = new StringBuilder();
		Context_1767 ct = new Context_1767();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = ct.N = Integer.parseInt(br.readLine());
			int[][] cell = ct.cell = new int[N][N];
			boolean[][] visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					cell[i][j] = Integer.parseInt(st.nextToken());
					if (cell[i][j] == 1)
						visited[i][j] = true;
				}
			}
			int cnt = 0;
			for (int i = 1; i < N - 1; i++) {
				for (int j = 1; j < N - 1; j++) {
					if (cell[i][j] == 1)
						cnt++;
				}
			}
			int[][] pos = new int[cnt][2];
			for (int i = 1; i < N - 1; i++) {
				for (int j = 1; j < N - 1; j++) {
					if (cell[i][j] == 1) {
						pos[--cnt][0] = i;
						pos[cnt][1] = j;
					}
				}
			}
			
			ct.maxConnected = 0;	ct.minCnt = Integer.MAX_VALUE;
			func_1767_solve(ct, visited, pos, 0, 0, 0);
			sb.append('#').append(tc).append(' ').append(ct.minCnt).append('\n');
		}
		bw.write(sb.toString());
	}
	static void func_1767_solve(Context_1767 ct, boolean[][] visited, int[][] pos, int depth, int connected, int cnt) {
		if (depth == pos.length) {
			if (connected > ct.maxConnected) {
				ct.maxConnected = connected;
				ct.minCnt = cnt;
			} else if (connected == ct.maxConnected)
				ct.minCnt = Math.min(ct.minCnt, cnt);
			return;
		}
		int y = pos[depth][0];
		int x = pos[depth][1];
		for (int i = 0; i < 4; i++) {
			int result = func_1767_visit(ct, visited, y, x, i, true);
			if (result >= 0) {
				func_1767_solve(ct, visited, pos, depth + 1, connected + 1, cnt + result);
				func_1767_visit(ct, visited, y, x, i, false);
			}
			else
				func_1767_solve(ct, visited, pos, depth + 1, connected, cnt);
			
		}
		
	}
	static int func_1767_visit(Context_1767 ct, boolean[][] visited, int y, int x, int dir, boolean bool) {
		int cnt = 0;
		for (int i = 1; i < ct.N; i++) {
			int ny = y + (i * ct.dy[dir]);
			int nx = x + (i * ct.dx[dir]);
			if (0 <= ny && ny < ct.N && 0 <= nx && nx < ct.N) {
				if (visited[ny][nx] == !bool) {
					visited[ny][nx] = bool;
					cnt++;
				} else {
					for (int j = 1; j < i; j++) {
						ny = y + (j * ct.dy[dir]);
						nx = x + (j * ct.dx[dir]);
						visited[ny][nx] = !bool;
					}
					return -1;
				}
			} else 
				break;
		}
		return cnt;
	}
	static class Context_1767{
		int[] dy = {-1, 0, 1, 0};
		int[] dx = {0, 1, 0, -1};
		int N;
		int[][] cell;
		int maxConnected;
		int minCnt;
	}
}