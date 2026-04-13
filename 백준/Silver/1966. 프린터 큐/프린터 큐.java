import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1966();
		
		br.close();
		bw.close();
	}
	static void func_1966() throws Exception {
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int n, m, weight, cnt;
		Deque<Integer> que = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			cnt = 0;
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken()); 
				que.add(num);
				if (j == m) {
					weight = num;
				}
			}
			while (true) {
				if (func_1966_ishigh(que)) {
					que.removeFirst();
					cnt++;
					if (m == 0)
						break;
					else
						m--;
				} else {
					que.addLast(que.removeFirst());
					if (m == 0)
						m = que.size() - 1;
					else
						m--;
				}
			}
			sb.append(cnt).append('\n');
			que.clear();
		}
		bw.write(sb.toString());
	}
    static boolean func_1966_ishigh(Deque<Integer> que) {
		int num = que.getFirst();
		for (Integer i : que) {
			if (i > num)
				return false;
		}
		return true;
	}
}