import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1931();
		
		br.close();
		bw.close();
	}
	
	static void func_1931() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[][] time = new int[n][2];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time, (a, b) -> {
			if (a[1] == b[1]) {
				return a[0] - b[0];
			}
			return a[1] - b[1];
		});
		
		int cnt = 0;
		int end = 0;
		for (int i = 0; i < n; i++) {
			if (time[i][0] >= end) {
				end = time[i][1];
				cnt++;
			}
		}
		bw.write(cnt + "");
	}
}