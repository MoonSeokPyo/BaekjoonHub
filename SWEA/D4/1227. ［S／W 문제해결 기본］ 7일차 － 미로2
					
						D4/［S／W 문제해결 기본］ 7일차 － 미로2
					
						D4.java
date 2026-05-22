import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1227();
		
		br.close();
		bw.close();
	}
	
	static void func_1227() throws Exception {
		StringBuilder sb = new StringBuilder();
		int[][] board = new int[100][100];
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		for (int tc = 1; tc <= 10; tc++) {
			int testcase = Integer.parseInt(br.readLine());
			int[] start = new int[2];
			for (int i = 0; i < 100; i++) {
				String input = br.readLine();
				for (int j = 0; j < 100; j++) {
					board[i][j] = Character.getNumericValue(input.charAt(j));
					if (board[i][j] == 2) {
						start[0] = i;
						start[1] = j;
					}
				}
			}
			int result = 0;
			boolean[][] visited = new boolean[100][100];
			visited[start[0]][start[1]] = true;
			Queue<int[]> q = new ArrayDeque<>();
			q.add(start);
			while(!q.isEmpty()) {
				int[] cur = q.poll();
				int y = cur[0];
				int x = cur[1];
				if (board[y][x] == 3) {
					result = 1;
					break;
				}
				for (int i = 0; i < 4; i++) {
					int ny = y + dy[i];
					int nx = x + dx[i];
					if (ny < 100 && ny >= 0 && nx < 100 && nx >= 0 && board[ny][nx] != 1 && !visited[ny][nx]) {
						visited[ny][nx] = true;
						q.add(new int[] {ny, nx});
					}
				}
			}
			sb.append('#').append(tc).append(' ').append(result).append('\n');
		}
		bw.write(sb.toString());
	}
}