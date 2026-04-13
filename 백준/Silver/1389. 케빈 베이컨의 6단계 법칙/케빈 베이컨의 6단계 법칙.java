import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1389();
		
		br.close();
		bw.close();
	}
	
	static void func_1389() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		List<Integer>[] user = new List[n + 1];
		for (int i = 0; i <= n; i++)
			user[i] = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (!user[a].contains(b))
				user[a].add(b);
			if (!user[b].contains(a))
				user[b].add(a);
		}
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int cnt = 0;
			boolean[] visited = new boolean[n + 1];
			Queue<Integer> q = new ArrayDeque<>();
			q.add(i);
			visited[i] = true;
			while (!q.isEmpty()) {
				cnt++;
				int size = q.size();
				for (int j = 0; j < size; j++) {
					int cur = q.poll();
					for (int k = 0; k < user[cur].size(); k++) {
						int next = user[cur].get(k);
						if (!visited[next]) {
							sum += cnt;
							visited[next] = true;
							q.add(next);
						}
					}
				}
			}
			if (sum < min) {
				index = i;
				min = sum;
			}
		}
		
		bw.write(index + "");
	}
}