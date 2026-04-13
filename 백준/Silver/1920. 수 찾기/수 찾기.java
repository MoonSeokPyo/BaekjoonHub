import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1920();
		
		br.close();
		bw.close();
	}
	static void func_1920() throws Exception {
		int N = Integer.parseInt(br.readLine());
		TreeSet<Integer> set_N = new TreeSet<>();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			set_N.add(Integer.parseInt(st.nextToken()));
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num >= set_N.first() && num <= set_N.last() && set_N.contains(num))
				sb.append(1).append('\n');
			else
				sb.append(0).append('\n');
		}
		bw.write(sb.toString());
	}
}