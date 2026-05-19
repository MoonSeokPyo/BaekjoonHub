import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1225();
		
		br.close();
		bw.close();
	}
	
	static void func_1225() throws Exception {
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new ArrayDeque<>();
		for (int t = 1; t <= 10; t++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 8; i++)
				q.add(Integer.parseInt(st.nextToken()));
			
			loop:while (true) {
				for (int i = 1; i <= 5; i++) {
					int tmp = q.poll() - i;
					if (tmp <= 0) {
						q.add(0);
						break loop;
					}
					q.add(tmp);
				}
			}
			sb.append('#').append(t).append(' ');
			while(!q.isEmpty()) {
				sb.append(q.poll()).append(' ');
			}
			sb.append('\n');
			q.clear();
		}
		bw.write(sb.toString());
	}
}