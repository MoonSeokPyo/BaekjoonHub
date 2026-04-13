import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_7569();
		
		br.close();
		bw.close();
	}
	
	static void func_7569() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int[][][] tomato = new int[h][n][m];
		int zeroCount = 0;
		int[] dz = {-1, 1, 0, 0, 0, 0};
		int[] dy = {0, 0, -1, 1, 0, 0};
		int[] dx = {0, 0, 0, 0, -1, 1};
		Queue<int[]> q = new ArrayDeque<>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < m; k++) {
					tomato[i][j][k] = Integer.parseInt(st.nextToken());
					if (tomato[i][j][k] == 1)
						q.offer(new int[] {i, j, k});
					else if (tomato[i][j][k] == 0)
						zeroCount++;
				}
			}
		}
		
		int day = 0;
		while (!q.isEmpty()) {
			if (zeroCount == 0) {
				bw.write(day + "");
				return;
			}
			int qSize = q.size();
			for (int i = 0; i < qSize; i++) {
				int[] cur = q.poll();
				for (int j = 0; j < 6; j++) {
					int cz = cur[0] + dz[j];
					int cy = cur[1] + dy[j];
					int cx = cur[2] + dx[j];
					if (cz >= 0 && cz < h && cy >= 0 && cy < n && cx >= 0 && cx < m && tomato[cz][cy][cx] == 0) {
						q.offer(new int[] {cz, cy, cx});
						tomato[cz][cy][cx] = 1;
						zeroCount--;
					}
				}
			}
			day++;
		}
		bw.write(-1 + "");
	}
}