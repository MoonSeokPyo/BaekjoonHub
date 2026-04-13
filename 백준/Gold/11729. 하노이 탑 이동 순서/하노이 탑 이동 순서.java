import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11729();
		
		br.close();
		bw.close();
	}
	static void func_11729() throws Exception {
		int N = Integer.parseInt(br.readLine());
		int[] cnt = {0};
		StringBuilder sb = new StringBuilder();
		func_11729_hanoi(N, 1, 3, cnt, sb);
		bw.write(cnt[0] + "\n" + sb);
	}
	static void func_11729_hanoi(int n, int cur, int target, int[] cnt, StringBuilder sb) throws Exception {
		if (n == 0)
			return;
		func_11729_hanoi(n - 1, cur, 6 - (cur + target), cnt, sb);
		cnt[0]++;
		sb.append(cur).append(" ").append(target).append("\n");
		func_11729_hanoi(n - 1, 6 - (cur + target), target, cnt, sb);
	}
}