import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2630();
		
		br.close();
		bw.close();
	}
	static void func_2630() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		int[] cnt = new int[2];
		for (int i = 0; i < n; i++)
			arr[i] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		func_2630_solve(arr, cnt, 0, 0, n);
		bw.write(cnt[0] + "\n" + cnt[1]);
	}
	static void func_2630_solve(int[][] arr, int[] cnt, int y, int x, int length) {
		int color = arr[y][x];
		for (int i = y; i < y + length; i++) {
			for (int j = x; j < x + length; j++) {
				if (arr[i][j] != color) {
					func_2630_solve(arr, cnt, y, x, length / 2);
					func_2630_solve(arr, cnt, y, x + (length / 2), length / 2);
					func_2630_solve(arr, cnt, y + (length / 2), x, length / 2);
					func_2630_solve(arr, cnt, y + (length / 2), x + (length / 2), length / 2);
					return;
				}
			}
		}
		cnt[color]++;
	}
}