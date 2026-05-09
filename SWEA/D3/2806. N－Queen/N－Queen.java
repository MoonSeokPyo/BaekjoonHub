import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_2806();
		
		br.close();
		bw.close();
	}
	
	static void func_2806() throws Exception {
		StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testcase; t++) {
			int n = Integer.parseInt(br.readLine());
			sb.append('#').append(t).append(' ').append(func_2806_solve(new boolean[n][n], n, 0)).append('\n');
		}
		bw.write(sb.toString());
	}
	static int func_2806_solve(boolean[][] visited, int n, int depth) {
		if (depth == n)
			return 1;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (func_2806_isValid(visited, n, depth, i)) {
				visited[depth][i] = true;
				cnt += func_2806_solve(visited, n, depth + 1);
				visited[depth][i] = false;
			}
		}
		return cnt;
	}
	static boolean func_2806_isValid(boolean[][] visited, int n, int y, int x) {
		for (int i = 0; i < n; i++) {
			if (visited[i][x])
				return false;
			int ny = y + i;
			int nx = x + i;
			if (ny >= 0 && ny < n && nx >= 0 && nx < n && visited[ny][nx])
				return false;
			ny = y + i;
			nx = x - i;
			if (ny >= 0 && ny < n && nx >= 0 && nx < n && visited[ny][nx])
				return false;
			ny = y - i;
			nx = x + i;
			if (ny >= 0 && ny < n && nx >= 0 && nx < n && visited[ny][nx])
				return false;
			ny = y - i;
			nx = x - i;
			if (ny >= 0 && ny < n && nx >= 0 && nx < n && visited[ny][nx])
				return false;
			
		}
		return true;
	}
}