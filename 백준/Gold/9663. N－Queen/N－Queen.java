import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9663();
		
		br.close();
		bw.close();
	}
	
	static void func_9663() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int cnt = func_9663_solve(arr, 0, n);
		bw.write(cnt + "");
	}
	static int func_9663_solve(int[] arr, int depth, int n) {
		if (depth == n)
			return 1;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			arr[depth] = i;
			boolean check = true;
			for (int j = 0; j < depth; j++) {
				if (arr[depth] == arr[j]) {
					check = false;
					break;
				}
				if (Math.abs(depth - j) == Math.abs(arr[depth] - arr[j])) {
					check = false;
					break;
				}
			}
			if (check)
				cnt += func_9663_solve(arr, depth + 1, n);
		}
		return cnt;
	}
}