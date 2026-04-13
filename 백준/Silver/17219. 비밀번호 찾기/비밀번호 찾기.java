import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_17219();
		
		br.close();
		bw.close();
	}
	static void func_17219() throws Exception {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		TreeMap<String, String> treeMap = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			treeMap.put(st.nextToken(), st.nextToken());
		}
		
		for (int i = 0; i < m; i++)
			sb.append(treeMap.get(br.readLine())).append('\n');
		
		bw.write(sb.toString());
	}
}