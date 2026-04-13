import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_21736();
		
		br.close();
		bw.close();
	}
	
	
	static void func_21736() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] campus = new char[n][m];
		boolean[][] visited = new boolean[n][m];
		Queue<int[]> q = new ArrayDeque<>();
		int[] dy = {0, 0, -1, 1};
		int[] dx = {-1, 1, 0, 0};
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine(); 
			for (int j = 0; j < m; j++) {
				campus[i][j] = input.charAt(j);
				if (campus[i][j] == 'I') {
					q.offer(new int[] {i, j});
					visited[i][j] = true;
				}
			}
		}
		int cnt = 0;
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			for (int i = 0; i < 4; i++) {
				int cy = dy[i] + cur[0];
				int cx = dx[i] + cur[1];
				if (cy >= 0 && cy < n && cx >= 0 && cx < m && !visited[cy][cx] && campus[cy][cx] != 'X') {
					visited[cy][cx] = true;
					q.offer(new int[] {cy, cx});
					if (campus[cy][cx] == 'P')
						cnt++;
				}
			}
		}
		if (cnt > 0)
			bw.write(cnt + "");
		else
			bw.write("TT");
	}
}