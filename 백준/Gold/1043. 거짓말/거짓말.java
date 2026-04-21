import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1043();
		
		br.close();
		bw.close();
	}
	
	static void func_1043() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = m;
		boolean[] know = new boolean[n + 1];
		st = new StringTokenizer(br.readLine());
		int input = Integer.parseInt(st.nextToken());
		if (input > 0)
			for (int i = 0; i < input; i++)
				know[Integer.parseInt(st.nextToken())] = true;
		
		boolean[] result = new boolean[m];
		int[][] party = new int[m][];
		List<Integer>[] visited = new List[n + 1];
		for (int i = 1; i <= n; i++) {
			visited[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			input = Integer.parseInt(st.nextToken());
			party[i] = new int[input];
			for (int j = 0; j < input; j++) {
				int num = Integer.parseInt(st.nextToken());
				visited[num].add(i);
				party[i][j] = num;
			}
		}
		Queue<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < m; i++) {
			for (int num : party[i]) {
				if (know[num]) {
					q.add(i);
					result[i] = true;
					while (!q.isEmpty()) {
						int cur = q.poll();
						for (int visitedNum : party[cur]) {
							for (int visitedParty : visited[visitedNum]) {
								if (!result[visitedParty]) {
									result[visitedParty] = true;
									q.add(visitedParty);
								}
							}
						}
					}
				}
			}
		}
		for (boolean bool : result)
			if (bool)
				cnt--;
		bw.write(cnt + "");
	}
}