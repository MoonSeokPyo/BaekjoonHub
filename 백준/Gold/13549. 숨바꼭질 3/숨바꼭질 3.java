import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_13549();
		
		br.close();
		bw.close();
	}
	
	static void func_13549() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		if (n >= k) {
			bw.write(n - k + "");
			return;
		}
		
		int[] dp = new int[200_000 + 1];
		Arrays.fill(dp, 100_000);
		
		dp[n] = 0;
		for (int i = n - 1; i >= 0; i--) {
			dp[i] = dp[i + 1] + 1;
			dp[2 * i] = dp[i];
		}
		dp[n] = 0;
        dp[2 * n] = 0;
		for (int i = n + 1; i < 100_000; i++) {
			dp[i] = Math.min(dp[i], Math.min(dp[i - 1] + 1, dp[i + 1] + 1));
			dp[2 * i] = dp[i];
		}
		dp[100_000] = Math.min(dp[100_000], dp[99_999] + 1);
		bw.write(dp[k] + "");
	}
}