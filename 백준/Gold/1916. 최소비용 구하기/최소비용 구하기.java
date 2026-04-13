import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1916();
		
		br.close();
		bw.close();
	}
	
	static void func_1916() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		List<int[]>[] adj = new List[n + 1];
		for (int i = 1; i <= n; i++) {
			adj[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			adj[from].add(new int[] {to, cost});
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		int[] dist = new int[n + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
			return a[1] - b[1];
		});
		q.add(new int[] {start, 0});
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int node = cur[0];
			int cost = cur[1];
			if (cost > dist[node])
				continue;
			if (node == end) {
				bw.write(cost + "");
				return;
			}
			for (int[] next : adj[node]) {
				int nextNode = next[0];
				int nextCost = next[1] + cost;
				if (nextCost < dist[nextNode]) {
					dist[nextNode] = nextCost;
					q.add(new int[] {nextNode, nextCost});
				}
			}
		}
	}
}