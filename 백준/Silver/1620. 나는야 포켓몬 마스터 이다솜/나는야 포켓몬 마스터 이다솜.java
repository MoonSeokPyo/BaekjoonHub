import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1620();
		
		br.close();
		bw.close();
	}
	static void func_1620() throws Exception {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		TreeMap<String, Integer> pokemon = new TreeMap<>();
		TreeMap<Integer, String> number = new TreeMap<>(); 
		for (int i = 1; i <= n; i++) {
			String name = br.readLine();
			pokemon.put(name, i);
			number.put(i, name);
		}
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			try {
				int num = Integer.parseInt(str);
				sb.append(number.get(num)).append('\n');
			} catch (Exception e) {
				// TODO: handle exception
				sb.append(pokemon.get(str)).append('\n');
			}
		}
		
		bw.write(sb.toString());
	}
}