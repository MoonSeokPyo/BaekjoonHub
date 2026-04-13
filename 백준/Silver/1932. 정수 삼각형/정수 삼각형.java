import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1932();
		
		br.close();
		bw.close();
	}
	
	static void func_1932() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			for (int j = 1; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()) + Math.max(arr[i - 1][j], arr[i - 1][j - 1]);
			}
		}
		int max = 0;
		for (int i = 1; i <= n; i++) {
			max = Math.max(max, arr[n][i]);
		}
		bw.write(max + "");
	}
}