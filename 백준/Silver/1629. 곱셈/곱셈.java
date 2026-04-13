import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1629();
		
		br.close();
		bw.close();
	}
	
	static void func_1629() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		bw.write(func_1629_solve(a, b, c) + "");
	}
	static long func_1629_solve(int a, int b, int c) {
		if (b == 1) {
			return a % c;
		}
		if (b % 2 == 0) {
			long num = func_1629_solve(a, b / 2, c);
			return (num * num) % c;
		} else {
			return (func_1629_solve(a, b / 2, c) * func_1629_solve(a, b / 2 + 1, c)) % c;
		}
	}
}