import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15232();
		
		br.close();
		bw.close();
	}
	
	static void func_15232() throws Exception {
		StringBuilder sb = new StringBuilder();
		int r = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		bw.write(sb.toString());
	}
}