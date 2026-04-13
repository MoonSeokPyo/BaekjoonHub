import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11403();
		
		br.close();
		bw.close();
	}
	
	static void func_11403() throws Exception {
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		List<Integer>[] edge = new List[n];
		int[][] graph = new int[n][n];
		for (int i = 0; i < n; i++) {
			edge[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int input = Integer.parseInt(st.nextToken());
				if (input == 1) {
					edge[i].add(j);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			func_11403_solve(graph, edge, i, i, new boolean[n]);
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					sb.append(graph[i][j]).append(' ');
			}
			sb.append('\n');
		}
		bw.write(sb.toString());
	}
	static void func_11403_solve(int[][] graph, List<Integer>[] edge, int start, int node, boolean[] visited) {
		if (visited[node])
			return;
		visited[node] = true;
		for (int i = 0; i < edge[node].size(); i++) {
			int next = edge[node].get(i);
			graph[start][next] = 1;
			func_11403_solve(graph, edge, start, next, visited);
		}
	}
}