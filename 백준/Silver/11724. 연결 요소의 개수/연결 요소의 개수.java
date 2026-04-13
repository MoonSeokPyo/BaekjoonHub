import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11724();
		
		br.close();
		bw.close();
	}
	
	static void func_11724() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		ArrayList<Integer>[] node = new ArrayList[n + 1];
		boolean[] visited = new boolean[n + 1];
		for (int i = 0; i < n + 1; i++)
			node[i] = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			node[u].add(v);
			node[v].add(u);
		}
		Queue<Integer> que = new ArrayDeque<>();
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				cnt++;
				visited[i] = true;
				que.add(i);
				while(!que.isEmpty()) {
					int cur = que.poll();
					for (int next : node[cur]) {
						if (!visited[next]) {
							visited[next] = true;
							que.add(next);
						}
					}
				}
			}
		}
		bw.write(cnt + "");
	}
}