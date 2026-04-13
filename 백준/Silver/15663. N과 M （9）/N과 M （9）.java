import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15663();
		
		br.close();
		bw.close();
	}
	
	static void func_15663() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map <Integer, Integer> map = new TreeMap<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(st.nextToken());
			map.put(input, map.getOrDefault(input, 0) + 1);
		}
		StringBuilder sb = new StringBuilder();
		func_15663_solve(sb, map, new int[m], n, m, 0);
		bw.write(sb.toString());
	}
	static void func_15663_solve(StringBuilder sb, Map <Integer,Integer> map, int[] arr, int n, int m, int depth) {
		if(depth == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (Entry<Integer, Integer> e: map.entrySet()) {
			int num = e.getKey();
			int cnt = e.getValue();
			if (cnt > 0) {
				e.setValue(cnt - 1);
				arr[depth] = num;
				func_15663_solve(sb, map, arr, n, m, depth + 1);
				e.setValue(cnt);
			}
		}
	}
}