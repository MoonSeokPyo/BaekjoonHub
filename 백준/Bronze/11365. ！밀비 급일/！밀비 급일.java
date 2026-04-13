import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11365();
		
		br.close();
		bw.close();
	}
	
	static void func_11365() throws Exception {
		String str = br.readLine();
		if (str.equals("END")) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);
		}
		sb.append('\n');
		bw.write(sb.toString());
		func_11365();
	}
}