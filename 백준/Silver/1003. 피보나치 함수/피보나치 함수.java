import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1003();
		
		br.close();
		bw.close();
	}
	static void func_1003() throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] cnt = new int[2];
		for (int i = 0; i < t; i++) {
			int num = Integer.parseInt(br.readLine());
			cnt[0] = cnt[1] = 0;
			func_1003_fibonacci(num, cnt);
			sb.append(cnt[0]).append(' ').append(cnt[1]).append('\n');
		}
		bw.write(sb.toString());
	}
	static void func_1003_fibonacci(int n, int[] cnt) {
		if (n == 0) {
			cnt[0] = 1;
			return;
		} else if (n == 1){
			cnt[1] = 1;
			return;
		}
		int[] cnt_1  = new int[2], cnt_2 = new int[2];
		cnt_1[0] = cnt_2[1] = 1;
		for (int i = 2; i <= n; i++) {
			cnt[0] = cnt_1[0] + cnt_2[0];
			cnt[1] = cnt_1[1] + cnt_2[1];
			cnt_1[0] = cnt_2[0];
			cnt_1[1] = cnt_2[1];
			cnt_2[0] = cnt[0];
			cnt_2[1] = cnt[1];
		}
	}
}