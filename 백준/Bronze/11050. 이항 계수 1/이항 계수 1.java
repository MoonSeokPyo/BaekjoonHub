import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11050();
		
		br.close();
		bw.close();
	}
	
	static void func_11050() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		int result, a = 1, b = 1;
		for (int i = 1; i <= N - K; i++) {
			b *= i;
		}
		for (int i = K + 1; i <= N; i++) {
			a *= i;
		}
		result = a / b;
		bw.write(result + "");
	}
}