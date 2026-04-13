import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11725();
		
		br.close();
		bw.close();
	}
	
	static void func_11725() throws Exception {
		HashMap <Integer, Integer> m = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		List<Integer>[] list = new List[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		boolean[] visited = new boolean[n + 1];
		Queue<Integer> q = new ArrayDeque<>();
		q.add(1);
		visited[1] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			for (int i = 0; i < list[cur].size(); i++) {
				int next = list[cur].get(i);
				if (!visited[next]) {
					visited[next] = true;
					m.put(next, cur);
					q.offer(next);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= n; i++) {
			sb.append(m.get(i)).append('\n');
		}
		bw.write(sb.toString());
	}
}