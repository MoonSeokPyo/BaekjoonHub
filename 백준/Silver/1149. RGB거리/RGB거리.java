import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1149();
		
		br.close();
		bw.close();
	}
	
	static void func_1149() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[][] color = new int[n + 1][3 + 1];
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 3; j++)
				color[i][j] = Integer.parseInt(st.nextToken());
		}
		int[][] dp = new int[n + 1][3 + 1];
		dp[1][1] = color[1][1];
		dp[1][2] = color[1][2];
		dp[1][3] = color[1][3];
		for (int i = 2; i <= n; i++) {
			dp[i][1] = color[i][1] + Math.min(dp[i - 1][2], dp[i - 1][3]);
			dp[i][2] = color[i][2] + Math.min(dp[i - 1][1], dp[i - 1][3]);
			dp[i][3] = color[i][3] + Math.min(dp[i - 1][1], dp[i - 1][2]);
		}
		bw.write(Math.min(dp[n][1], Math.min(dp[n][2], dp[n][3])) + "");
    }
}