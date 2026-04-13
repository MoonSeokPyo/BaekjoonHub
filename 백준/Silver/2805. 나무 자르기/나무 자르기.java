import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2805();
		
		br.close();
		bw.close();
	}
	
	static void func_2805() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] trees = new int[n];
		int max = -1;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
			if (trees[i] > max)
				max = trees[i];
		}
		bw.write(func_2805_solve(trees, m, 0, max) + "");
	}
	static int func_2805_solve(int[] trees, int m, int left, int right) {
		int h = 0;
		while(left <= right) {
			int mid = (left + right) / 2;
			long length = func_2805_length(trees, mid);
			if (length < m)
				right = mid - 1;
			else if (length >= m) {
				left = mid + 1;
				h = mid;
			}
		}
		return h;
	}
	static long func_2805_length(int[] trees, int h) {
		long sum = 0L;
		for (int i = 0; i < trees.length; i++) {
			int cut = trees[i] - h;
			if (cut > 0)
				sum += cut;
		}
		return sum;
	}
}