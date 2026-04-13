import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1463();
		
		br.close();
		bw.close();
	}
	static void func_1463() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}
		}
		bw.write(dp[n] + "");
    }
}