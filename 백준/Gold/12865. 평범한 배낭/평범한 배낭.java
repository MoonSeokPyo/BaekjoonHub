import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_12865();
		
		br.close();
		bw.close();
	}
	
	static void func_12865() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] w = new int[n + 1];
		int[] v = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		int[] dp = new int[k + 1];
		for (int i = 1; i <= n; i++)
			for (int j = k; j - w[i] >= 0; j--)
				dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
		bw.write(dp[k] + "");
	}
}