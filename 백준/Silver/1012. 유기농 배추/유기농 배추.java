import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1012();
		
		br.close();
		bw.close();
	}
    
	static void func_1012() throws Exception {
		int[] dy = {0, 0, 1, -1 };
		int[] dx = {1, -1, 0, 0};
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[][] arr = new int[n][m];
			boolean[][] state = new boolean[n][m];
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[y][x] = 1;
			}
			int cnt = func_1012_find(dy, dx, arr, state, n, m);
			sb.append(cnt).append('\n');
		}
		bw.write(sb.toString());
	}
	static int func_1012_find(int[] dy, int[] dx, int[][] arr, boolean[][] state, int n, int m) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!state[i][j] && arr[i][j] == 1) {
					cnt++;
					func_1012_dir(i, j, dy, dx, arr, state, n, m);
				}
			}
		}
		return cnt;
	}
	static void func_1012_dir(int y, int x, int[] dy, int[] dx, int[][] arr, boolean[][] state, int n, int m) {
		state[y][x] = true;
		for (int i = 0; i < 4; i++) {
			int diry = y + dy[i];
			int dirx = x + dx[i];
			if (diry >= 0 && diry < n && dirx >= 0 && dirx < m && arr[diry][dirx] == 1 && !state[diry][dirx]) {
				func_1012_dir(diry, dirx, dy, dx, arr, state, n, m);
			}
		}
	}
}