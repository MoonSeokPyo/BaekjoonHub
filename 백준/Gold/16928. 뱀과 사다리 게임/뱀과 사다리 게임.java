import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_16928();
		
		br.close();
		bw.close();
	}
	
	static void func_16928() throws Exception {
		int[] arr = new int[101];
		int[] go = new int[101];
		for (int i = 0; i <= 100; i++)
			go[i] = i;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			go[x] = y;
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			go[u] = v;
		}
		int cnt = 0;
		Queue<Integer> q = new ArrayDeque();
		q.add(1);
		while(arr[100] == 0) {
			cnt++;
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int cur = q.poll();
				for (int j = 1; j <= 6; j++) {
					if (cur + j <= 100) {
						int next = go[cur + j];
						if (arr[next] == 0) {
							arr[next] = cnt;
							q.add(next);
						}
					} else
						break;
				}
			}
		}
		bw.write(arr[100] + "");
	}
}