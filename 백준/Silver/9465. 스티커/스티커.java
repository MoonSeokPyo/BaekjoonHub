import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9465();
		
		br.close();
		bw.close();
	}
	
	static void func_9465() throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[2][n + 1];
			for (int j = 0; j < 2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= n; k++)
					arr[j][k] = Integer.parseInt(st.nextToken());
			}
			int[][] dp = new int[2][n + 1];
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			for (int j = 2; j <= n; j++) {
				dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + arr[0][j];
				dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + arr[1][j];
			}
			sb.append(Math.max(dp[0][n], dp[1][n])).append('\n');
		}
		bw.write(sb.toString());
	}
}