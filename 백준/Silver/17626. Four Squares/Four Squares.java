import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_17626();
		
		br.close();
		bw.close();
	}
	
	static void func_17626() throws Exception {
	    int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			int min = 5;
			for (int j = 1; j * j <= i; j++) {
				min = Math.min(min, dp[i - j * j]);
			}
			dp[i] = min + 1;
		}
		bw.write(dp[n] + "");
    }
}