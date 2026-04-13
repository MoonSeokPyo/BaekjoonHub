import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11399();
		
		br.close();
		bw.close();
	}
	static void func_11399() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int cnt = 0;
		int sum = 0;
		for (Integer i : arr) {
			sum += i;
			cnt += sum;
		}
		bw.write(cnt + "");
	}
}