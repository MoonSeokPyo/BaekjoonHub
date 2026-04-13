import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1238();
		
		br.close();
		bw.close();
	}
	
	static void func_1238() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		List<int[]>[] adj = new List[n + 1];
		for (int i = 1; i <= n; i++)
			adj[i] = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			adj[start].add(new int[] {end, time});
		}
		
		int[][] time = new int[n + 1][n + 1];
		time[x][x] = Integer.MIN_VALUE;
		Queue<Integer> q = new ArrayDeque<>();
		q.add(x);
		while(!q.isEmpty()) {
			int cur = q.poll();
			for (int[] next : adj[cur]) {
				int nextNode = next[0];
				int nextTime = next[1];
				if (time[x][nextNode] == 0 || time[x][cur] + nextTime < time[x][nextNode]) {
					time[x][nextNode] = time[x][cur] + nextTime;
					q.add(nextNode);
				}
			}
		}
		int max = 0;
		for (int i = 1; i <= n; i++) {
			if (i == x)
				continue;
			q.clear();
			time[i][i] = Integer.MIN_VALUE;
			q.add(i);
			while(!q.isEmpty()) {
				int cur = q.poll();
				for (int[] next : adj[cur]) {
					int nextNode = next[0];
					int nextTime = next[1];
					if (nextNode == x) {
						time[i][x] = Math.min(time[i][x], time[i][cur] + nextTime);
						break;
					} else if (time[i][nextNode] == 0 || time[i][cur] + nextTime < time[i][nextNode]) {
						time[i][nextNode] = time[i][cur] + nextTime;
						q.add(nextNode);
					}
				}
			}
			max = Math.max(max, time[i][x] + time[x][i]);
		}
		
		bw.write(max + "");
	}
}