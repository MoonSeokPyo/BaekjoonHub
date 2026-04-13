import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1697();
		
		br.close();
		bw.close();
	}
	
	static void func_1697() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		if (n >= k) {
			bw.write(n - k + "");
			return;
		}
		int[] sec = new int[100002];
		
		for (int i = n / 2; i <= n; i++) {
			sec[i] = n - i;
			if (i * 2 <= 100000)
				sec[i * 2] = sec[i] + 1;
		}
		
		for (int i = n + 1; i <= k; i++) {
			if (sec[i] == 0)
				sec[i] = Math.min(sec[i - 1] + 1, sec[i + 1] + 1);
			else {
				sec[i] = Math.min(sec[i - 1] + 1, sec[i]);
			}
			
			if (i * 2 <= 100000)
				sec[i * 2] = sec[i] + 1;
		}
		
		
		bw.write(sec[k] + "");
	}
}