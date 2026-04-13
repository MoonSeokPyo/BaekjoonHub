import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2577();
		
		br.close();
		bw.close();
	}
	static void func_2577() throws Exception {
		int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()), C = Integer.parseInt(br.readLine());
		int[] cnt = new int[10];
		String str = String.valueOf(A * B * C);
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i) - '0']++;
		}
		for (int i = 0; i < cnt.length; i++) {
			bw.write(cnt[i] + "");
			bw.newLine();
		}
	}
}