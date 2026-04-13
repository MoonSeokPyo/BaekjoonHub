import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10953();
		
		br.close();
		bw.close();
	}
	static void func_10953() throws Exception {
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
		}
	}
}