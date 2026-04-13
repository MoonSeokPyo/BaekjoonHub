import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9019();
		
		br.close();
		bw.close();
	}
	
	static void func_9019() throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			char[] cmd = new char[10000];
			boolean[] visited = new boolean[10000];
			int[] parent = new int[10000];
			Queue<Integer> q = new ArrayDeque<>();
			q.add(a);
			visited[a] = true;
			while (!q.isEmpty()) {
				int qSize = q.size();
				for (int j = 0; j < qSize; j++) {
					int cur = q.poll();
					int next;
					next = func_9019_D(cur);
					if (!visited[next]) {
						visited[next] = true;
						cmd[next] = 'D';
						parent[next] = cur;
						q.add(next);
					}
					next = func_9019_S(cur);
					if (!visited[next]) {
						visited[next] = true;
						cmd[next] = 'S';
						parent[next] = cur;
						q.add(next);
					}
					next = func_9019_L(cur);
					if (!visited[next]) {
						visited[next] = true;
						cmd[next] = 'L';
						parent[next] = cur;
						q.add(next);
					}
					next = func_9019_R(cur);
					if (!visited[next]) {
						visited[next] = true;
						cmd[next] = 'R';
						parent[next] = cur;
						q.add(next);
					}
				}
			}
			StringBuilder result = new StringBuilder();
			int cur = b;
			while(cur != a) {
				result.append(cmd[cur]);
				cur = parent[cur];
			}
			sb.append(result.reverse()).append('\n');
		}
		bw.write(sb.toString());
	}
	static int func_9019_D(int n) {
		n *= 2;
		if (n > 9999)
			return n % 10000;
		return n;
	}
	static int func_9019_S(int n) {
		n--;
		if (n == -1)
			return 9999;
		return n;
	}
	static int func_9019_L(int n) {
		int tmp = n / 1000;
		n = (n - (tmp * 1000)) * 10 + tmp;
		return n;
	}
	static int func_9019_R(int n) {
		int tmp = n % 10;
		n = n / 10 + 1000 * tmp;
		return n;
	}
}