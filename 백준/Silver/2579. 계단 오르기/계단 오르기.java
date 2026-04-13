import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2579();
		
		br.close();
		bw.close();
	}
	static void func_2579() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] dp = new int[n + 1];
		
		dp[1] = arr[1];
		if (n >= 2)
			dp[2] = dp[1] + arr[2];
		for (int i = 3; i <= n; i++) {
			int a = dp[i - 2] + arr[i];
			int b = dp[i - 3] + arr[i - 1] + arr[i];
			dp[i] = a >= b ? a : b;
		}
		bw.write(dp[n] + "");
	}
}