import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_14500();
		
		br.close();
		bw.close();
	}
	
	static void func_14500() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		int max = 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i][j]);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visited[i][j] = true;
				result = Math.max(result, func_14500_dfs(arr[i][j], 1, visited, arr, i, j, n, m));
				visited[i][j] = false;
				int sum = arr[i][j];
				int cnt = 0;
				int min = 1000;
				int ny = i - 1;
				int nx = j;
				if (ny >= 0 && ny < n) {
					sum += arr[ny][nx];
					min = Math.min(min, arr[ny][nx]);
					cnt++;
				}
				ny = i + 1;
				nx = j;
				if (ny >= 0 && ny < n) {
					sum += arr[ny][nx];
					min = Math.min(min, arr[ny][nx]);
					cnt++;
				}
				ny = i;
				nx = j - 1;
				if (nx >= 0 && nx < m) {
					sum += arr[ny][nx];
					min = Math.min(min, arr[ny][nx]);
					cnt++;
				}
				ny = i;
				nx = j + 1;
				if (nx >= 0 && nx < m) {
					sum += arr[ny][nx];
					min = Math.min(min, arr[ny][nx]);
					cnt++;
				}
				if (cnt == 4)
					sum -= min;
				result = Math.max(result, sum);
			}
		}
		bw.write(result + "");
	}
	static int func_14500_dfs(int cnt, int depth, boolean[][]visited, int[][] arr, int y, int x, int n, int m) {
		if (depth == 4) {
			return cnt;
		}
		int max = cnt;
		int ny = y - 1;
		int nx = x;
		if (ny >= 0 && ny < n && !visited[ny][nx]) {
			visited[ny][nx] = true;
			max = Math.max(max, func_14500_dfs(cnt + arr[ny][nx], depth + 1, visited, arr, ny, nx, n, m));
			visited[ny][nx] = false;
		}
		ny = y + 1;
		nx = x;
		if (ny >= 0 && ny < n && !visited[ny][nx]) {
			visited[ny][nx] = true;
			max = Math.max(max, func_14500_dfs(cnt + arr[ny][nx], depth + 1, visited, arr, ny, nx, n, m));
			visited[ny][nx] = false;
		}
		ny = y;
		nx = x - 1;
		if (nx >= 0 && nx < m && !visited[ny][nx]) {
			visited[ny][nx] = true;
			max = Math.max(max, func_14500_dfs(cnt + arr[ny][nx], depth + 1, visited, arr, ny, nx, n, m));
			visited[ny][nx] = false;
		}
		ny = y;
		nx = x + 1;
		if (nx >= 0 && nx < m && !visited[ny][nx]) {
			visited[ny][nx] = true;
			max = Math.max(max, func_14500_dfs(cnt + arr[ny][nx], depth + 1, visited, arr, ny, nx, n, m));
			visited[ny][nx] = false;
		}
		return max;
	}
}