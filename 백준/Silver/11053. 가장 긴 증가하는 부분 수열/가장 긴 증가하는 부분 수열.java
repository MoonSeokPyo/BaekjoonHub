import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11053();
		
		br.close();
		bw.close();
	}
	
	static void func_11053() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		int[] dp = new int[n];
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			int max = 1;
			for (int j = 0; j < i; j++)
				if (arr[i] > arr[j])
					max = Math.max(max, dp[j] + 1);
			dp[i] = max;
		}
		int max = 0;
		for (int i = 0; i < n; i++)
			max = Math.max(max, dp[i]);
		bw.write(max + "");
	}
}