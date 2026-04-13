import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1929();
		
		br.close();
		bw.close();
	}
	static void func_1929() throws Exception {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean[] num = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			if (num[i])
				continue;
			if (i >= m)
				sb.append(i).append('\n');
			for (int j = i + i; j < n + 1; j += i)
				num[j] = true;
		}
		bw.write(sb.toString());
	}
}