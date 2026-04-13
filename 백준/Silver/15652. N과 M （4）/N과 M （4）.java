import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15652();
		
		br.close();
		bw.close();
	}
	static void func_15652() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[M];
		func_15652_answer(N, M, 0, 1, arr);
	}
	static void func_15652_answer(int n, int m, int cnt, int num, int[] arr) throws Exception {
		if (cnt == m) {
			for (int i : arr) {
				bw.write(i + " ");
			}
			bw.newLine();
			return;
		}
		for (int i = num; i <= n; i++) {
			arr[cnt] = i;
			func_15652_answer(n, m, cnt + 1, i, arr);
		}
	}
}