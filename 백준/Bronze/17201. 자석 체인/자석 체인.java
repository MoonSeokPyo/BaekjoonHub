import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_17201();
		
		br.close();
		bw.close();
	}
	
	static void func_17201() throws Exception {
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		char init = input.charAt(0);
		for (int i = 2; i < 2 * n; i += 2) {
			if (input.charAt(i) != init) {
				bw.write("No");
				return;
			}
		}
		bw.write("Yes");
	}
}