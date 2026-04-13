import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2742();
		
		br.close();
		bw.close();
	}
	static void func_2742() throws Exception {
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = n; i > 0; i--) {
			sb.append(i).append('\n');
		}
		bw.write(sb.toString());
	}
}