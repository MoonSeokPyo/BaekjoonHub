import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_14940();
		
		br.close();
		bw.close();
	}
	
	
	static void func_14940() throws Exception {
		int[] dy = {0, 0, -1, 1};
		int[] dx = {-1, 1, 0, 0};
		Queue<Integer> qy = new ArrayDeque<>();
		Queue<Integer> qx = new ArrayDeque<>();
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n][m];
		int[][] dist = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) {
					qy.offer(i);
					qx.offer(j);
				}
			}
		}
		
		while(!qy.isEmpty()) {
			int y = qy.poll();
			int x = qx.poll();
			for (int i = 0; i < 4; i++) {
				int cy = y + dy[i];
				int cx = x + dx[i];
				if (cy >= 0 && cy < n && cx >= 0 && cx < m && map[cy][cx] == 1 && dist[cy][cx] == 0) {
					dist[cy][cx] = dist[y][x] + 1;
					qy.offer(cy);
					qx.offer(cx);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j] == 1 && dist[i][j] == 0)
					sb.append(-1).append(' ');
				else
					sb.append(dist[i][j]).append(' ');
			}
			sb.append('\n');
		}
		bw.write(sb.toString());
	}
}