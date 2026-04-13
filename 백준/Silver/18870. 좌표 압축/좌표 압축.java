import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_18870();
		
		br.close();
		bw.close();
	}
	
	static void func_18870() throws Exception {
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> x = new HashMap<>();
		int[] arr = new int[n];
		int[] arr_sort = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = arr_sort[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr_sort);
		
		int cnt = 0;
		for (int num : arr_sort)
			if (!x.containsKey(num))
				x.put(num, cnt++);

		for (int num : arr)
			sb.append(x.get(num)).append(' ');
		bw.write(sb.toString());
	}
}