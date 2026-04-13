import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1260();
		
		br.close();
		bw.close();
	}
	static void func_1260() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), V = Integer.parseInt(st.nextToken());
		List<Integer>[] adj = new ArrayList[N + 1];
		// graph
		for (int i = 0; i < N + 1; i++) {
			adj[i] = new ArrayList<>();
		}
		int u, v;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			adj[u].add(v);
			adj[v].add(u);
		}
		for (List<Integer> next : adj) {
			next.sort(Comparator.naturalOrder());
		}
		boolean[] visited = new boolean[N + 1];
		
		dfs(adj, visited, V);
		
		bw.newLine();
		bfs(adj, V, N);
	}
	static void dfs(List<Integer>[] adj, boolean[] visited, int V) throws Exception {
		visited[V] = true;
		bw.write(V + " ");
		for (int next : adj[V]) {
			if(!visited[next])
				dfs(adj, visited, next);
		}
	}
	static void bfs(List<Integer>[] adj, int V, int N) throws Exception {
		boolean[] visited = new boolean[N + 1];
		Queue<Integer> queue = new ArrayDeque<>();
		visited[V] = true;
		queue.add(V);
		bw.write(V + " ");
		while(!queue.isEmpty()) {
			V = queue.remove();
			for (int next : adj[V]) {
				if(!visited[next]) {
					queue.add(next);
					visited[next] = true;
					bw.write(next + " ");
				}
			}
		}
	}
}