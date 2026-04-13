import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9095();
		
		br.close();
		bw.close();
	}
	static void func_9095() throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int num = Integer.parseInt(br.readLine());
			int[] cnt = new int[1];
			func_9095_cnt(num, 0, cnt);
			sb.append(cnt[0]).append('\n');
		}
		bw.write(sb.toString());
	}
	static void func_9095_cnt(int num, int sum, int[] cnt) {
		if (sum == num) {
			cnt[0]++;
			return;
		}
		for (int i = 3; i >= 1; i--) {
			if (sum + i <= num)
				func_9095_cnt(num, sum + i, cnt);
		}
	}
}