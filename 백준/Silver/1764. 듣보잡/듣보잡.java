import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1764();
		
		br.close();
		bw.close();
	}
	static void func_1764() throws Exception {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			String name = br.readLine();
			set.add(name);
		}
		int cnt = 0;
		TreeSet<String> result = new TreeSet<>();
		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			if (set.contains(name)) {
				cnt++;
				result.add(name);
			}
		}
		sb.append(cnt).append('\n');
		for (String name : result) {
			sb.append(name).append('\n');
		}
		bw.write(sb.toString());
	}
}