import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11047();
		
		br.close();
		bw.close();
	}
	static void func_11047() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] coin = new int[n];
		for (int i = 0; i < n; i++)
			coin[i] = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = n - 1; i >= 0; i--) {
			while (coin[i] <= m) {
				m -= coin[i];
				cnt++;
			}
			if (m <= 0)
				break;
		}
		bw.write(cnt + "");
	}
}