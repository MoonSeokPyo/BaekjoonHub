import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1249();
		
		br.close();
		bw.close();
	}
	
	static void func_1249() throws Exception {
		StringBuilder sb = new StringBuilder();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		int testcase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testcase; t++) {
			int n = Integer.parseInt(br.readLine());
			int[][] map = new int[n][n];
			for (int i = 0; i < n; i++) {
				String input = br.readLine();
				for (int j = 0; j < n; j++)
					map[i][j] = Character.getNumericValue(input.charAt(j));
			}
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++)
				Arrays.fill(arr[i], Integer.MAX_VALUE);
			PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
				return a[0] - b[0];
			});
			pq.add(new int[] {0, 0, 0});
			while (!pq.isEmpty()) {
				int[] cur = pq.poll();
				int time = cur[0];
				int y = cur[1];
				int x = cur[2];
				if (time > arr[y][x])
					continue;
				if (y == n - 1 && x == n - 1) {
					sb.append('#').append(t).append(' ').append(arr[y][x]).append('\n');
					break;
				}
				for (int i = 0; i < 4; i++) {
					int ny = y + dy[i];
					int nx = x + dx[i];
					if (ny >= 0 && ny < n && nx >= 0 && nx < n && time + map[ny][nx] < arr[ny][nx]) {
						arr[ny][nx] = time + map[ny][nx];
						pq.add(new int[] {arr[ny][nx], ny, nx});
					}
				}
			}
		}
		bw.write(sb.toString());
	}
}