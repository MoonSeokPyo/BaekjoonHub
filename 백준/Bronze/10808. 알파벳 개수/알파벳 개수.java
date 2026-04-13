import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10808();
		
		br.close();
		bw.close();
	}
	
	static void func_10808() throws Exception {
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] cnt = new int['z' - 'a' + 1];
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < cnt.length; i++) {
			sb.append(cnt[i]).append(' ');
		}
		bw.write(sb.toString());
	}
}