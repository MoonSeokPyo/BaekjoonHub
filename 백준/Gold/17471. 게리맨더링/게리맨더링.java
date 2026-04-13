import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_17471();
		
		br.close();
		bw.close();
	}
	
	static void func_17471() throws Exception {
		int n = Integer.parseInt(br.readLine());
		List<Integer>[] adj = new List[n + 1];
		for (int i = 1; i <= n; i++)
			adj[i] = new ArrayList<>();
		int[] population = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++)
			population[i] = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			while(st.hasMoreTokens()) {
				int node = Integer.parseInt(st.nextToken());
				adj[i].add(node);
			}
		}
		boolean[] zone = new boolean[n + 1];
		int result = func_17471_solve(1, zone, n, adj, population);
		result = result == Integer.MAX_VALUE ? -1 : result;
		bw.write(result + "");
	}
	static int func_17471_solve(int depth, boolean[] zone , int n, List<Integer>[] adj, int[] population) {
		if(depth > n) {
			if (func_17471_isValid(zone, adj, n)) {
				int a = 0;
				int b = 0;
				for (int i = 1; i <= n; i++) {
					if (zone[i])
						a += population[i];
					else
						b += population[i];
				}
				return Math.abs(a - b);
			}
			return Integer.MAX_VALUE;
		}
		int min = Integer.MAX_VALUE;
		zone[depth] = true;
		min = Math.min(min, func_17471_solve(depth + 1, zone, n, adj, population));
		zone[depth] = false;
		min = Math.min(min, func_17471_solve(depth + 1, zone, n, adj, population));
		return min;
	}
	static boolean func_17471_isValid(boolean[] zone, List<Integer>[] adj, int n) {
		boolean[] visited = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			if (zone[i]) {
				func_17471_dfs(adj, visited, i, zone);
				break;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (!zone[i]) {
				func_17471_dfs(adj, visited, i, zone);
				break;
			}
		}
		for (int i = 1; i <= n; i++)
			if (!visited[i])
				return false;
		return true;
	}
	static void func_17471_dfs(List<Integer>[] adj, boolean[] visited, int node, boolean[] zone) {
		visited[node] = true;
		for (int i = 0; i < adj[node].size(); i++) {
			int nextNode = adj[node].get(i);
			if (!visited[nextNode] && zone[node] == zone[nextNode])
				func_17471_dfs(adj, visited, nextNode, zone);
		}
	}
}