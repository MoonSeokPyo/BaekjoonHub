import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11727();
		
		br.close();
		bw.close();
	}
	
	static void func_11727() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int [1001];
		dp[1] = 1;
		if (n >= 2)
			dp[2] = 3;
		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
		}
		bw.write(dp[n] + "");
	}
}