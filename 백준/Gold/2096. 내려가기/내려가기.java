import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2096();
		
		br.close();
		bw.close();
	}
	
	static void func_2096() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		int[][] min = new int[n][3];
		int[][] max = new int[n][3];
		min[0][0] = max[0][0] = arr[0][0];
		min[0][1] = max[0][1] = arr[0][1];
		min[0][2] = max[0][2] = arr[0][2];
		for (int i = 1; i < n; i++) {
			min[i][0] = arr[i][0] + Math.min(min[i - 1][0], min[i - 1][1]);
			min[i][1] = arr[i][1] + Math.min(Math.min(min[i - 1][0], min[i - 1][1]), min[i - 1][2]);
			min[i][2] = arr[i][2] + Math.min(min[i - 1][1], min[i - 1][2]);
			
			max[i][0] = arr[i][0] + Math.max(max[i - 1][0], max[i - 1][1]);
			max[i][1] = arr[i][1] + Math.max(Math.max(max[i - 1][0], max[i - 1][1]), max[i - 1][2]);
			max[i][2] = arr[i][2] + Math.max(max[i - 1][1], max[i - 1][2]);
		}
		int resultMin = Math.min(Math.min(min[n - 1][0], min[n - 1][1]), min[n - 1][2]);
		int resultMax = Math.max(Math.max(max[n - 1][0], max[n - 1][1]), max[n - 1][2]);
		bw.write(resultMax + " " + resultMin);
	}
}