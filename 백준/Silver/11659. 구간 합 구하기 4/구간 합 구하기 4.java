import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11659();
		
		br.close();
		bw.close();
	}
	
	static void func_11659() throws Exception {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = dp[i - 1] + arr[i];
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int head = Integer.parseInt(st.nextToken());
			int tail = Integer.parseInt(st.nextToken());
			sb.append(dp[tail] - dp[head - 1]).append('\n');
		}
		bw.write(sb.toString());
	}
}