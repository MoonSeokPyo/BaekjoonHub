import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_18111();
		
		br.close();
		bw.close();
	}
	
	static void func_18111() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] ground = new int[n * m];
		int[] h = new int[257];
		int height = 0;
		int time = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				ground[i * m + j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int length = ground.length;
		for (int i = 0; i <= 256; i++) {
			int t = 0;
			int inventory = b;
			for (int j = 0; j < length; j++) {
				if (i < ground[j]) {
					t += 2 * (ground[j] - i);
					inventory += ground[j] - i;
				} else {
					t += i - ground[j];
					inventory -= i - ground[j];
				}
			}
			if (inventory >= 0 && t <= time) {
				height = i;
				time = t;
			}
		}
		bw.write(time + " " + height);
	}
}