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
			
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < N; i++) {
				int time = Integer.parseInt(st.nextToken());
				map.put(time, map.getOrDefault(time, 0) + 1);
			}
			boolean result = true;
			int cnt = 0;
			for (int time : map.keySet()) {
				cnt += map.get(time);
				int bread = (time / M) * K;
				if (cnt > bread) {
					result = false;
					break;
				}
			}
			
			sb.append('#').append(tc).append(' ').append(result ? "Possible" : "Impossible").append('\n');
		}
		bw.write(sb.toString());
	}
}