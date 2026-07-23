import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		func_1860();
		
		br.close();
		bw.close();
	}
	
	static void func_1860() throws Exception {
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			int[] t = new int[N];
			for (int i = 0; i < N; i++) {
				t[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(t);
			boolean result = true;
			for (int i = 0; i < N; i++) {
				int bread = (t[i] / M) * K;
				if (bread < i + 1) {
					result = false;
					break;
				}
			}
			
			sb.append('#').append(tc).append(' ').append(result ? "Possible" : "Impossible").append('\n');
		}
		bw.write(sb.toString());
	}
}