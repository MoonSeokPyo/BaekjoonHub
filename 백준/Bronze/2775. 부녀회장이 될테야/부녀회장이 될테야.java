import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2775();
		
		br.close();
		bw.close();
	}
	
	static void func_2775() throws Exception {
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];
		for (int i = 0; i < 15; i++) {
			arr[0][i] = i + 1;
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				int sum = 0;
				for (int k = 0; k <= j; k++) {
					sum += arr[i - 1][k];
				}
				arr[i][j] = sum;
			}
		}
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			bw.write(arr[k][n - 1] + "\n");
		}
	}
}