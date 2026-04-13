import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15654();
		
		br.close();
		bw.close();
	}
	
	static void func_15654() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		boolean[] visited = new boolean[n];
		int[] path = new int[m];
		for (int i = 0; i < n; i++) {
			func_15654_solve(sb, path, arr, visited, n, m, 0, i);
		}
		bw.write(sb.toString());
	}
	static void func_15654_solve(StringBuilder sb, int[] path, int[] arr, boolean[] visited, int n,int m, int depth, int idx) {
		path[depth] = arr[idx];
		if (depth == m - 1) {
			for (int i = 0; i < m; i++) {
				sb.append(path[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		visited[idx] = true;
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				func_15654_solve(sb, path, arr, visited, n, m, depth + 1, i);
			}
		}
		visited[idx] = false;
	}
}