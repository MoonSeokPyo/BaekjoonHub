import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2448();
		
		br.close();
		bw.close();
	}
	static void func_2448() throws Exception {
		int n = Integer.parseInt(br.readLine());
		char[][] c = new char[n][2 * n];
		for (int i = 0; i < n; i++)
			Arrays.fill(c[i], ' ');
		func_2448_solve(c, n, 0, 0);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n; j++)
				sb.append(c[i][j]);
			sb.append('\n');
		}
		bw.write(sb.toString());
	}
	static void func_2448_solve(char[][] c, int n, int y, int x) {
		if (n == 3) {
			c[y][x + 2] = '*';
			c[y + 1][x + 1] = '*';
			c[y + 1][x + 3] = '*';
			for (int i = 0; i < 5; i++)
				c[y + 2][x + i] = '*';
			return;
		}
		func_2448_solve(c, n / 2, y, x + (n / 2));
		func_2448_solve(c, n / 2, y + (n / 2), x);
		func_2448_solve(c, n / 2, y + (n / 2), x + n);
	}
}