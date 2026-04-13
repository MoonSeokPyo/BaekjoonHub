import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15666();
		
		br.close();
		bw.close();
	}
	
	static void func_15666() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Set<Integer> set = new TreeSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(st.nextToken());
			set.add(input);
		}
		int[] arr = new int[set.size()];
		int idx = 0;
		for (int num : set)
			arr[idx++] = num;
		StringBuilder sb = new StringBuilder();
		func_15666_solve(sb, arr, new int[m], m, 0, 0);
		bw.write(sb.toString());
	}
	static void func_15666_solve(StringBuilder sb, int[] arr, int[] memory, int m, int head, int depth) {
		if (depth == m) {
			for (int i = 0; i < m; i++)
				sb.append(memory[i]).append(' ');
			sb.append('\n');
			return;
		}
		for (int i = head; i < arr.length; i++) {
			memory[depth] = arr[i];
			func_15666_solve(sb, arr, memory, m, i, depth + 1);
		}
	}
}