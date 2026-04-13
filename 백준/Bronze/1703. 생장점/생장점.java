import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1703();
		
		br.close();
		bw.close();
	}
	
	static void func_1703() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		if (a == 0)
			return;
		int cnt = 1;
		for (int i = 0; i < a; i++) {
			cnt *= Integer.parseInt(st.nextToken());
			cnt -= Integer.parseInt(st.nextToken());
		}
		bw.write(cnt + "\n");
		func_1703();
	}
}