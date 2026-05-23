import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_26502();
		
		br.close();
		bw.close();
	}
	
	static void func_26502() throws Exception {
		StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testcase; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][2];
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			sb.append(func_26502_solve(arr, new int[3][2], 0, n, 0)).append('\n');
		}
		bw.write(sb.toString());
	}
	static int func_26502_solve(int[][] arr, int[][] choice, int idx, int n, int depth) {
		if (idx == 3) {
			Set<Integer> ySet = new HashSet<>();
			Set<Integer> xSet = new HashSet<>();
			int minY = Integer.MAX_VALUE;
			int maxY = Integer.MIN_VALUE;
			int minX = Integer.MAX_VALUE;
			int maxX = Integer.MIN_VALUE;
			for (int i = 0; i < 3; i++) {
				ySet.add(choice[i][0]);
				xSet.add(choice[i][1]);
				minY = Math.min(minY, choice[i][0]);
				maxY = Math.max(maxY, choice[i][0]);
				minX = Math.min(minX, choice[i][1]);
				maxX = Math.max(maxX, choice[i][1]);
			}
			if (ySet.size() == 2 && xSet.size() == 2)
				return (maxY - minY) * (maxX - minX);
			return 0;
		}
		if (depth == n)
			return 0;
		
		int max = 0;
		max = Math.max(max, func_26502_solve(arr, choice, idx, n, depth + 1));
		if (idx < 3) {
			choice[idx][0] = arr[depth][0];
			choice[idx][1] = arr[depth][1];
			max = Math.max(max, func_26502_solve(arr, choice, idx + 1, n, depth + 1));
		}
		return max;
	}
}