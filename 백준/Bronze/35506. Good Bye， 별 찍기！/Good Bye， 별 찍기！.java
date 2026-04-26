import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_35506();
		
		br.close();
		bw.close();
	}
	
	static void func_35506() throws Exception {
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		char[][] arr = new char[2 * n][4 * n + 2];
		for (int i = 0; i < 2 * n; i++)
			Arrays.fill(arr[i], ' ');
		for (int i = 0; i < 2 * n; i++)
			arr[2 * n - 1 - i][i] = '*';
		int idx = 0;
		for (int i = 2 * n + 1; i < 3 * n + 1; i++) {
			arr[n - 1 - idx][i] = '*';
			arr[n + idx][i] = '*';
			idx++;
		}
		idx = 0;
		for (int i = 3 * n + 2; i < 4 * n + 2; i++) {
			arr[idx][i] = '*';
			arr[2 * n - 1 - idx][i] = '*';
			idx++;
		}
		for (int i = 0; i < 2 * n; i++) {
			for (int j = 0; j < 4 * n + 2; j++)
				sb.append(arr[i][j]);
			sb.append('\n');
		}
		bw.write(sb.toString());
	}
}