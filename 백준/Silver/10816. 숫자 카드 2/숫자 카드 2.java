import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10816();
		
		br.close();
		bw.close();
	}
	static void func_10816() throws Exception {
		int N = Integer.parseInt(br.readLine());
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
		}
		int M = Integer.parseInt(br.readLine());
		int[] arr_M = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr_M[i] = Integer.parseInt(st.nextToken());
		}
		int[] cnt = new int[M];
		for (int i = 0; i < M; i++) {
			if (treeMap.containsKey(arr_M[i])) {
				cnt[i] = treeMap.get(arr_M[i]);
			}
		}
		for (int i = 0; i < M; i++) {
			bw.write(cnt[i] + " ");
		}
    }
}