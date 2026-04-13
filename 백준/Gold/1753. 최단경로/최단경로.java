import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1753();
		
		br.close();
		bw.close();
	}
	
	static void func_1753() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(br.readLine());
		List<int[]>[] adj = new List[v + 1];
		for (int i = 1; i <= v; i++)
			adj[i] = new ArrayList<>();
		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			adj[from].add(new int[] {to, w});
		}
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> {
			return a[1] - b[1];
		});
		int[] dist = new int[v + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[k] = 0;
		pq.add(new int[] {k, 0});
		while (!pq.isEmpty()) {
			int[] cur = pq.poll();
			int node = cur[0];
			int w = cur[1];
			if (dist[node] < w)
				continue;
			if (adj[node].isEmpty())
				continue;
			for (int[] next : adj[node]) {
				int nextNode = next[0];
				int nextW = next[1] + w;
				if (nextW < dist[nextNode]) {
					dist[nextNode] = nextW;
					pq.add(new int[] {nextNode, nextW});
				}
			}
		}
		for (int i = 1; i <= v; i++) {
			if (dist[i] == Integer.MAX_VALUE)
				bw.write("INF\n");
			else
				bw.write(dist[i] + "\n");
		}
	}
}