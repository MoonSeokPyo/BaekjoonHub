import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2178();
		
		br.close();
		bw.close();
	}
	
	static void func_2178() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		boolean[][] visited = new boolean[n][m];
		int[][] cnt = new int[n][m];
		Queue<int[]> q = new ArrayDeque<>();
		int[][] arr = new int[n][m];
		int[] dy = { -1, 1, 0, 0};
		int[] dx = { 0, 0, -1, 1};
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = Character.getNumericValue(br.read());
			}
			br.readLine();
		}
		q.add(new int[] {0, 0});
		visited[0][0] = true;
		cnt[0][0] = 1;
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			for (int i = 0; i < 4; i++) {
				int cy = dy[i] + cur[0];
				int cx = dx[i] + cur[1];
				if(cy >= 0 && cy < n && cx >= 0 && cx < m && arr[cy][cx] == 1 && !visited[cy][cx]) {
					visited[cy][cx] = true;
					cnt[cy][cx] = cnt[cur[0]][cur[1]] + 1;
					q.add(new int[] {cy, cx});
				}
			}
		}
		bw.write(cnt[n - 1][m - 1] + "");
	}
}