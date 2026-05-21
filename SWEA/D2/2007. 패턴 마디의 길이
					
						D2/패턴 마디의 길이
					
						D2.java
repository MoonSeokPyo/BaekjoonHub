import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_2007();
		
		br.close();
		bw.close();
	}
	
	static void func_2007() throws Exception {
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			String input = br.readLine();
			StringBuilder word = new StringBuilder();
			for (int i = 0; i < 10; i++) {
				boolean isValid = true;
				word.append(input.charAt(i));
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) != input.charAt(i + 1 + j)) {
						isValid = false;
						break;
					}
				}
				if (isValid)
					break;
			}
			sb.append('#').append(t).append(' ').append(word.length()).append('\n');
		}
		bw.write(sb.toString());
	}
}