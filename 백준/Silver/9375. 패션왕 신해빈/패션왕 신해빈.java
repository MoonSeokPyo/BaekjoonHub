import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9375();
		
		br.close();
		bw.close();
	}
	
	static void func_9375() throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String category = st.nextToken();
				map.put(category, map.getOrDefault(category, 0) + 1);
			}
			int cnt = 1;
			for (Integer value : map.values())
				cnt *= (value + 1);
			sb.append(cnt - 1).append('\n');
		}
		bw.write(sb.toString());
	}
}