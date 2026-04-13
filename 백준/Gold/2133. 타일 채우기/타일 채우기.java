import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2133();
		
		br.close();
		bw.close();
	}
	
	static void func_2133() throws Exception {
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long [30 + 1];
		dp[2] = 3;
        int tmp = 2;
		for (int i = 4; i <= 30; i += 2) {
			dp[i] = dp[i - 2] * dp[2] + tmp;
			tmp += dp[i - 2] * 2;
		}
		bw.write(dp[n] + "");
	}
}